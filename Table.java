import java.util.*;

public class Table {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("\n");
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
