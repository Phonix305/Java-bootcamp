import java.util.Scanner;
class RockPaperScissor{
	public static void main(String [] args){
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println(">>Let's play Rock Paper Scissors.\n>>When I say 'shoot', Choose: rock, paper, or scissors.\n>>\n>>Are you ready? Write 'yes' if you are");
		
		String ans=scan.nextLine();
		
		if(ans.equals("yes")){
		System.out.println("\n -- Great! Let's Play.\n -- rock - paper - scissors, shoot!");
		}
		else{
		System.out.println("\n -- print: Darn, some﻿ other time...!");
		System.exit(0);
		}
		
		String userChoice=scan.nextLine();
		String computerCho=computerChoice();
		result(userChoice,computerCho);	
	}
	
	public static String computerChoice(){
		int choice=(int)Math.random()*2;
		
		switch(choice){
		
			case 0:return "rock";
			
			case 1:return "paper";
			
			case 2:return "scissors";
			
			default : return "";
		}
	}
	
	public static void result(String userChoice, String computerCho){
				if(userChoice.equals("rock") && computerCho.equals("scissors")){
			System.out.println("User Wins");		
			}
		else if(userChoice.equals("paper") && computerCho.equals("rock")){
			System.out.println("User Wins");		
			}
		else if(userChoice.equals("scissors") && computerCho.equals("paper")){
			System.out.println("User Wins");		
			}
		else{
			System.out.println("Computer Wins");		
			
		}
	}
}