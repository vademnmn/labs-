import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a : " );
        double a = scanner.nextDouble();
        System.out.print("Введите b : " );
        double b = scanner.nextDouble();
        scanner.close();
        String solution = isSolution(a, b);
        System.out.println(solution);
    }

    public static String isSolution(double a, double b) {
        double left  = Math.min(0, -b);
        double right = Math.max(0, -b);
        if (a > 0) {
            if (b != 0){
                String solution = "x in (" + (left) + ',' + (right) + ')';
                return solution;
            }
            else {
                return "x not exists";
            }
        }
        else if (a == 0) {
            String solution = "x not exists";
            return solution;
        }
        else {
            String solution = "x in (-inf," + (left) + ')' + "or in (" + (right) + ",+inf)";
            return solution;
        }
    }
}
