import java.io.*;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class weirdAlgo {
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
        int n = sc.nextInt();
                
        BufferedWriter output = new BufferedWriter(
            new OutputStreamWriter(System.out));
        while (n>0) {
            output.write(n+" ");
            if (n % 2 == 0)
                n /= 2;
            else if(n==1)
            n=0;
            else
                n = n * 3 + 1;
        }
        output.flush();

    }
}