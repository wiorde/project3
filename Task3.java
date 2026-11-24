import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();}
        int[] b=formB(a);
        System.out.print("Массив B: ");
        for (int i=0; i<b.length; i++) {
            System.out.print(b[i]+" ");}
        System.out.println();}
    static int[] formB(int[] a) {
        int n=a.length;
        int[] b=new int[n];
        for (int k=0; k<n; k++) {
            int sum=0;
            for (int i=k; i<n; i++) {sum=sum+a[i];}b[k]=sum;}
        return b;
    }
}
