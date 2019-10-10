package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int ten=0;
		// 2.  Ask the user a question 
		String input=JOptionPane.showInputDialog("What is the capital of Florida");
		// 3.  Use an if statement to check if their answer is correct
		if(input.equalsIgnoreCase("tallahasse")) {
			ten=ten+1;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String tiny=JOptionPane.showInputDialog("What is the capital of Teaxas");
				if(tiny.equalsIgnoreCase("Austin")) {
					
				ten=ten+1;
				}
		String big=JOptionPane.showInputDialog("What is the capital of New Mexico");
		if(big.equalsIgnoreCase("Santa Fe")) {
			ten=ten+1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null,ten);
	}
}
