

public class Dictionary {
	private int id; // 对应表中id字段
	private String english; // 对应表中英文信息字段
	private String chinses; // 对应表中文中信息字段
    //获得表中ID字段
	public int getId() {
		return id;
	}
    //设置ID字段
	public void setId(int id) {
		this.id = id;
	}
	//得到英文单词
	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getChinses() {
		return chinses;
	}

	public void setChinses(String chinses) {
		this.chinses = chinses;
	}

}
