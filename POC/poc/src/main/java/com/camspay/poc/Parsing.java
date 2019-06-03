package com.camspay.poc;

import java.awt.ItemSelectable;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Parsing {

	public static void main(String[] args) throws IOException {

		String myUrl = "https://www.google.co.in/?order_id=8L8hq&status=CHARGED&status_id=21&signature=mgF5TQi1hZfzdrr%2FaEGnd1yRHbFNa3oGsjnoSoTvKjA%3D&signature_algorithm=HMAC-SHA256";

		Date date = new Date();
		String order_id = "o123234tyrg";
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
				+ File.separator + order_id ;
		File file = new File(filePath);
		
		if ((!file.isDirectory()) || (!file.exists())) {
			file.mkdirs();
		}

		FileWriter fr = new FileWriter(file.getAbsolutePath()+ File.separator+fileName, true);
		BufferedWriter br = new BufferedWriter(fr);

		try {
			URL url = new URL(myUrl);
			Map<String, String> m = splitQuery(url);
			// String filename=m.get("user_id");
			// Path path = Paths.get("c:/"+"test.txt");

			for (Map.Entry<String, String> pair : m.entrySet()) {

				br.write(pair.getKey() + " : " + pair.getValue());
				br.newLine();
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
			fr.close();
		}

	}

	public static Map<String, String> splitQuery(URL url) throws UnsupportedEncodingException {
		System.out.println(url);
		Map<String, String> query_pairs = new LinkedHashMap<String, String>();
		String query = url.getQuery();
		String[] pairs = query.split("&");
		for (String pair : pairs) {
			int idx = pair.indexOf("=");
			query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"),
					URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
		}

		return query_pairs;
	}

}
