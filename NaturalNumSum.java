import java.util.*;

public class NaturalNumSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            for(int i=1; i<=n; i++){
                sum = sum+i;
            }
            System.out.println(sum);
        }
    }
}