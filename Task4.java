import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите M (строки): ");
        int m=sc.nextInt();
        System.out.print("Введите N (столбцы): ");
        int n=sc.nextInt();
        System.out.print("Введите D: ");
        int d=sc.nextInt();
        int[][] matrix=new int[m][n];
        System.out.println("Введите "+n+" чисел для первой строки:");
        for (int j=0; j<n; j++) {matrix[0][j]=sc.nextInt();}
        for (int i=1; i<m; i++) {for (int j=0; j<n; j++) {matrix[i][j]=matrix[i-1][j]*d;}}
        System.out.println("Матрица:");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {System.out.print(matrix[i][j]+" ");}
            System.out.println();
        }
    }
}
