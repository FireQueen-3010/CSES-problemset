import java.util.*;

public class missingNumber{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        for(int i=1;i<n;i++)
        {
            int e=sc.nextInt();
            arr[e]=e;
        }
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==0)
            {
                System.out.println(i);
                break;
            }

        }
        sc.close();
    }
}