

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
	
	private JTextArea interpretJTextArea; //���ʽ�����ʾ����
	private JTextField findEnglishjTextField; //���������
	private JTextField findChinesejTextField; //���������
	private JTextArea chinsesjTextArea; //Ҫ��ѯ�ĺ���������ʾ����
	private JTextField englishjTextField; //Ӣ����ʾ����
	private JTextArea searchJTextArea; //�����Ӧ��Ӣ�ĵ�����ʾ����
	//private ImageIcon icon;
	//private Image image;
	/**
	 * ����������
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
	 * �������н����ʼ��
	 * @throws Exception 
	 */
	public DictionaryFrom() throws Exception {
		super();
		final JFrame frame=new JFrame(); //�������������
		setBounds(100, 100, 520, 560); //���ô���߽�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//icon=new ImageIcon("src/beijing.jpg");
		//System.out.println(icon.getIconWidth());
		final JPanel panel = new JPanel(); //����������
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);
        //�����������ʾ����Ԫ��
		final JLabel nameJlabel = new JLabel(); //�ʵ�����
		nameJlabel.setText("���˵��Ӵʵ�");
		nameJlabel.setFont(new java.awt.Font("��Բ", 0, 24));
		nameJlabel.setBounds(110, 10, 202, 41);
		panel.add(nameJlabel);

		final JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(0, 66, 520, 560);
		//tabbedPane.setBackground(Color.WHITE);
		panel.add(tabbedPane);
		setTitle("���Ӵʵ�");
		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		tabbedPane.addTab("���", null, panel_1, null);

		final JLabel saveLabel = new JLabel("����Ҫ��ӵĵ��ʣ�");
		saveLabel.setBounds(10, 25, 120, 20);
		panel_1.add(saveLabel);

		englishjTextField = new JTextField();
		englishjTextField.setBounds(145, 25, 190, 25);
		panel_1.add(englishjTextField);

		final JLabel label = new JLabel();
		label.setText("�õ��ʵĽ���Ϊ��");
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
		insertjButton.setText("���");
		insertjButton.setBounds(350, 25, 70, 25);
		panel_1.add(insertjButton);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("Ӣ�뺺", null, panel_2, null);

		final JLabel label_1 = new JLabel();
		label_1.setText("����Ҫ��ѯ�ĵ��ʣ�");
		label_1.setBounds(10, 25, 120, 20);
		panel_2.add(label_1);

		findEnglishjTextField = new JTextField();
		findEnglishjTextField.setBounds(145, 25, 190, 25);
		panel_2.add(findEnglishjTextField);  //��������

		final JLabel label_2 = new JLabel();
		label_2.setText("�ôʵĽ���Ϊ��");
		label_2.setBounds(10, 75, 120, 20);
		panel_2.add(label_2);

		interpretJTextArea = new JTextArea();
		interpretJTextArea.setBounds(30, 130, 440, 460);
		panel_2.add(interpretJTextArea);

		final JButton interpretJButton = new JButton();
		interpretJButton.setText("��ѯ");
		interpretJButton.setBounds(350, 25, 70, 25);
		panel_2.add(interpretJButton);
		
				interpretJButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				interpretJButtonActionPerformed(evt);
			}
		});

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("����Ӣ", null, panel_3, null);
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		final JLabel label_3 = new JLabel();
		label_3.setText("����Ҫ��ѯ�����ģ�");
		label_3.setBounds(10, 25, 120, 20);
		panel_3.add(label_3);
		
		findChinesejTextField = new JTextField();
		findChinesejTextField.setBounds(145, 25, 190, 25);
		panel_3.add(findChinesejTextField);
		
		final JLabel label_4 = new JLabel();
		label_4.setText("�ôʵķ���Ϊ��");
		label_4.setBounds(10, 75, 120, 20);
		panel_3.add(label_4);
		
	    searchJTextArea = new JTextArea();
		searchJTextArea.setBounds(30, 130, 440, 460);
		panel_3.add(searchJTextArea);
		
		JTextArea SearchJTextArea = new JTextArea();
		SearchJTextArea.setBounds(30, 130, 440, 460);
		panel_3.add(SearchJTextArea);
		
		final JButton SearchJButton = new JButton("��ѯ");
		SearchJButton.setBounds(350, 25, 70, 25);
		panel_3.add(SearchJButton);
		
		SearchJButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SearchJButtonActionPerformed(evt);
			}
		});
	}
	

	/**
	 * ��Ӧ�û�����
	 * */
	private void interpretJButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (findEnglishjTextField.getText().equals("")) { // ����û�û��ָ��Ҫ����ĵ���
			JOptionPane.showMessageDialog(this, "û������Ҫ����ĵ���", "����",
					JOptionPane.WARNING_MESSAGE); // ������ʾ��Ϣ
			return; // �˳�����
		} else {
			String english = findEnglishjTextField.getText(); // ��ȡ�û������Ҫ����ĵ���
			FindDictionary findDictionary = new FindDictionary(); // ���������в�ѯָ�����ݱ������
			Dictionary dictionary = findDictionary.findDictionary(english); // ���ò�ѯĳ���ʷ���
			if (dictionary == null) { // ������ݱ��в������õ���
				JOptionPane.showMessageDialog(this, "�ֵ���û�а����õ���", "����",
						JOptionPane.WARNING_MESSAGE); // ������ʾ��Ϣ
				return;
			} else { // ���ݱ��а�����Ҫ��ѯ�ĵ���
				interpretJTextArea.setText(dictionary.getChinses()); // ���õ��ʵ����Ľ������ı�������ʾ
			}
		}
	}
	private void insertjButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (englishjTextField.getText().equals("")) {			//����û�û������Ҫ��ӵ�Ӣ�ĵ���
			JOptionPane.showMessageDialog(this, "û������Ҫ��ӵ�Ӣ������", "����",
					JOptionPane.WARNING_MESSAGE);				//������ʾ��Ϣ
			return;									//�˳�����
		} else if (chinsesjTextArea.getText().equals("")) {	//����û�û������õ��ʵ����ķ���
			JOptionPane.showMessageDialog(this, "û������Ҫ��ӵ����ķ���", "����",
					JOptionPane.WARNING_MESSAGE);				//������ʾ��Ϣ
			return;
		} else {
			String english = englishjTextField.getText();		//��ȡ�û������Ӣ�ĵ���
			FindDictionary findDictionary = new FindDictionary();	//������ѯ���ݿ������
			Dictionary dictionaryEnglish = findDictionary
					.findDictionary(english);					//���ð����û������Ӣ�ĵ��ʲ�ѯ���ݿⷽ��
			if (dictionaryEnglish == null) {					//������ݿ���û�иõ���
				Dictionary dictionary = new Dictionary();		//����Java bean����
				dictionary.setChinses(chinsesjTextArea.getText());	//����Java Bean�������������
				dictionary.setEnglish(english);					//����Java bean�����Ӣ������
				InsertDictionary insertDictionary = new InsertDictionary();	//����������ݱ������
				insertDictionary.insertDictionary(dictionary);		//����������ݱ���
				JOptionPane.showMessageDialog(this, "������ӳɹ�", "��Ϣ��ʾ��",
						JOptionPane.WARNING_MESSAGE);				//������ӳɹ���ʾ
			} else {												//������ݱ��а������û�Ҫ��ӵĵ���
				JOptionPane.showMessageDialog(this, "�õ����Ѿ�����", "����",
						JOptionPane.WARNING_MESSAGE);			//������ʾ��Ϣ
			}
		}
	}

	private void SearchJButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		if (findChinesejTextField.getText().equals("")) { // ����û�û��ָ��Ҫ���������
			JOptionPane.showMessageDialog(this, "û������Ҫ���������", "����",
					JOptionPane.WARNING_MESSAGE); // ������ʾ��Ϣ
			return; // �˳�����
		} else {
			String chinese = findChinesejTextField.getText(); // ��ȡ�û������Ҫ���������
			FindDictionary findDictionary = new FindDictionary(); // ���������в�ѯָ�����ݱ������
			Dictionary dictionary = findDictionary.findChDictionary(chinese); // ���ò�ѯĳ���ʷ���
			if (dictionary == null) { // ������ݱ��в������õ���
				JOptionPane.showMessageDialog(this, "�ֵ���û�а����õ���", "����",
						JOptionPane.WARNING_MESSAGE); // ������ʾ��Ϣ
				return;
			} else {  //���ݱ��а�����Ҫ��ѯ�ĵ���
				searchJTextArea.setText(dictionary.getChinses()); // ���õ��ʵ����Ľ������ı�������ʾ
			}
		}
	}
}
