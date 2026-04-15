import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            if (line.length() % 2 == 0) {
                Deque<Character> stack = new ArrayDeque<>();
                boolean flag = true;
                for (int j = 0; j < line.length(); j++) {
                    char c = line.charAt(j);
                    if (c == '(') {
                        stack.push(c);
                    } else {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
                bw.write((flag && stack.isEmpty() ? "YES" : "NO") + "\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}