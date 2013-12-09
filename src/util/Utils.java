package util;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import ecole.pojo.Eleve;

public class Utils {
	public static <T> void jsonEncodeListRecords(HttpServletResponse response, List<T> list) throws IOException {
		try {
			// Convert Java Object to Json
			Gson gson = new Gson();
			JsonElement element = gson.toJsonTree(list,
					new TypeToken<List<Eleve>>() {
					}.getType());
			JsonArray jsonArray = element.getAsJsonArray();
			String listData = jsonArray.toString();

			// Return Json in the format required by jTable plugin
			listData = "{\"Result\":\"OK\",\"Records\":" + listData + "}";
			response.setContentType("application/json");
			response.setHeader("Cache-control", "no-cache, no-store");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
			response.getWriter().print(listData);
			System.out.println(listData);
		} catch (Exception ex) {
			String error = "{\"Result\":\"ERROR\",\"Message\":"
					+ ex.getStackTrace() + "}";
			response.getWriter().print(error);
			ex.printStackTrace();
		}
	}
	
	public static <T> void jsonEncodeRecord(HttpServletResponse response, T record) throws IOException {
		try {
			// Convert Java Object to Json
			Gson gson = new Gson();
			JsonElement element = gson.toJsonTree(record);
			JsonObject jsonObject = element.getAsJsonObject();
			String jsonRecord = jsonObject.toString();

			// Return Json in the format required by jTable plugin
			jsonRecord = "{\"Result\":\"OK\",\"Record\":" + jsonRecord + "}";
			response.setContentType("application/json");
			response.setHeader("Cache-control", "no-cache, no-store");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
			response.getWriter().print(jsonRecord);
			System.out.println(jsonRecord);
		} catch (Exception ex) {
			String error = "{\"Result\":\"ERROR\",\"Message\":"
					+ ex.getStackTrace() + "}";
			response.getWriter().print(error);
			ex.printStackTrace();
		}
	}
	
	public static <T> void jsonEncodeOK(HttpServletResponse response) throws IOException {
		try {
			// Return Json in the format required by jTable plugin
			String jsonOk = "{\"Result\":\"OK\"}";
			response.setContentType("application/json");
			response.setHeader("Cache-control", "no-cache, no-store");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
			response.getWriter().print(jsonOk);
			System.out.println(jsonOk);
		} catch (Exception ex) {
			String error = "{\"Result\":\"ERROR\",\"Message\":"
					+ ex.getStackTrace() + "}";
			response.getWriter().print(error);
			ex.printStackTrace();
		}
	}
}
