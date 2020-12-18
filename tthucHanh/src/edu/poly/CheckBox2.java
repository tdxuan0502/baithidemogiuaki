package edu.poly;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class CheckBox2 extends JFrame implements ActionListener{
	JLabel l,cpr;//khai báo các nhãn
	JCheckBox cb1,cb2,cb3,cb4;//khai báo checkbox(chứa y/n)
	JComboBox cbb1,cbb2,cbb3,cbb4;//khai báo combobox(chứa danh sách các giá trị)
	JButton b;//khai báo nút lệnh
	String num[]= {"1","2","3","4","5","6","7","8","9"};//khai báo mảng các giá trị (String) để tạo combobox
	String feel[]= {"ok","fail"};
	CheckBox2(){//tạo hàm dựng constructor
		setTitle("Order food ");//đặt tên cho Frame
		l=new JLabel("FOOD ORDERING SYSTEM");
		l.setBounds(150,50,300,100);

		cb1=new JCheckBox("Coca cola COST 10$");
		cb1.setBounds(50,140,200,50);
		cbb1=new JComboBox(num);
		cbb1.setBounds(300,150,40,20);//Y,X,DÀI,RỘNG

		cb2=new JCheckBox("SODA COST 20$");
		cb2.setBounds(50,170,200,50);
		cbb2=new JComboBox(num);
		cbb2.setBounds(300,185,40,20);

		cb3=new JCheckBox("CHICKEN COST 20$");
		cb3.setBounds(50,200,200,50);
		cbb3=new JComboBox(num);
		cbb3.setBounds(300,215,40,20);

		cb4=new JCheckBox("Are you felling ");
		cb4.setBounds(50,250,200,50);
		cbb4=new JComboBox(feel);
		cbb4.setBounds(300,265,50,20);

		b=new JButton("order");
		b.setBounds(170,350,100,40);

		cpr=new JLabel("coppy right @VKU");
		cpr.setBounds(170,400,200,40);

		b.addActionListener(this);
		add(l);add(cb1);add(cbb1);add(b);add(cpr);
		add(cb2);add(cbb2);add(cb3);add(cbb3);add(cb4);add(cbb4);

		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		int index=cbb1.getSelectedIndex();
		String St=cbb1.getSelectedItem().toString();
	}
	public void actionPerformed(ActionEvent e){  
        float amount1=0,amount2=0,amount3=0,amount4=0,amount5=0,amount=0;  
        String msg="";
        String data4 = "";
        if(cb1.isSelected()) {  
        	String data1 = "" + cbb1.getItemAt(cbb1.getSelectedIndex());
            double re = Double.parseDouble(data1);
            //l.setText(data1); 
        	//if(cbb1.getItemAt(cbb1.getSelectedIndex())) {
            amount1+=10*re;  
            msg="CoCa CoLa: 10 x " + re + " = " + amount1 + "\n";  
        }  
        if(cb2.isSelected()){  
        	String data2 = "" + cbb2.getItemAt(cbb2.getSelectedIndex());
            double re2 = Double.parseDouble(data2);
           // l.setText(data2); 
            amount2+=20*re2;  
            msg+="SoDa:20 x " + re2 + " = " + amount2 + "\n";  
        }  
        if(cb3.isSelected()){  
        	String data3 = "" + cbb3.getItemAt(cbb3.getSelectedIndex());
            double re3 = Double.parseDouble(data3);
         //   l.setText(data3); 
            amount3+=20*re3;  
            msg+="Chicken:20 x " + re3 + " = " + amount3 + "\n";  
        }  
        /*if(cb4.isSelected()){  
        	String data4 = "" + cbb4.getItemAt(cbb4.getSelectedIndex());
            double re4 = Double.parseDouble(data4);
           // l.setText(data4); 
            amount4+=5*re4;  
            msg+="Milk x " + re4 + " = " + amount4 + "\n"; 
        }
        if(cb5.isSelected()){  
        	String data5 = "" + cbb5.getItemAt(cbb5.getSelectedIndex());
            double re5 = Double.parseDouble(data5);
           // l.setText(data4); 
            amount5+=5*re5;  
            msg+="Soda x " + re5 + " = " + amount5 + "\n"; 
        }*/
        if(cb4.isSelected()){  
        	data4 = "" + cbb4.getItemAt(cbb4.getSelectedIndex());
            //double re4 = Double.parseDouble(data4);
            //l.setText(data4); 
            //amount4+=5*re4;  
            //msg+="Milk x " + re4 + " = " + amount4 + "\n"; 
        }
        amount = amount1 +amount2+amount3+ amount4+ amount5;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        msg+="-----------------\n";  
       // String d = now();
        LocalDateTime now = LocalDateTime.now();

        JOptionPane.showMessageDialog(this,msg+" Total: "+amount + "\n date :" + dtf.format(now)+"\ncảm nhận khách hàng "+data4);
        //JOptionPane.showMessageDialog(this,l);
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBox2();
	}

}
