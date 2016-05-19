package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.swing.AutoCompleteSupport;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JList;

public class test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JList<String> list;
	private DefaultListModel dfm = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem() != null){
					dfm.addElement(comboBox.getSelectedItem());
				}
			}
		});
		comboBox.setBounds(10, 53, 210, 29);
		contentPane.add(comboBox);
		
		Object[] elements = new Object[] { "Hà Nội", "Thái Nguyên", "Hòa Bình",
		        "Thái Bình", "Hà Nam", "Tây Nguyên", "Đã nẵng", "TP Hồ Chí Minh" };
		AutoCompleteSupport support = AutoCompleteSupport.install(
		        comboBox, GlazedLists.eventListOf(elements));
		
		textField = new JTextField();
		textField.setBounds(240, 53, 146, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		list = new JList();
		list.setValueIsAdjusting(true);
		list.setBounds(22, 128, 200, 105);
		list.setModel(dfm);
		contentPane.add(list);
	}
}
