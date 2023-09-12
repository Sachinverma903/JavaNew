import java.util.Scanner;
public class CalculatorDemo
{
        public int add(int a, int b) {
            int c = a+b;
            return c;
        }
        public int sub(int a, int b) {
            int c = a-b;
            return c;
        }
        public int multiply(int a, int b) {
            int c = a*b;
            return c;
        }
        public double divide(double a, double b) {
            double c = a/b;
            return c;
        }
        public static void main(String[] args) {
            CalculatorDemo obj = new CalculatorDemo();
            Scanner scan = new Scanner(System.in);
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int num = obj.add(num1, num2);
            System.out.println("Adition of numbers :" +num);
        }


    }


