import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a : " );
        double a = scanner.nextDouble();
        System.out.print("Введите b : " );
        double b = scanner.nextDouble();
        scanner.close();
        isSolution(a, b);
    }

    public static String isSolution(double a, double b) {
        double left  = Math.min(0, -b);
        double right = Math.max(0, -b);
        if (a > 0) {
            String solution = "x in (" + (left) + ',' + (right) + ')';
            System.out.println(solution);
        }
        else if (a == 0) {
            String solution = "x not exists";
            System.out.println(solution);
        }
        else {
            String solution = "x in (-inf," + (left) + ')' + "or in (" + (right) + ",+inf)";
            System.out.println(solution);
        }
        return "abc";
    }
}