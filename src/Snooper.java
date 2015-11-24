import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
String answer= JOptionPane.showInputDialog("What is your name? Don't worry this is for your bank info");	
String answe2= JOptionPane.showInputDialog("What is your social security number");
String answer3= JOptionPane.showInputDialog("How old are you?!");
String answer4= JOptionPane.showInputDialog("Where do you live?");
String answer5= JOptionPane.showInputDialog("What is your e-mail?");
JOptionPane.showMessageDialog(null,"HELLO "+ answer + "I know your social security number " + answe2+ "  I know all this info before and this is not your bank you are to young for a bank");
	
	
	
}
}
