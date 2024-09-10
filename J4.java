import java.util.Scanner;
public class MatrixAddition_1{
    public static void main(String[] args) {
        int N = Interger.parseInt(args[0]);
        int[][] matrix1 = new int[N][N];
        int[][] matrix2 = new int[N][N];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the first matrix:");
        for (int i=0;i<N;i++) {
             for (int j=0; j<N;j++) { 
                  matrix[i][j] =scanner.nextInt();}}       