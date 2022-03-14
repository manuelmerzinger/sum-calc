package at.jku.se;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Enter two numbers:");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("Result: " + sum(a,b));
        }
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
