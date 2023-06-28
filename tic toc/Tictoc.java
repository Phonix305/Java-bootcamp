import java.util.Scanner;

class Tictoc {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Lets Play Tic tac toe");
		char[][] boar = new char[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				boar[i][j] = '_';
			}
		}

		printBoard(boar);

		for (int i = 0; i < 9; i++) {

			if (i % 2 == 0) {
				System.out.println("Turn X:");
				int[] element = askUser(boar);
				boar[element[0]][element[1]] = 'X';
			

			} else {
				System.out.println("Turn O:");
				int[] element = askUser(boar);
				boar[element[0]][element[1]] = 'O';
			}
			printBoard(boar);
			int count=checkWin(boar);
			if (count == 3) {

				System.out.println("X WINS");
				break;
        // 1. print: X wins
        // 2. break the loop
      						} 
			else if (count == -3) {
		
				System.out.println("O WINS");
				break;
        // 1. print: O wins
        // 2. break the loop
       							  }

		}

	}

	public static void printBoard(char[][] position)

	{
		for (int i = 0; i < 3; i++) {
			System.out.print("\n");
			System.out.print("\t");

			for (int j = 0; j < 3; j++) {
				System.out.print(" " + position[i][j]);
			}
			System.out.print("\n");

		}

	}

	public static int[] askUser(char[][] board) {
		System.out.print(": -  Pick a row and column number to choose the position between 0-2   ");
		int row = scan.nextInt();
		int column = scan.nextInt();

		while (board[row][column] != '_') {
			System.out.println("Please choose a appropriate Position as " + row + " " + column + " Positions are already taken: ");
			row = scan.nextInt();
			column = scan.nextInt();
		}

		return new int[] { row, column };

	}
	public static int checkWin(char[][] board) {    
    int rows = checkRows(board); 
    
    // Math.abs returns the absolute value of a given number, removing any negative sign. 
    if (Math.abs(rows) == 3) return rows; // If the block of code consists of only one line, you can omit the curly braces.
    
    int columns = checkColumns(board);
    if (Math.abs(columns) == 3) return columns;
    
    int leftDiagonal = checkLeft(board);
    if (Math.abs(leftDiagonal) == 3) return leftDiagonal;
    
    int rightDiagonal = checkRight(board);
    if (Math.abs(rightDiagonal) == 3) return rightDiagonal;
	
	return -1;
    
}

public static int checkRows(char[][] board) {
    int count = 0;
	for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j]=='X'){
					count++;
					return count;
				}
				else if(board[i][j]=='O'){
					count--;
					return count;

				}
			}
		}
    return count;
}


public static int checkColumns(char[][] board) {
    int count = 0;
		

    return count;
}


public static int checkLeft(char[][] board) {
    int count = 0;
    return count;
}


public static int checkRight(char[][] board) {
    int count = 0;
    return count;
}




}