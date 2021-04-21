import java.util.*;
import java.io.*;

public class increaseArray {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String args[])throws IOException {
        FastReader sc = new FastReader();
        int n=sc.nextInt();
        long prev=sc.nextLong();
        long moves=0;
        for(int i=1;i<n;i++)
        {
            long e=sc.nextLong();
            if(e<prev)
            {
                moves+=(prev-e);
                long curr=(prev-e);
                prev=e+curr;
            }
            else{
                prev=e;
            }
        }
        System.out.println(moves);
    }
    
}
