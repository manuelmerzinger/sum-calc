package at.jku.se;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Gib 2 Zahlen ein:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Ergebnis: "+sum(a,b));
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
