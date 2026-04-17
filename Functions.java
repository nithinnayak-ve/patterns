import java.util.*;
public class Functions {

   /*  public static int Add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = Add(a,b);
        System.out.println(sum);

    } */

        // multiply 2 numbers using functions

        /* public static int Multiply(int a, int b){
            int mul = a*b;
            return mul;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter the value of a :");
            int a=sc.nextInt();
            System.out.print("Enter the value of b :");
            int b=sc.nextInt();

            int mul=Multiply(a,b);

            System.out.println("mul of a and b :"+mul);
        } */

            //Factorial

            public static void Factorial(int n){

                int factorial=1;
                for(int i=n; i>=1; i--){
                    factorial= factorial *i;
                }
                System.out.println(factorial);
                return;
            }
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);

            System.out.print("Enter the value of n :");
            int n=sc.nextInt();
            
            Factorial(n);

            }
}
