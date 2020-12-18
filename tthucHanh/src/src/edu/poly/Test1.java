package src.edu.poly ;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
public class Test1 extends Frame implements ActionListener 
{
	//thuoc tinh
	
	public TextField te;
	public Panel p;
	public Boolean kt=true;
	public String pt;
	public double kq=0;
	//constructor
	public Test1()
	{
		//1.khoi tao
		
		setSize(500,500);
		p=new Panel();
		te=new TextField("0");
		//3. set layout
		setLayout(new BorderLayout());
		add(te,"North");
		add(p,"Center");
		//setSize(500,500);
		p.setLayout(new GridLayout(4,4));
		String[] st= {"7","8","9","/",
					  "4","5","6","*",
					  "1","2","3","-",
					  "0",".","=","+",};
		//4.add
		for(int i=0;i<st.length;i++)
		{
			Button but=new Button(st[i]);
			but.addActionListener(this);
			p.add(but);
		}
		//5. hien thi
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//b.addActionListener(this);
	
		}
	public void actionPerformed(ActionEvent e)
	{
		String nhap=e.getActionCommand();
		if('0'<=nhap.charAt(0) && '9'>=nhap.charAt(0) || nhap==".")
		{
			if(kt)
			{
				te.setText(nhap);
			}
			else
			{
				te.setText(te.getText()+nhap);
			}
			kt=false;
		}
		else
		{
			if(kt)
			{
				if(nhap=="-")
				{
					te.setText(nhap);
					kt=false;
				}
				else
				{
					pt=nhap;
				}
			}
			else
			{
				double x=Double.parseDouble(te.getText());
				TinhToan(x);
				pt=nhap;
				kt=true;
			}
		}
	}
	public void TinhToan(double a)
	{
		if(pt=="+") kq+=a;
		if(pt=="-") kq-=a;
		if(pt=="*") kq*=a;
		if(pt=="/") kq/=a;
		if(pt=="=") kq=a;
		te.setText(String.valueOf(kq));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1();
		//Calculator frame = new Calculator();
		//JFrame.show();
	}

}