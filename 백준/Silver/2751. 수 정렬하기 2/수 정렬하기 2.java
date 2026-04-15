import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            ts.add(Integer.parseInt(br.readLine()));
        }
        for (Integer num : ts) {
            bw.write(num + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}