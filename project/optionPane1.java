import javax.swing.*;

public class optionPane1 {
	optionPane1(){
		JFrame f=new JFrame();
		JOptionPane.showMessageDialog(f,"Warning Example.","Alert ",JOptionPane.WARNING_MESSAGE);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new optionPane1();
	}
}
