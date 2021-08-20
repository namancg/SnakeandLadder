package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
int pos = 0;
		
		while(pos<100) {
			
			int dice = (int) Math.floor(Math.random()*100)%6+1;
			int option = (int) Math.floor(Math.random()*100)%3;
			
			switch(option) {
			
			case 0: 
				System.out.println("NO PLAY!");
				break;
				
			case 1:
				System.out.println("LADDER");
				pos+=dice;
				
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
}
}
}