package baekjoon.string;

import java.io.*;
import java.util.StringTokenizer;

public class String_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < n; k++) {
                    bw.write(str.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();

        bw.close();
        br.close();

    }
}
