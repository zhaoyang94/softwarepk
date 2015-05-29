

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class DictionaryFrom extends JFrame {
	
	private JTextArea interpretJTextArea; //单词解释显示区域
	private JTextField findEnglishjTextField; //单词输入框
	private JTextField findChinesejTextField; //汉语输入框
	private JTextArea chinsesjTextArea; //要查询的汉语释义显示区域
	private JTextField englishjTextField; //英语显示区域
	private JTextArea searchJTextArea; //汉语对应的英文单词显示区域
	//private ImageIcon icon;
	//private Image image;
	/**
	 * 主程序运行
	 * */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DictionaryFrom frame = new DictionaryFrom();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
		});
	}
	
	/**
	 * 程序运行界面初始化
	 * @throws Exception 
	 */
	public DictionaryFrom() throws Exception {
		super();
		final JFrame frame=new JFrame(); //定义程序主窗体
		setBounds(100, 100, 520, 560); //设置窗体边界
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//icon=new ImageIcon("src/beijing.jpg");
		//System.out.println(icon.getIconWidth());
		final JPanel panel = new JPanel(); //定义程序面板
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);
        //设置主面板显示内容元素
		final JLabel nameJlabel = new JLabel(); //词典名称
		nameJlabel.setText("个人电子词典");
		nameJlabel.setFont(new java.awt.Font("幼圆", 0, 24));
		nameJlabel.setBounds(110, 10, 202, 41);
		panel.add(nameJlabel);

		final JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(0, 66, 520, 560);
		//tabbedPane.setBackground(Color.WHITE);
		panel.add(tabbedPane);
		setTitle("电子词典");
		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		tabbedPane.addTab("添加", null, panel_1, null);

		final JLabel saveLabel = new JLabel("输入要添加的单词：");
		saveLabel.setBounds(10, 25, 120, 20);
		panel_1.add(saveLabel);

		englishjTextField = new JTextField();
		englishjTextField.setBounds(145, 25, 190, 25);
		panel_1.add(englishjTextField);

		final JLabel label = new JLabel();
		label.setText("该单词的解释为：");
		label.setBounds(10, 75, 120, 20);
		//label.setSize(arg0, arg1)
		panel_1.add(label);

		chinsesjTextArea = new JTextArea();
		chinsesjTextArea.setBounds(30, 120, 240, 220);
		//chinsesjTextField.setSelectionStart(0);
		panel_1.add(chinsesjTextArea);

		final JButton insertjButton = new JButton();
		insertjButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				insertjButtonActionPerformed(evt);
			}
		});
		insertjButton.setText("添加");
		insertjButton.setBounds(350, 25, 70, 25);
		panel_1.add(insertjButton);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("英译汉", null, panel_2, null);

		final JLabel label_1 = new JLabel();
		label_1.setText("输入要查询的单词：");
		label_1.setBounds(10, 25, 120, 20);
		panel_2.add(label_1);

		findEnglishjTextField = new JTextField();
		findEnglishjTextField.setBounds(145, 25, 190, 25);
		panel_2.add(findEnglishjTextField);  //添加至面板

		final JLabel label_2 = new JLabel();
		label_2.setText("该词的解释为：");
		label_2.setBounds(10, 75, 120, 20);
		panel_2.add(label_2);

		interpretJTextArea = new JTextArea();
		interpretJTextArea.setBounds(30, 130, 440, 460);
		panel_2.add(interpretJTextArea);

		final JButton interpretJButton = new JButton();
		interpretJButton.setText("查询");
		interpretJButton.setBounds(350, 25, 70, 25);
		panel_2.add(interpretJButton);
		
				interpretJButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				interpretJButtonActionPerformed(evt);
			}
		});

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("汉译英", null, panel_3, null);
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		final JLabel label_3 = new JLabel();
		label_3.setText("输入要查询的中文：");
		label_3.setBounds(10, 25, 120, 20);
		panel_3.add(label_3);
		
		findChinesejTextField = new JTextField();
		findChinesejTextField.setBounds(145, 25, 190, 25);
		panel_3.add(findChinesejTextField);
		
		final JLabel label_4 = new JLabel();
		label_4.setText("该词的翻译为：");
		label_4.setBounds(10, 75, 120, 20);
		panel_3.add(label_4);
		
	    searchJTextArea = new JTextArea();
		searchJTextArea.setBounds(30, 130, 440, 460);
		panel_3.add(searchJTextArea);
		
		JTextArea SearchJTextArea = new JTextArea();
		SearchJTextArea.setBounds(30, 130, 440, 460);
		panel_3.add(SearchJTextArea);
		
		final JButton SearchJButton = new JButton("查询");
		SearchJButton.setBounds(350, 25, 70, 25);
		panel_3.add(SearchJButton);
		
		SearchJButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SearchJButtonActionPerformed(evt);
			}
		});
	}
	

	/**
	 * 响应用户处理
	 * */
	private void interpretJButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (findEnglishjTextField.getText().equals("")) { // 如果用户没有指定要翻译的单词
			JOptionPane.showMessageDialog(this, "没有输入要翻译的单词", "警告",
					JOptionPane.WARNING_MESSAGE); // 给出提示信息
			return; // 退出程序
		} else {
			String english = findEnglishjTextField.getText(); // 获取用户输入的要翻译的单词
			FindDictionary findDictionary = new FindDictionary(); // 创建包含有查询指定数据表类对象
			Dictionary dictionary = findDictionary.findDictionary(english); // 调用查询某单词方法
			if (dictionary == null) { // 如果数据表中不包含该单词
				JOptionPane.showMessageDialog(this, "字典中没有包含该单词", "警告",
						JOptionPane.WARNING_MESSAGE); // 给出提示信息
				return;
			} else { // 数据表中包含有要查询的单词
				interpretJTextArea.setText(dictionary.getChinses()); // 将该单词的中文解释在文本框中显示
			}
		}
	}
	private void insertjButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (englishjTextField.getText().equals("")) {			//如果用户没有输入要添加的英文单词
			JOptionPane.showMessageDialog(this, "没有输入要添加的英文内容", "警告",
					JOptionPane.WARNING_MESSAGE);				//给出提示信息
			return;									//退出程序
		} else if (chinsesjTextArea.getText().equals("")) {	//如果用户没有输入该单词的中文翻译
			JOptionPane.showMessageDialog(this, "没有输入要添加的中文翻译", "警告",
					JOptionPane.WARNING_MESSAGE);				//给出提示信息
			return;
		} else {
			String english = englishjTextField.getText();		//获取用户输入的英文单词
			FindDictionary findDictionary = new FindDictionary();	//创建查询数据库类对象
			Dictionary dictionaryEnglish = findDictionary
					.findDictionary(english);					//调用按照用户输入的英文单词查询数据库方法
			if (dictionaryEnglish == null) {					//如果数据库中没有该单词
				Dictionary dictionary = new Dictionary();		//创建Java bean对象
				dictionary.setChinses(chinsesjTextArea.getText());	//设置Java Bean对象的中文属性
				dictionary.setEnglish(english);					//设置Java bean对象的英文属性
				InsertDictionary insertDictionary = new InsertDictionary();	//创建添加数据表类对象
				insertDictionary.insertDictionary(dictionary);		//调用添加数据表方法
				JOptionPane.showMessageDialog(this, "单词添加成功", "信息提示框",
						JOptionPane.WARNING_MESSAGE);				//给出添加成功提示
			} else {												//如果数据表中包含有用户要添加的单词
				JOptionPane.showMessageDialog(this, "该单词已经存在", "警告",
						JOptionPane.WARNING_MESSAGE);			//给出提示信息
			}
		}
	}

	private void SearchJButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		if (findChinesejTextField.getText().equals("")) { // 如果用户没有指定要翻译的中文
			JOptionPane.showMessageDialog(this, "没有输入要翻译的中文", "警告",
					JOptionPane.WARNING_MESSAGE); // 给出提示信息
			return; // 退出程序
		} else {
			String chinese = findChinesejTextField.getText(); // 获取用户输入的要翻译的中文
			FindDictionary findDictionary = new FindDictionary(); // 创建包含有查询指定数据表类对象
			Dictionary dictionary = findDictionary.findChDictionary(chinese); // 调用查询某单词方法
			if (dictionary == null) { // 如果数据表中不包含该单词
				JOptionPane.showMessageDialog(this, "字典中没有包含该单词", "警告",
						JOptionPane.WARNING_MESSAGE); // 给出提示信息
				return;
			} else {  //数据表中包含有要查询的单词
				searchJTextArea.setText(dictionary.getChinses()); // 将该单词的中文解释在文本框中显示
			}
		}
	}
}
