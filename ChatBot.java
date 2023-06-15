
import java.util.Scanner;

class ChatBot{
public static void main(String [] args){
Scanner scan = new Scanner (System.in);
System.out.println("Hello. What is your name?");
String name= scan.nextLine();
System.out.println("Hi" + name+"! I'm Javabot. Where are you from?");
String place= scan.nextLine();
System.out.println("I hear it's beautiful at "+place+"I'm from a place called Oracle");
System.out.println("How old are you?");
int age= scan.nextInt();
System.out.println("so you're "+age+", cool! I'm 400 years old.");
scan.close();
System.out.println("this means I'am "+(400/age)+ "times older than you.");

}
}