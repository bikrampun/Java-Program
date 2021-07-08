import javax.swing.*;
import java.awt.*;

public class ButtonEg1 {
	ButtonEg1(){
		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame f=new JFrame("Button Eg 1");

		JButton b1=new JButton("Click1");
		JButton b2=new JButton("Click2");
		JLabel l1,l2;	
		//l1=new JLabel("Click1");
		//l2=new JLabel("Click2");
		b1.setBounds(50,0,90,40);
		b2.setBounds(50,50,90,50);
		f.add(b1);
		f.add(b2);
		f.setSize(250,250);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ButtonEg1();
	}
}
