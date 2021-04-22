import java.util.*;
import java.io.*;

public class weirdAlgo{

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)throws IOException {
        
        FastReader sc = new FastReader();
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out)); 
        long n = sc.nextLong();

        while(n>1){

            output.write(n + " ");
            if(n%2 == 0){
                n/=2;
            }else{
                n*=3;
                n++;
            }
        }

        output.write("1");
        output.flush();
    }
}