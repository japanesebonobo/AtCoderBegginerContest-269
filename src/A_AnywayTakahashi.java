package src;
import java.util.*;

public class A_AnywayTakahashi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        
        int ans = (a+b)*(c-d);

        System.out.println(ans);
        System.out.println("Takahashi");
    }
}

