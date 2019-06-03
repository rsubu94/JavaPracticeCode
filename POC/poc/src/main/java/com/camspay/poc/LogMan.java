package com.camspay.poc;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;

public class LogMan {

	static Logger log = Logger.getLogger(LogMan.class.getName());

	private LogMan() {

	}

	public static void log(Object ex) {

		String msg = "";

		if (ex instanceof Exception) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);

			((Exception) ex).printStackTrace(pw);

			msg = sw.toString();

			log.error(msg);
		} else {
			if (ex instanceof String)
				msg = (String) ex;
			else {
				if (ex != null)
					msg = "Unknown object in logman : " + ex.getClass().getName();
			}

			log.info(msg);
		}

	}
}
