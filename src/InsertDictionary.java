

import java.sql.*;


public class InsertDictionary {
	GetConn getConn = new GetConn(); 			// �������ݿ����������
	Connection conn = getConn.getConnection(); 	// ��ȡ���ݿ�����
	// ���ֵ���������Ϣ
	public void insertDictionary(Dictionary dictionary) {
		String sql = "insert into tb_dictionary values (?,?,?)"; // ����������ӵ�SQL���
		PreparedStatement statement;
		try {
			statement = conn.prepareStatement(sql); 	
			// ʵ����PreparedStatement����
			statement.setString(1, null); 							// ����Ԥ����������
			statement.setString(2, dictionary.getChinses());
			statement.setString(3, dictionary.getEnglish());
			statement.executeUpdate(); 								// ִ��SQL���
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
