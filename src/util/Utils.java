package util;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import ecole.pojo.Eleve;

public class Utils {
	public static <T> void jsonEncodeListRecords(HttpServletResponse response, List<T> list) throws IOException {
		try {
			// Convert Java Object to Json
			Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
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
			Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
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
	
	public static <T> void jsonEncodeOptions(HttpServletResponse response, List<T> list,String idField,String displayTextField) throws IOException {
		try {
			// Convert Java Object to Json
			List<Options> options=new ArrayList<Options>();
			for (T elem : list) {
				Options option=new Options();
				option.setValue((Integer)runGetter(idField, elem));
				option.setDisplayText((String)runGetter(displayTextField, elem));
				options.add(option);
			}
			
			Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
			JsonElement element = gson.toJsonTree(options,
					new TypeToken<List<Eleve>>() {
					}.getType());
			JsonArray jsonArray = element.getAsJsonArray();
			String listData = jsonArray.toString();

			// Return Json in the format required by jTable plugin
			String data = "{\"Result\":\"OK\",\"Options\":" + listData + "}";
			response.setContentType("application/json");
			response.setHeader("Cache-control", "no-cache, no-store");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
			response.getWriter().print(data);
			System.out.println(data);
		} catch (Exception ex) {
			String error = "{\"Result\":\"ERROR\",\"Message\":"
					+ ex.getStackTrace() + "}";
			response.getWriter().print(error);
			ex.printStackTrace();
		}
	}
	
	public static Object runGetter(String fieldName, Object o)
	{
	    // MZ: Find the correct method
	    for (Method method : o.getClass().getMethods())
	    {
	        if ((method.getName().startsWith("get")) && (method.getName().length() == (fieldName.length() + 3)))
	        {
	            if (method.getName().toLowerCase().endsWith(fieldName.toLowerCase()))
	            {
	                // MZ: Method found, run it
	                try
	                {
	                    return method.invoke(o);
	                }
	                catch (IllegalAccessException e)
	                {
	                    //Logger.fatal("Could not determine method: " + method.getName());
	                }
	                catch (InvocationTargetException e)
	                {
	                    //Logger.fatal("Could not determine method: " + method.getName());
	                }

	            }
	        }
	    }


	    return null;
	}
}
