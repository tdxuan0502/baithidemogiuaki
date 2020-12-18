package lab4;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JLabel;

import java.applet.*;

class Calculator extends Frame implements ActionListener {
	JLabel pr;
	private TextField display;
	private double arg=0;
	private String op= "=";
	private boolean start = true;
	public Calculator()
	{
		JLabel pr;
		setTitle("Calculator");
		setSize(500,500);
		setLayout(new BorderLayout());
		display = new TextField("0");
		display.setEditable(false);
		add(display,"North");
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,4));
		String buttons[] = {"0", "1", "2", "3",
				            "4", "5", "6", "7",
				            "8", "9", "+", "-",
				            "*", "/", "=", "c"};		
	for(int i=0;i< buttons.length;i++) {
		Button button = new Button(buttons[i]);
		p.add(button);
		button.addActionListener(this);
	}
	
	add(p, "Center");
	/*
	 * pr=new JLabel("Coppyrignt @VKU"); pr.setBounds(170,500,200,40); add(pr);
	 */
	addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	}
	public void actionPerformed(ActionEvent evt) {
		String s = evt.getActionCommand();
		if('0'<=s.charAt(0) && s.charAt(0) <= '9') {
			if(start) {
				display.setText(s);
			}else {
				display.setText(display.getText()+s);
			}
			start = false;
		}
		else {
			if(start) {
				if(s.equals("-")) {
					display.setText(s);
					start = false;
				}else {
					op = s;
				}
			}
			else {
				double x = Double.parseDouble(display.getText());
				calculate(x);
				op=s;
				start = true;
			}
			if(op.equals("c")){
				display.setText("");
				}
		}
		
	}
	public void calculate(double n) {
		if(op.equals("+")) {
			arg+=n;
		}else 
			if(op.equals("-")) {
				arg-=n;
			}else 
				if(op.equals("*")) {
					arg*=n;
				}else 
					if(op.equals("/")) {
						arg/=n;
					}
					else 
					if(op.equals("=")) {
						arg=n;
					}
		display.setText(""+ arg);
		 }
	public static void main(String[] args) {
		Calculator frame = new Calculator();
		frame.show();
	}

}
