import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (a[i]==a[j]) {
                    System.out.println("Одинаковые элементы на позициях: "+i+" и "+j);
                }
            }
        }
    }
}