package src;
import java.util.*;

public class B_RectangleDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] S = new String[10];
        for (int i = 0; i < S.length; i++) {
            S[i] = scanner.next();
        }
        scanner.close();
        int count = 0;
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        for (int i = 0; i < S.length; i++) {
            if (C == 0) {
                C = S[i].indexOf("#") + 1;
                D = S[i].lastIndexOf("#") + 1;
                A = i + 1;
            }
            if (S[i].contains("#")) {
                count++;
            }
        }
        B = A + count - 1;
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
}

