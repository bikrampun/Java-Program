import javax.swing.*;
import java.awt.event.*;

public class ContentLength extends JFrame{
	JTextField t1,t2;
	JButton b;

	ContentLength(){
		setDefaultLookAndFeelDecorated(true);
		setSize(400,500);
		setTitle("Display Length of Content");
		t1=new JTextField("Enter any text content");
		t2=new JTextField();
		t2.setEditable(false);
		b=new JButton("Click");
		
		t1.setBounds(50,0,190,40);
		t2.setBounds(50,50,90,50);
		b.setBounds(50,150,90,50);
		add(t1); add(t2); add(b);

		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Separate s=new Separate(this);
		b.addActionListener(s);
	}
	public static void main(String[] args) {
		new ContentLength();
	}
}
class Separate implements ActionListener{
	ContentLength c;
	Separate(ContentLength c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		String msg=c.t1.getText();
		int leng=msg.length();
		
		String l=Integer.toString(leng);
		c.t2.setText(l);
	}
}