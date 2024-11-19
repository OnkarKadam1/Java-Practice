public class Pattern07 {
    public static void main(String[] args){
        int n=5;
        int k=n-1;
        int a=0;
        for(int i=n*2; i>0; i--)
        {
            for(int j=1; j<n*2; j++)
            {
                if(i>n){
                    if(j<=n-k || j>=n+k)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                if(i<=n)
                {
                    if(j>=n-a || j<=n+a)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            k--;
            a++;
        }
    }
}
