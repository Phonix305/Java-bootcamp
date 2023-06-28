import java.util.Scanner;
class Javapedia{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many historical figures will you register?");
		int no=scan.nextInt();
		String[][] database=new String[no][3];
		scan.nextLine();
		
		for(int i=0;i<no;i++){
			System.out.println("     Figure: "+(i+1));
			
				
				System.out.print("      - Name: ");
				database[i][0]=scan.nextLine();
				System.out.print("      - Date of birth: ");
				database[i][1]=scan.nextLine();
				System.out.print("      - Occupation: ");
				database[i][2]=scan.nextLine();
			s
		}
		
		
	}
	
	public static void print2DArray(String[][] database,int row,int column){
	
	System.out.println("	"+database[row][column]+" ");
	}

}