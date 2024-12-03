package neetCode150.arraysAndHashing;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> rowSet = new HashSet<>();
            for (int col = 0; col<9 ; col++) {

                if(board[row][col] == '.'){
                    continue;
                }

                if(rowSet.contains(board[row][col])){
                    return false;
                }
                rowSet.add(board[row][col]);
            }
        }

        for (int col = 0; col<9; col++){
            Set<Character> colSet = new HashSet<>();
            for (int row = 0; row < 9; row++) {

                if(board[row][col] == '.'){
                    continue;
                }

                if(colSet.contains(board[row][col])){
                    return false;
                }
                colSet.add(board[row][col]);
            }
        }
        for(int smallGrids = 0 ;smallGrids<9;smallGrids++) {

            Set<Character> gridSmallSet = new HashSet<>();
            int startRow = (smallGrids/3)*3;
            int startCol = (smallGrids%3)*3;

            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
//                    int i = (smallGrids/3)*3+row;
//                    int j = (smallGrids%3)*3+col;
                    int i = startRow+row;
                    int j = startCol+col;

                    if (board[i][j] == '.') {
                        continue;
                    }

                    if (gridSmallSet.contains(board[i][j])) {
                        return false;
                    }
                    gridSmallSet.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
class Main7 {
    public static void main(String[] args) {
        ValidSudoku obj = new ValidSudoku();
        Scanner sc = new Scanner(System.in);

        // Debug: Check if there's an integer input for `t`
        try {
            int t = sc.nextInt();
            System.out.println("Number of test cases: " + t);  // Debugging line
            sc.nextLine(); // Consume any remaining newline character

            for (int i = 0; i < t; i++) {
                char[][] board = new char[9][9];
                for (int row = 0; row < 9; row++) {
                    for (int col = 0; col < 9; col++) {
                        board[row][col] = sc.next().charAt(0);
                    }
                }
                System.out.println(obj.isValidSudoku(board) ? "Valid" : "Invalid");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer for the number of test cases.");
        } finally {
            sc.close();
        }
    }
}
