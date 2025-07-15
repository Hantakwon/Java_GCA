package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 10단계 8번 문제
*/
public class Main8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());

		int maxN = 0;
		if (x > y) {
			if (y > z)
				maxN = x;
			else
				maxN = (x > z) ? x : z;
		} else
			maxN = (y > z) ? y : z;

		if (x + y + z - maxN > maxN)
			System.out.println(x + y + z);
		else
			System.out.print((x + y + z - maxN) * 2 - 1);

		br.close();
	}
}
