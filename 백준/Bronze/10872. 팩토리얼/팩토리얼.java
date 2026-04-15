import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();
        if (N == 0) {
            bw.write("1");
            bw.flush();
            bw.close();
            return;
        }
        long result = N;
        while (N-- > 1) {
            result *= N;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}