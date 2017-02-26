package com.shaw.desktop.monitor;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

import com.shaw.desktop.monitor.mail.EmailAccountInfo;
import com.shaw.desktop.monitor.mail.MailSending;

/**
 * Unit test for simple App.
 */
public class MailSendTests {
	@Test
	public void sendTest() throws Exception {
		String myEmailAccount = "zf1208@126.com";
		String myEmailPassword = "xzf1208";
		String emailSender = "xiaozhengfeng";
		String myEmailSMTPHost = "smtp.126.com";
		String mySMTPPort = "25";
		String emailContent = "这是一封测试邮件，请无回复";
		String receiveMailAccount = "zf1208@126.com";
		String messageSubject = "测试邮件";
		EmailAccountInfo accountInfo = new EmailAccountInfo(myEmailAccount, myEmailPassword, emailSender,
				myEmailSMTPHost, mySMTPPort);
		MailSending sending = new MailSending(accountInfo, emailContent, emailSender, receiveMailAccount,
				messageSubject);
		Session session = sending.getEmailSession();
		MimeMessage message = sending.createMimeMessage(session, emailSender, emailContent, myEmailAccount,
				receiveMailAccount);
		sending.sendEmail(session, message);

	}
}
