

import java.sql.*;

public class GetConn {
	public Connection conn = null; // 创建Connection对象
	// 获取数据库连接方法
	public Connection getConnection() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // 加载数据库驱动
			String url = "jdbc:mysql://localhost:3306/pk";
			String user = "root";
			String passWord = "1234";
			conn = DriverManager.getConnection(
					url, user, passWord);
			// getConnection()方法参数分别指定连接数据库的URL、用户名和密码
			if (conn != null) {
				System.out.println("数据库连接成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}// 异常处理
		return conn;// 返回Connection对象
	}
	// 程序主方法
	public static void main(String[] args) {
		GetConn getConn = new GetConn(); // 创建GetConn对象
		getConn.getConnection(); // 调用连接数据库方法
	}
}
