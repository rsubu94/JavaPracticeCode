package com.camspay.poc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.RandomStringUtils;

import in.juspay.model.JuspayEnvironment;
import in.juspay.model.Order;

public class OrderMan {

	private static String apiKey = "74BD81A3875A4F53881C876771EE66CA";
	String fileContent = "";

	public String createOrder(String amount, String remarks) {

		try {

			LogMan.log("Processing " + amount + " and " + remarks);

			JuspayEnvironment.withBaseUrl(JuspayEnvironment.SANDBOX_BASE_URL);
			JuspayEnvironment.withApiKey(apiKey);

			Map<String, Object> params = new LinkedHashMap();

			params.put("order_id", RandomStringUtils.randomAlphanumeric(5));
			params.put("amount", Float.parseFloat(amount));
			params.put("currency", "INR");
			params.put("customer_id", "guest_user_101");
			params.put("customer_email", "customer@gmail.com");
			params.put("customer_phone", "9841054276");
			params.put("product_id", "prod-141833");
			// params.put("return_url", "http://192.168.42.48:8080/poc/form.html");
			params.put("return_url", "https://www.camspay.in:8443/poc/form.html");
			params.put("description", remarks);

			params.put("billing_address_first_name", "ABC");
			params.put("billing_address_last_name", "DEF");
			params.put("billing_address_line1", "GHI Building");
			params.put("billing_address_line2", "JKL Temple Road");
			params.put("billing_address_line3", "8th Block, Koramangala");
			params.put("billing_address_city", "Bengaluru");
			params.put("billing_address_state", "Karnataka");
			params.put("billing_address_country", "India");
			params.put("billing_address_postal_code", "560095");
			params.put("billing_address_phone", "9841054276");
			params.put("billing_address_country_code_iso", "IND");

			params.put("shipping_address_first_name", "ABC");
			params.put("shipping_address_last_name", "DEF");
			params.put("shipping_address_line1", "GHI Building");
			params.put("shipping_address_line2", "JKL Temple Road");
			params.put("shipping_address_line3", "8th Block, Koramangala");
			params.put("shipping_address_city", "Bengaluru");
			params.put("shipping_address_state", "Karnataka");
			params.put("shipping_address_country", "India");
			params.put("shipping_address_postal_code", "560095");
			params.put("shipping_address_phone", "9841054276");
			params.put("shipping_address_country_code_iso", "IND");
			params.put("shipping_address_country", "India");

			Order order = Order.create(params);

			LogMan.log("Order Status : " + order.getStatus());
			LogMan.log("Order Status : " + order.getPaymentMethod());
			LogMan.log("Order Status : " + order.getPaymentMethodType());
			LogMan.log("Payment Link : " + order.getPaymentLinks().getWebLink());
			LogMan.log("iFrame Link : " + order.getPaymentLinks().getIframeLink());

			return Base64.encodeBase64String(order.getPaymentLinks().getIframeLink().getBytes());
		} catch (Exception ex) {
			LogMan.log(ex);
			return ex.getMessage();
		}
	}

	public void writeFile(Map<String, String> m) throws IOException {
		LogMan.log("Inside QueryString data file creation");

		Date date = new Date();
		String order_id = m.get("order_id");
		String fileName = "";
		String dateWiseOrders = "";
		String dateTime = "";
		String filePath = "";

		SimpleDateFormat dateWise = new SimpleDateFormat("dd-MM-yyyy");
		dateWiseOrders = dateWise.format(date);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		dateTime = dateFormat.format(date);

		fileName = order_id + "_" + dateTime + ".txt";

		filePath = System.getProperty("user.dir") + File.separator + "ORDER DETAILS" + File.separator + dateWiseOrders
				+ File.separator + order_id;
		File file = new File(filePath);

		if ((!file.isDirectory()) || (!file.exists())) {
			file.mkdirs();
		}

		FileWriter fr = new FileWriter(file.getAbsolutePath() + File.separator + fileName, true);

		BufferedWriter br = new BufferedWriter(fr);
		try {

			for (Map.Entry<String, String> pair : m.entrySet()) {

				br.write(pair.getKey() + " : " + pair.getValue());
				br.newLine();
			}
			LogMan.log("File created and the QueryString Data's are written");
		}

		catch (Exception e) {
			LogMan.log("Exception " + e);
			e.printStackTrace();
		} finally {
			br.close();
			fr.close();
			System.out.println("File Created!!");

		}
	}

	public void writeWebhookFile(String json, String order_id, String eventName, String transactionId)
			throws IOException {

		LogMan.log("Inside Webhook file creation");

		Date date = new Date();

		String fileName = "";
		String dateWiseOrders = "";

		String filePath = "";
		String headers = "****************** " + eventName + " for the Transcation ID - " + transactionId
				+ " ******************";

		SimpleDateFormat dateWise = new SimpleDateFormat("dd-MM-yyyy");
		dateWiseOrders = dateWise.format(date);

		fileName = order_id + ".json";

		filePath = System.getProperty("user.dir") + File.separator + "WEBHOOK ORDER DETAILS" + File.separator
				+ dateWiseOrders + File.separator + order_id;
		File file = new File(filePath);

		if ((!file.isDirectory()) || (!file.exists())) {
			file.mkdirs();
		}

		FileWriter fr = new FileWriter(file.getAbsolutePath() + File.separator + fileName, true);

		BufferedWriter br = new BufferedWriter(fr);
		try {

			br.write(headers);
			br.newLine();
			br.write(json);
			br.newLine();

		}

		catch (Exception e) {
			LogMan.log("Exception " + e);
			e.printStackTrace();
		} finally {
			br.close();
			fr.close();
			System.out.println("File Created");
			LogMan.log("File created and the JSON Data's are written");
		}
	}

	public String searchFile(File path, String fileName) {

		System.out.println("Inside Search FIle" + path);
		System.out.println("Inside Search fileName " + fileName);
		try {
			File[] files = path.listFiles();
			System.out.println("Fie length " + files.length);
			for (File f : files) {
				if (f.isDirectory()) { // this line weeds out other directories/folders

					System.out.println("Directory " + f);
					searchFile(f, fileName);
				} else {
					System.out.println(f.getAbsolutePath());
					fileContent = new String(Files.readAllBytes(Paths.get(f.getAbsolutePath())));
					// System.out.println("fileContent "+fileContent);

				}

			}
		} catch (Exception ex) {
			LogMan.log(ex);
			ex.printStackTrace();
		}

		// System.out.println("#########$$$$$$$$$$$***** filecon "+fileContent);
		return fileContent;
	}

}
