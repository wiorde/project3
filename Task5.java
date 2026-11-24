import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        double[] params=new double[2];
        while (choice!=4) {
            choice=sc.nextInt();
            if (choice==1) {
                input(sc, params);
                if (check(params)) {double e=calculate(params);output(e);
                } else { System.out.println("Ошибка"); }} else if (choice==4) { System.out.println("Выход"); }}
    }
    static void input(Scanner sc, double[] p) {
        p[0]=sc.nextDouble(); p[1]=sc.nextDouble();
    }
    static boolean check(double[] p) {
        if (p[0]<=0 || p[1]<0) return false;
        return true;}
    static double calculate(double[] p) { return p[0]*p[1]*p[1]/2; }
    static void output(double e) { System.out.println("Энергия: "+e); }
}
