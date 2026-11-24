import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();}
        int left=0;
        int right=n-1;
        System.out.print("Результат: ");
        while (left<=right) {
            if (left==right) {
                System.out.print(a[left]);
            } else {
                System.out.print(a[left]+" "+a[right]+" ");
            left++;
            right--;
        }
        System.out.println();
    }
}
