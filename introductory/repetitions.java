import java.util.*;
import java.io.*;

public class repetitions {
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
        String s=sc.nextLine();
        long max=1;
        long curr=1;
        char ch=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(ch==s.charAt(i))
            curr++;
            else{
                max=Math.max(curr,max);
                curr=1;
                ch=s.charAt(i);
            }
        }
        max=Math.max(curr,max);
                
        // BufferedWriter output = new BufferedWriter(
        //     new OutputStreamWriter(System.out));
            System.out.println(max);
    }
    
    
}
