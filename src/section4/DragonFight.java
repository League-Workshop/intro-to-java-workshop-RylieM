package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int Player_Health=1000;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int Dragon_Health=100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int Player_Damage_Taken=0; 
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int Dragon_Damage_Taken=0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(Player_Health>0 && Dragon_Health>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String input=JOptionPane.showInputDialog("Yell at or Kick at Dragon??");
		
		
		
		// 9. If they typed in "yell":
		if(input.equalsIgnoreCase("Yell")){
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			int Dragon_Damage__Taken= new Random ().nextInt(10);
			//-- Subtract that number from the dragon's health variable 
			 Dragon_Health-=Dragon_Damage_Taken ;
			 }
		// 10. If they typed in "kick":
		if (input.equalsIgnoreCase("kick")) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			int Dragon_Damage_Taken1=25;
			//-- Subtract that number from the dragon's health variable
			Dragon_Health-=7;{
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		int num=new Random().nextInt(35);
		// 12. Subtract this number from the player's health
		 Player_Health-=num;
		
		
		// 13. If the user's health is less than or equal to 0
		if (Player_Health<=0 ) {
			//-- Tell the user that they lost
		JOptionPane.showMessageDialog(null,"You Lost");
		}
		// 14. Else if the dragon's health is less than or equal to 0
		if  (Dragon_Health<=0) {
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			JOptionPane.showMessageDialog(null,"The Dragon is Dead,You Took a Ton of Gold and You Won");
	   //  15.  Else
		}
			else {
			JOptionPane.showMessageDialog(null,Player_Health+"   "+Dragon_Health);	
			}
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}
		}
		}
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		}
	







