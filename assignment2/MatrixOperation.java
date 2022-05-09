import java.util.Scanner;

class Matrix{

    int [][] createMatrix(int row, int col){

        Scanner inp = new Scanner(System.in);
        int [][]M = new int[row][col];

        for (int i = 0; i < row; i++) {
            System.out.println("Row " + (i+1) + ":");
            for (int j = 0; j < col; j++) {
                System.out.print("Column " + (j+1) + ":");
                M[i][j] = inp.nextInt();
            }
        }

        return M;
    }

    void displayMatrix(int M[][]){
        int row = M.length;
        int col = M[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[][] addMatrix(int A[][], int B[][]){

        int row = A.length;
        int col = A[0].length;
        int [][]C = new int[1][1];

        if (row == B.length && row > 0) {
            if (row == B[0].length) {
                C = new int[row][col];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        C[i][j] = A[i][j] + B[i][j] ;
                    }
                }
                return C;
            }
        }
        return C;
    }

    int[][] subMatrix(int A[][], int B[][]){

        int row = A.length;
        int col = A[0].length;
        int [][]C = new int[1][1];

        if (row == B.length && row > 0) {
            if (row == B[0].length) {
                C = new int[row][col];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        C[i][j] = A[i][j] - B[i][j] ;
                    }
                }
                return C;
            }
        }
        return C;
    }

    int[][] multiplyMatrix(int A[][], int B[][]){
        int row = A.length;
        int col = B[0].length;
        int [][]C = new int[1][1];

        if (A[0].length == B.length) {
            C = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < A[0].length; k++) {
                        C[i][j] = C[i][j] + (A[i][k] * B[k][j]) ;
                    }
                }
            }
        }

        return C;
    }
}
    
public class MatrixOperation {
    public static void main(String[] args) {
        int r,c;

        Matrix obj = new Matrix();

        Scanner in = new Scanner(System.in);

        // Matrix A
        System.out.println("Matrix A: ");
        System.out.print("Enter no.of rows: ");
        r = in.nextInt();
        System.out.print("Enter no.of columns: ");
        c = in.nextInt();
        
        int [][]A = new int[r][c];
        A = obj.createMatrix(r,c);

        // Matrix B
        System.out.println("Matrix B: ");
        System.out.print("Enter no.of rows: ");
        r = in.nextInt();
        System.out.print("Enter no.of columns: ");
        c = in.nextInt();
        
        int [][]B = new int[r][c];
        B = obj.createMatrix(r,c);
        
        // Resultant matrix
        int [][]C;

        System.out.println("Addition of two matrices :");
        C = obj.addMatrix(A, B);
        obj.displayMatrix(C);

        System.out.println("Subtraction of two matrices :");
        C = obj.subMatrix(A, B);
        obj.displayMatrix(C);

        System.out.println("Multiplication of two matrices :");
        C = obj.multiplyMatrix(A, B);
        obj.displayMatrix(C);

    }
    
}