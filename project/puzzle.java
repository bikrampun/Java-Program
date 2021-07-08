import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class puzzle extends JFrame implements ActionListener {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;
	String label,name;
	puzzle(){
		super("3*3 Grid Puzzle");
		name=JOptionPane.showInputDialog(this,"Enter your name: ");
		b1=new JButton("1");
		b2=new JButton(" ");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("2");
		next=new JButton("Next");

		b1.setBounds(50,50,50,40);
		b2.setBounds(100,50,50,40);
		b3.setBounds(150,50,50,40);
		b4.setBounds(50,100,50,40);
		b5.setBounds(100,100,50,40);
		b6.setBounds(150,100,50,40);
		b7.setBounds(50,150,50,40);
		b8.setBounds(100,150,50,40);
		b9.setBounds(150,150,50,40);
		next.setBounds(100,200,80,40);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		next.addActionListener(this);

		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
		add(next);
		next.setBackground(Color.BLUE);
		next.setForeground(Color.GREEN);

		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==next){
			label=b4.getLabel();
			b4.setLabel(b9.getLabel());
			b9.setLabel(label);
			label=b1.getLabel();
			b1.setLabel(b5.getLabel());
			b5.setLabel(label);
			label=b2.getLabel();
			b2.setLabel(b8.getLabel());
			b8.setLabel(label);
		}
		if (e.getSource()==b1) {
			label=b1.getLabel();
			if(b2.getLabel().equals(" ")){
				b2.setLabel(label);b1.setLabel(" ");
			}
			if(b4.getLabel().equals(" ")){
				b4.setLabel(label);b1.setLabel(" ");
			}
		}
		if (e.getSource()==b2) {
			label=b2.getLabel();
			if(b1.getLabel().equals(" ")){
				b1.setLabel(label);b2.setLabel(" ");
			}
			if(b3.getLabel().equals(" ")){
				b3.setLabel(label);b2.setLabel(" ");
			}
			if(b5.getLabel().equals(" ")){
				b5.setLabel(label);b2.setLabel(" ");
			}
		}
		if (e.getSource()==b3) {
			label=b3.getLabel();
			if(b2.getLabel().equals(" ")){
				b2.setLabel(label);b3.setLabel(" ");
			}
			if(b6.getLabel().equals(" ")){
				b6.setLabel(label);b3.setLabel(" ");
			}
		}
		if (e.getSource()==b4) {
			label=b4.getLabel();
			if(b1.getLabel().equals(" ")){
				b1.setLabel(label);b4.setLabel(" ");
			}
			if(b5.getLabel().equals(" ")){
				b5.setLabel(label);b4.setLabel(" ");
			}
			if(b7.getLabel().equals(" ")){
				b7.setLabel(label);b4.setLabel(" ");
			}
		}
		if (e.getSource()==b5) {
			label=b5.getLabel();
			if(b2.getLabel().equals(" ")){
				b2.setLabel(label);b5.setLabel(" ");
			}
			if(b4.getLabel().equals(" ")){
				b4.setLabel(label);b5.setLabel(" ");
			}
			if(b6.getLabel().equals(" ")){
				b6.setLabel(label);b5.setLabel(" ");
			}
			if(b8.getLabel().equals(" ")){
				b8.setLabel(label);b5.setLabel(" ");
			}
		}
		if (e.getSource()==b6) {
			label=b6.getLabel();
			if(b3.getLabel().equals(" ")){
				b3.setLabel(label);b6.setLabel(" ");
			}
			if(b5.getLabel().equals(" ")){
				b5.setLabel(label);b6.setLabel(" ");
			}
			if(b9.getLabel().equals(" ")){
				b9.setLabel(label);b6.setLabel(" ");
			}
		}
		if (e.getSource()==b7) {
			label=b7.getLabel();
			if(b8.getLabel().equals(" ")){
				b8.setLabel(label);b7.setLabel(" ");
			}
			if(b4.getLabel().equals(" ")){
				b4.setLabel(label);b7.setLabel(" ");
			}
		}
		if (e.getSource()==b8) {
			label=b8.getLabel();
			if(b5.getLabel().equals(" ")){
				b5.setLabel(label);b8.setLabel(" ");
			}
			if(b7.getLabel().equals(" ")){
				b7.setLabel(label);b8.setLabel(" ");
			}
			if(b9.getLabel().equals(" ")){
				b9.setLabel(label);b8.setLabel(" ");
			}
		}
		if (e.getSource()==b9) {
			label=b9.getLabel();
			if(b8.getLabel().equals(" ")){
				b8.setLabel(label);b9.setLabel(" ");
			}
			if(b6.getLabel().equals(" ")){
				b6.setLabel(label);b9.setLabel(" ");
			}
		}

		if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel().equals("3")
			&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")&&b6.getLabel().equals("6")
			&&b7.getLabel().equals("7")&&b8.getLabel().equals("8")&&b9.getLabel().equals(" ")) {
			JOptionPane.showMessageDialog(this,"Congratulation, "+name+". You have won!");
		}
	}

	public static void main(String[] args) {
		new puzzle();
	}
}
