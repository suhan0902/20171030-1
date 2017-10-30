import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a;
        a=in.nextInt();
        if (a%2==1)
            System.out.println("基數");
        if(a%2==0)
            System.out.println("偶數");

    }
}
