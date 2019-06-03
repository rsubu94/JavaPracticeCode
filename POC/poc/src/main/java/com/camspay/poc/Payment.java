package com.camspay.poc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.message.ObjectMessage;
import org.glassfish.jersey.media.multipart.FormDataParam;

import com.camspay.pojo.WebhookResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.owlike.genson.Genson;

@Path("{merchant}")
public class Payment {

	@POST
	@Path("pay")
	@Produces({ MediaType.TEXT_PLAIN })
	// ----Format of inputStr.................@Context HttpHeaders headers,
	public Response processPayment(@PathParam("merchant") String merchant, @FormDataParam("amount") String amount,
			@FormDataParam("remarks") String remarks) {

		Response response = null;

		String resp = (new OrderMan()).createOrder(amount, remarks);

		response = Response.ok().entity(resp).build();

		return response;
	}

	@POST
	@Path("webhook")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.TEXT_PLAIN })
	public Response getWebHook(@PathParam("merchant") String merchant, String json) throws IOException {

		LogMan.log("Call from juspay webhook");
		LogMan.log("inside webhook " + json);

		Response response = null;
		Gson gson = new Gson();

		WebhookResponse obj = gson.fromJson(json, WebhookResponse.class);

		String order_id = obj.getContent().getOrder().getOrder_id();
		String eventName = obj.getEvent_name();
		String transactionId = obj.getContent().getOrder().getTxn_id();

		LogMan.log(order_id);
		LogMan.log(eventName);

		new OrderMan().writeWebhookFile(json, order_id, eventName, transactionId);

		LogMan.log("Success");

		return response.ok().entity("Successfully Received").build();
	}

	@GET
	@Path("searchFile")
	@Consumes({ MediaType.TEXT_PLAIN })
	@Produces({ MediaType.TEXT_PLAIN })
	public Response Test(@PathParam("merchant") String merchant, @QueryParam("filename") String filename) {
		Response response = null;

		LogMan.log("OK " + filename);
		System.out.println("File NAme " + filename);
		File path = new File(System.getProperty("user.dir") + File.separator + "WEBHOOK ORDER DETAILS");
		String data = new OrderMan().searchFile(path, filename);
		LogMan.log("#################*********dtaa ****** " + data);
		response = Response.ok().status(200).entity(data).build();

		return response;

	}

	@POST
	@Path("queryString")
	public void saveData(@FormDataParam("queryString") String queryString) {

		LogMan.log("call made to save queryString data");

		try {
			URL url = new URL(queryString);

			Map<String, String> query_pairs = new LinkedHashMap<String, String>();
			String query = url.getQuery();
			String[] pairs = query.split("&");
			for (String pair : pairs) {
				int idx = pair.indexOf("=");
				query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"),
						URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
			}
			new OrderMan().writeFile(query_pairs);
		} catch (Exception e) {
			LogMan.log("Exception " + e);
			e.printStackTrace();
		}

	}

}
