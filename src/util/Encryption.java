package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {
	
	
	
	
	public static String encrypt(String data){
		 MessageDigest md;
		try {
			 md = MessageDigest.getInstance("MD5");
	         md.update(data.getBytes());
	         
	         
	         byte[] byteData  =  md.digest();
	         StringBuffer encryptedData = new StringBuffer();
	         for (int i = 0; i < byteData.length; i++) {
	         	encryptedData.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	         }
	  
			return encryptedData.toString();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;

	}

}
