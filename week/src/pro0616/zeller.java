package pro0616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zeller {
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		{

			System.out.println("任意の日にちの曜日を求めます。");

			String s;
			String t;
			String u;
			String v;
			int a ;
			int b ;
			int c;
			int d;

			System.out.println("西暦（上二桁）を入力してください（例：19）");
			s = buf.readLine();
			a = Integer.parseInt(s);

			System.out.println("西暦（下二桁）を入力してください（例：94）");
			t = buf.readLine();
			b = Integer.parseInt(t);
			
			System.out.println("月を入力してください（例：11）");
			u = buf.readLine();
			c = Integer.parseInt(u);
			
			System.out.println("日を入力してください（例：02）");
			v = buf.readLine();
			d = Integer.parseInt(v);
			
			int x = a * 21 /4;
			int y = b * 5 / 4;
			int z = (c + 1) * 13 / 5;
			
			int ans = (x + y + z + d) % 7;
			
			if (ans == 0){
				System.out.println("その日は土曜日です。");
			}else if (ans == 1){
				System.out.println("その日は日曜日です。");
			}else if (ans == 2){
				System.out.println("その日は月曜日です。");
			}else if (ans == 3){
				System.out.println("その日は火曜日です。");
			}else if (ans == 4){
				System.out.println("その日は水曜日です。");
			}else if (ans == 5){
				System.out.println("その日は木曜日です。");
			}else if (ans == 6){
				System.out.println("その日は金曜日です。");
			}

		}
	}
}
