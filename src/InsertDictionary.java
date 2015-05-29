

import java.sql.*;


public class InsertDictionary {
	GetConn getConn = new GetConn(); 			// 创建数据库连接类对象
	Connection conn = getConn.getConnection(); 	// 获取数据库连接
	// 向字典表中添加信息
	public void insertDictionary(Dictionary dictionary) {
		String sql = "insert into tb_dictionary values (?,?,?)"; // 定义数据添加的SQL语句
		PreparedStatement statement;
		try {
			statement = conn.prepareStatement(sql); 	
			// 实例化PreparedStatement对象
			statement.setString(1, null); 							// 设置预处理语句参数
			statement.setString(2, dictionary.getChinses());
			statement.setString(3, dictionary.getEnglish());
			statement.executeUpdate(); 								// 执行SQL语句
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
