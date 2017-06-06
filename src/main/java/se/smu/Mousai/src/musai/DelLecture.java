package musai;

import musai.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class DelLecture extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//DelLecture frame = new DelLecture();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DelLecture(){
		
	}
	public DelLecture(String cont) {
		System.out.println(cont);
		setBounds(100, 100, 435, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//과목명
		textField = new JTextField();
		textField.setFont(new Font("HY중고딕", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(219, 32, 155, 46);
		contentPane.add(textField);

		//담당교수
		textField_1 = new JTextField();
		textField_1.setFont(new Font("HY중고딕", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(219, 127, 155, 46);
		contentPane.add(textField_1);
		
		//요일&시간 
		textField_2 = new JTextField();
		textField_2.setFont(new Font("HY중고딕", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(219, 222, 155, 46);
		contentPane.add(textField_2);
		
		//연도&학기
		textField_3 = new JTextField();
		textField_3.setFont(new Font("HY중고딕", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(219, 317, 155, 46);
		contentPane.add(textField_3);
		
		//세부사항
		textField_4 = new JTextField();
		textField_4.setFont(new Font("HY중고딕", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(219, 411, 155, 46);
		contentPane.add(textField_4);
		
	
		//과목명
		JLabel label = new JLabel("\uACFC\uBAA9 \uBA85");
		label.setToolTipText(" ");
		label.setForeground(Color.GRAY);
		label.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		label.setBounds(40, 35, 112, 32);
		contentPane.add(label);
		
		//담당 교수
		JLabel label_1 = new JLabel("\uB2F4\uB2F9 \uAD50\uC218");
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		label_1.setBounds(40, 130, 112, 32);
		contentPane.add(label_1);
		
		//요일&시간
		JLabel label_2 = new JLabel("\uC694\uC77C/\uC2DC\uAC04");
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		label_2.setBounds(40, 225, 112, 32);
		contentPane.add(label_2);
		
		//연도&학기
		JLabel label_3 = new JLabel("\uB144\uB3C4/\uD559\uAE30");
		label_3.setForeground(Color.GRAY);
		label_3.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		label_3.setBounds(40, 320, 112, 32);
		contentPane.add(label_3);
		
		//세부 사항
		JLabel label_4 = new JLabel("\uC138\uBD80 \uC0AC\uD56D");
		label_4.setForeground(Color.GRAY);
		label_4.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		label_4.setBounds(40, 415, 112, 32);
		contentPane.add(label_4);
		
		JButton savebutton = new JButton("");
		savebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count = 0;
				try {
					File data = new File("data.dt");
					FileWriter fw = new FileWriter(data, true);
					if(!(textField.getText().equals(""))){
						fw.write(" <html>");
						count++;
						fw.write(textField.getText());
					}
					if(!(textField_1.getText().equals(""))){
						fw.write("<br>");
						count++;
						fw.write(textField_1.getText());
					}
					if(!(textField_2.getText().equals(""))){
						fw.write("::");
						count++;
						fw.write(textField_2.getText());
					}
					if(!(textField_3.getText().equals(""))){
						fw.write(":::");
						count++;
						fw.write(textField_3.getText());
					}
					if(!(textField_4.getText().equals(""))){
						fw.write("::::");
						fw.write(textField_4.getText());
						fw.write("</html>");
						fw.write("\n");
						fw.flush();
					}
					else{
						fw.write("</html>");
						fw.write("\n");
						fw.flush();
			}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(count!=4){
					Warning warn = new Warning();
					warn.setVisible(true);
					count = 0;					
				}
				else{
					try {
						Mainframe ma = new Mainframe();
						ma.setVisible(true);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					dispose();
				}
			}
		});
		savebutton.setForeground(Color.BLACK);
		savebutton.setIcon(new ImageIcon("buttons/KakaoTalk_20170518_191838663.png"));
		savebutton.setBackground(Color.WHITE);
		savebutton.setBounds(99, 474, 59, 38);
		contentPane.add(savebutton);
		
		
		
		JButton Delbutton = new JButton("");
		Delbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count = 0;
				 Delete dl = new Delete();
		            dl.setVisible(true);
			dispose();
			}
		});
		Delbutton.setIcon(new ImageIcon("buttons/KakaoTalk_20170518_191824909.png"));
		Delbutton.setForeground(Color.BLACK);
		Delbutton.setBackground(Color.WHITE);
		Delbutton.setBounds(257, 474, 59, 38);
		contentPane.add(Delbutton);
		
		//BufferedReader outputFile;
	   // try {
	      //outputFile = new BufferedReader(new FileReader("data.dt"));
//	      String cont = null;
	      String str1= "";
	      String str2= "";
	      String str3= "";
	      String str4= "";
	      String str5= "";
	    //  try {
			//while ((cont = outputFile.readLine()) != null) {
			   for(int i=6;!(cont.charAt(i)==':'&&cont.charAt(i+1)==':')&&!(cont.charAt(i)=='<');i++){
				   str1= str1+cont.charAt(i);
				   textField.setText(str1);
			   }
			   for(int i=cont.indexOf("<br>")+4;!(cont.charAt(i)==':'&&cont.charAt(i+1)==':');i++){
				   str2=str2+cont.charAt(i);
				   textField_1.setText(str2);
				   
			   }
			   for(int i=cont.indexOf("::")+2;!(cont.charAt(i)==':'&&cont.charAt(i+1)==':');i++){
			   		str3=str3+cont.charAt(i);
				   textField_2.setText(str3);
			   }
			   for(int i=cont.indexOf(":::")+3;!(cont.charAt(i)==':'&&cont.charAt(i+1)==':');i++){
				   str4=str4+cont.charAt(i);
				   textField_3.setText(str4);   
			   }
			   for(int i=cont.indexOf("::::")+4;!(cont.charAt(i)=='<');i++){
					str5=str5+cont.charAt(i);
				 textField_4.setText(str5);
				 		
			   }
			  // }
			//}
	      
//		 catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	     catch (FileNotFoundException e) {
//	      // TODO Auto-generated catch block
//	      e.printStackTrace();
//	    }
//	    

	}
}