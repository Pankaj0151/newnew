package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig() {
		File src = new File("C://Users//panka//eclipse-workspace//inetBankingV1//Configuration//Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String uname = pro.getProperty("username");
		return uname;
	}

	public String getPassword() {
		String PWD = pro.getProperty("password");
		return PWD;
	}

	public String getChromeBrowserPath() {
		String Cbrowserpath = pro.getProperty("chromepath");
		return Cbrowserpath;
	}


	public String getFirefoxBrowserPath() {
		String Fbrowserpath = pro.getProperty("firefoxpath");
		return Fbrowserpath;
	}

}