import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        int cols = input.nextInt();

        int[][] matrix = new int[lines][cols];

        for (int i = 0; i < lines; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("\nInsert a value at the matrix");
        int valueX = input.nextInt();

        boolean foundValueX = false;

        for (int i = 0; i < lines; i++){
            for (int j = 0; j < cols; j++){
                if (matrix[i][j] == valueX){
                    foundValueX = true;
                    analyzeMatrix(matrix, i, j);
                }
            }
        }

        if (!foundValueX){
            System.out.println("Value not found in the matrix.");
        }
    }

    public static void analyzeMatrix(int[][] matrix, int line, int col){
        System.out.printf("Position: %d, %d \n", line, col);


        if (col == 0) {
            System.out.println("Left: Doesn't exist");
        }
        else {
            System.out.println("Left: " + matrix[line][col -1]);
        }

        if (col == matrix[0].length -1){ // Número de colunas
            System.out.println("Right: Doesn't exist");
        }
        else {
            System.out.println("Right: " + matrix[line][col +1]);
        }

        if (line == 0){
            System.out.println("Up: Doesn't exist");
        }
        else {
            System.out.println("Up: " + matrix[line -1][col]);
        }

        if (line == matrix.length -1){ // Número de linhas
            System.out.println("Down: Doesn't exist");
        }
        else {
            System.out.println("Down: " + matrix[line +1][col]);
        }
    }
}