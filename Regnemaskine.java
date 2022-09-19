import java.util.Scanner;

public class Regnemaskine {

        public static void main (String[] args){
            double fnum;
            double snum;
            double ans;
            char op;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            fnum = scan.nextDouble();
            snum = scan.nextDouble();
            System.out.print("\nEnter an operator (+, -, , /): ");
            op = scan.next().charAt(0);
            switch(op) {
                case '+': ans = fnum + snum;
                    break;
                case '-': ans = fnum - snum;
                    break;
                case '*': ans = fnum * snum;
                    break;
                default: System.out.print("Error! Enter correct operator");
                    return;
            }
            System.out.print("\nThe result is given as follows:\n");
            System.out.printf(fnum + " " + op + " " + snum + " = " + ans);

        }
}

