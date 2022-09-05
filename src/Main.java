import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a,b,c;
        double field,perimeter,u;
        System.out.println("1. kenarı giriniz");

        a=scanner.nextInt();
        System.out.println("2. kenarı giriniz");
        b=scanner.nextInt();
        System.out.println("3. kenarı giriniz");
        c=scanner.nextInt();

        perimeter=a+b+c;
        u=perimeter/2;
        field=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: "+field);
    }
}
