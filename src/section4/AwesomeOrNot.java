package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int cat=new Random().nextInt(4);
	
	// 3. Print out this variable
System.out.println(cat);
	// 4. Get the user to enter something that they think is awesome
String input=JOptionPane.showInputDialog("Enter Something You Think Is Awesome");
	// 5. If the random number is 0
if(cat==0) {
	JOptionPane.showMessageDialog(null,input+ "is Awesome");
}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if(cat==1) {
	JOptionPane.showMessageDialog(null,input+"is ok");
}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if(cat==2) {
	JOptionPane.showMessageDialog(null,input+"is boring");
}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if(cat==3) {
	JOptionPane.showMessageDialog(null,input+"is posinous");
}
	// -- write your own answer
}
}


