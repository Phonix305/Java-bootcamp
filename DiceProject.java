import java.util.Scanner;

class DiceProject{
	public static void main(String [] args){
		int roll1=rollDice();
		int roll2=rollDice();
		int roll3=rollDice();
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Type three numbers you want to choose three numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		
		boolean areLess=areLessThan(num1,num2,num3);
		boolean areHigh=areHigherThan(num1,num2,num3);
		
		if(areLess || areHigh){
			System.out.println(" choose appropriate no between 1-6 try next time \nnow exting..........................");
		System.exit(0);
		}

		System.out.println("\n Rolling dice 3 result came as this");
		System.out.println(roll1);
		System.out.println(roll2);
		System.out.println(roll3);
		
		int sumOfNum=num1+num2+num3;
		int sumOfDice=roll1+roll2+roll3;
		
		if(sumOfNum> sumOfDice && (sumOfNum-sumOfDice)<3){
			System.out.println("\n Congratulations You win");
		}
		else{
			System.out.println("\n Better Luck Next Time");
		}
		
		scan.close();
	}
	
	public static int rollDice(){
		double randomNumber =Math.random()*6;
		randomNumber+=1;
		return (int)randomNumber;
	}
	
	public static boolean areLessThan(int num1,int num2,int num3){
		return (num1<1 || num2<1 || num3<1);
		
	}
	public static boolean areHigherThan(int num1,int num2,int num3){
		return (num1>6 || num2>6 || num3>6);
	}
	
}