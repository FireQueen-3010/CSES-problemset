import java.util.*;
import java.io.*;


public class Permutations {
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
        long n=sc.nextLong();
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out)); 
        if(n==1)
        output.write("1");
        else if(n==3||n==2)
        output.write("NO SOLUTION");
        else{
            if(n%2==0)
            {
                for(int i=2;i<=n;i=i+2)
                output.write(Long.toString(i)+" ");
                for(int i=1;i<n-1;i=i+2)
                output.write(Long.toString(i)+" ");
                output.write(Long.toString(n-1));
            }
            else
            {
                for(int i=1;i<=n;i=i+2)
                output.write(Long.toString(i)+" ");
                for(int i=2;i<n-1;i=i+2)
                output.write(Long.toString(i)+" ");
                output.write(Long.toString(n-1));
            }
        }
        output.flush();
    }
    
}
