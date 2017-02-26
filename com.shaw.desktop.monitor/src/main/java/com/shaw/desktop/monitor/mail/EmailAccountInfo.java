package com.shaw.desktop.monitor.mail;

/**
 * 发件人的 邮箱 和 密码（替换为自己的邮箱和密码） PS: 某些邮箱服务器为了增加邮箱本身密码的安全性，给 SMTP
 * 客户端设置了独立密码（有的邮箱称为“授权码”）, 对于开启了独立密码的邮箱, 这里的邮箱密码必需使用这个独立密码（授权码）。
 * 
 * @author shaw
 *
 */
public class EmailAccountInfo {
	private String myEmailAccount;

	private String myEmailPassword;
	private String emailSender;

	// 发件人邮箱的 SMTP 服务器地址, 必须准确, 不同邮件服务器地址不同, 一般(只是一般, 绝非绝对)格式为: smtp.xxx.com
	// 网易163邮箱的 SMTP 服务器地址为: smtp.163.com
	// 收件人邮箱（替换为自己知道的有效邮箱）

	private String myEmailSMTPHost;
	// = "smtp.126.com";
	private String smtpPort;

	public String getMyEmailAccount() {
		return myEmailAccount;
	}

	public EmailAccountInfo(String myEmailAccount, String myEmailPassword, String emailSender, String myEmailSMTPHost,
			String smtpPort) {
		this.myEmailAccount = myEmailAccount;
		this.myEmailPassword = myEmailPassword;
		this.emailSender = emailSender;
		this.myEmailSMTPHost = myEmailSMTPHost;
		this.smtpPort = smtpPort;
	}

	public void setMyEmailAccount(String myEmailAccount) {
		this.myEmailAccount = myEmailAccount;
	}

	public String getMyEmailPassword() {
		return myEmailPassword;
	}

	public void setMyEmailPassword(String myEmailPassword) {
		this.myEmailPassword = myEmailPassword;
	}

	public String getEmailSender() {
		return emailSender;
	}

	public void setEmailSender(String emailSender) {
		this.emailSender = emailSender;
	}

	public String getMyEmailSMTPHost() {
		return myEmailSMTPHost;
	}

	public void setMyEmailSMTPHost(String myEmailSMTPHost) {
		this.myEmailSMTPHost = myEmailSMTPHost;
	}

	public String getSmtpPort() {
		return smtpPort;
	}

	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}

}
