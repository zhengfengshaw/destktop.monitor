package com.shaw.desktop.monitor.mysql;

public class MysqlConnection {
	private static String driver = "com.mysql.jdbc.Driver";
	private String url;
	private String username;
	private String password;

	public String getUrl() {
		return url;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
