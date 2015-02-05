package com.sw.androidlistview.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.sw.androidlistview.entity.DataEntity;

public class DataUtil {
	 public static InputStream getStream(String path){
			try {
				HttpURLConnection conn = (HttpURLConnection) new URL(path).openConnection();
				conn.setConnectTimeout(5000);
				conn.setReadTimeout(5000);
				conn.setRequestMethod("GET");
				if(conn.getResponseCode() == 200){
					return conn.getInputStream();
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			 return null; 
		 }
		 public static String getString(InputStream is){
			StringBuffer sb = new StringBuffer();
			byte[] bt = new byte[2048];
			int len = 0;
			String str = null;
			try {
				while((len = is.read(bt)) != -1){
					sb.append(new String(bt, 0, len));
				}
				if(sb.toString().startsWith("\nfeff")){
					sb.toString().substring(1);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			 return sb.toString();
			 
		 }
		 public static DataEntity getEntity(String data){
			Gson gson = new Gson();
			DataEntity entity = gson.fromJson(data, DataEntity.class);
			System.out.println(entity);
		    return entity; 
		 }
}
