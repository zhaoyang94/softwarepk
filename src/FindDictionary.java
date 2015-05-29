
import java.sql.*;


public class FindDictionary {
	GetConn getConn = new GetConn(); // �������������ݿ����������
	Connection connection = getConn.getConnection(); // ��ȡ���ݿ�����
	// ��Ӣ�����ƣ���ѯ��Ϣ
	public Dictionary findDictionary(String english) { // �������ݿ��ѯ����
		Dictionary dictionary = null; // ���������ݱ��Ӧ�Ķ���
		String sql = "select * from tb_dictionary where english like '" + english
		+ "'"; // �������ݲ�ѯSQL���
		try {
			PreparedStatement statement = connection.prepareStatement(sql); // ����PreparedStatement����
			ResultSet rest = statement.executeQuery(); // ִ�в�ѯSQL��䣬��ȡ��ѯSQL�����
			while (rest.next()) { // ѭ��������ѯ�����
				dictionary = new Dictionary(); // ��������
				dictionary.setChinses(rest.getString("chinese")); // ��ȡ�����������
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dictionary;
	}
	public Dictionary findChDictionary(String chinese) { // �������ݿ��ѯ����
		Dictionary dictionary = null; // ���������ݱ��Ӧ�Ķ���
		String sql = "select * from tb_dictionary where chinese like '" + chinese
		+ "'"; // �������ݲ�ѯSQL���
		try {
			PreparedStatement statement = connection.prepareStatement(sql); // ����PreparedStatement����
			ResultSet rest = statement.executeQuery(); // ִ�в�ѯSQL��䣬��ȡ��ѯSQL�����
			while (rest.next()) { // ѭ��������ѯ�����
				dictionary = new Dictionary(); // ��������
				dictionary.setChinses(rest.getString("english")); // ��ȡ�����������
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dictionary;
	}
}
