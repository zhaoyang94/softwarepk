

import java.sql.*;

public class GetConn {
	public Connection conn = null; // ����Connection����
	// ��ȡ���ݿ����ӷ���
	public Connection getConnection() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // �������ݿ�����
			String url = "jdbc:mysql://localhost:3306/pk";
			String user = "root";
			String passWord = "1234";
			conn = DriverManager.getConnection(
					url, user, passWord);
			// getConnection()���������ֱ�ָ���������ݿ��URL���û���������
			if (conn != null) {
				System.out.println("���ݿ����ӳɹ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}// �쳣����
		return conn;// ����Connection����
	}
	// ����������
	public static void main(String[] args) {
		GetConn getConn = new GetConn(); // ����GetConn����
		getConn.getConnection(); // �����������ݿⷽ��
	}
}
