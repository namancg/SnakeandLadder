package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {

		int pos = 0;
		int total_dice_rolls = 0;
		
		while(pos<100) {
			
			int dice = (int) Math.floor(Math.random()*100)%6+1;
			total_dice_rolls++;
			int option = (int) Math.floor(Math.random()*100)%3;
			
			switch(option) {
			
			case 0: 
				System.out.println("NO PLAY!");
				break;
				
			case 1:
				System.out.println("LADDER");
				pos+=dice;
				if(pos>100)
					pos-=dice;
				break;
				
			case 2:
				System.out.println("SNAKE");
				pos-=dice;
				if(pos<0)
					pos=0;
				break;
			
			}
			System.out.println("Rolled Dice: "+dice);
			System.out.println("Current Position : "+pos);
			System.out.println(total_dice_rolls+" DICE ROLL...");
			
		}
		
		System.out.println("WINNER");
		System.out.println(" TOOK "+total_dice_rolls+"NO OF DICE ROLLS TO WIN");
}
}
