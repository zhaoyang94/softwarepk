
import java.sql.*;


public class FindDictionary {
	GetConn getConn = new GetConn(); // 创建包含有数据库连接类对象
	Connection connection = getConn.getConnection(); // 获取数据库连接
	// 按英文名称，查询信息
	public Dictionary findDictionary(String english) { // 定义数据库查询方法
		Dictionary dictionary = null; // 创建与数据表对应的对象
		String sql = "select * from tb_dictionary where english like '" + english
		+ "'"; // 定义数据查询SQL语句
		try {
			PreparedStatement statement = connection.prepareStatement(sql); // 创建PreparedStatement对象
			ResultSet rest = statement.executeQuery(); // 执行查询SQL语句，获取查询SQL结果集
			while (rest.next()) { // 循环遍历查询结果集
				dictionary = new Dictionary(); // 创建对象
				dictionary.setChinses(rest.getString("chinese")); // 获取结果集中数据
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dictionary;
	}
	public Dictionary findChDictionary(String chinese) { // 定义数据库查询方法
		Dictionary dictionary = null; // 创建与数据表对应的对象
		String sql = "select * from tb_dictionary where chinese like '" + chinese
		+ "'"; // 定义数据查询SQL语句
		try {
			PreparedStatement statement = connection.prepareStatement(sql); // 创建PreparedStatement对象
			ResultSet rest = statement.executeQuery(); // 执行查询SQL语句，获取查询SQL结果集
			while (rest.next()) { // 循环遍历查询结果集
				dictionary = new Dictionary(); // 创建对象
				dictionary.setChinses(rest.getString("english")); // 获取结果集中数据
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dictionary;
	}
}
