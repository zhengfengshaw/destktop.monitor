package com.shaw.desktop.monitor;

import java.io.UnsupportedEncodingException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mysql.jdbc.Statement;
import com.shaw.desktop.monitor.mysql.MysqlConnection;

public class MysqlTests {

	String sql = "select  * from city;";

	@Test
	public void mysqlTests() throws ClassNotFoundException, UnsupportedEncodingException, SQLException {
		String url = "jdbc:mysql://127.0.0.1:3306/world";
		String user = "root";
		String password = "Huawei123";
		MysqlConnection mysqlConnection = new MysqlConnection();
		mysqlConnection.setUrl(url);
		;
		mysqlConnection.setUsername(user);
		mysqlConnection.setPassword(password);
		List<String> cityNames = getData(mysqlConnection);
		for (String cityName : cityNames) {
			System.out.println("NAME:" + cityName);
		}

	}

	public List<String> getData(MysqlConnection mysqlConnection)
			throws SQLException, ClassNotFoundException, UnsupportedEncodingException {
		// 加载驱动程序
		Class.forName(mysqlConnection.getDriver());

		// 连续数据库
		java.sql.Connection conn = DriverManager.getConnection(mysqlConnection.getUrl(), mysqlConnection.getUsername(),
				mysqlConnection.getPassword());

		if (!conn.isClosed())
			System.out.println("Succeeded connecting to the Database!");

		// statement用来执行SQL语句
		Statement statement = (Statement) conn.createStatement();

		// 结果集
		ResultSet rs = statement.executeQuery(sql);

		String name = null;
		List<String> cityNames = new ArrayList<String>();
		while (rs.next()) {

			// 选择sname这列数据
			name = rs.getString("Name");

			// 首先使用ISO-8859-1字符集将name解码为字节序列并将结果存储新的字节数组中。
			// 然后使用GB2312字符集解码指定的字节数组
			name = new String(name.getBytes("ISO-8859-1"), "GB2312");
			cityNames.add(name);
		}

		rs.close();
		conn.close();
		return cityNames;
	}
}
