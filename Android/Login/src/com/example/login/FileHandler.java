package com.example.login;

import java.io.File;
import java.io.FileOutputStream;

public class FileHandler {

	public Boolean SaveUserInfo(String username,String userpwd){
		File  dataFile=new File("/data/data/com.example.login/user.txt");
		String userinfo=username+"##"+userpwd;		
		try {
			FileOutputStream fileOutStream=new FileOutputStream(dataFile);
			fileOutStream.write(userinfo.getBytes());		
			fileOutStream.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
}
