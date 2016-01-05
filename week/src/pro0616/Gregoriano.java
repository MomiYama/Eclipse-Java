package pro0616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Gregoriano {
	
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		{

			System.out.println("任意の日にちの曜日を求めます。");

			String s;
			String t;
			String u;
			String v;
			int a;
			int b;
			int c;
			int x;
			int y;

			System.out.println("西暦を入力してください（例：1994）");
			s = buf.readLine();
			a = Integer.parseInt(s);

			System.out.println("月を入力してください（例：11）");
			t = buf.readLine();
			b = Integer.parseInt(t);
			
			System.out.println("日を入力してください（例：2）");
			u = buf.readLine();
			c = Integer.parseInt(u);
			
			if(b < 3){
				a = a - 1;
				b = b + 13;
			}else{
				b =b + 1;
			}
			
			int aa = (int) (a * 365.25);
			int bb = (int)(b * 30.6);
			int cc = (int)(a / 400);
			int dd = (int)(a / 100);
			x = aa + bb + cc + c - dd -429;
			y = x - (int)(x / 7)* 7;
			
			if(y == 0){
				System.out.println("その日は月曜日です。");
			}else if(y == 1){
				System.out.println("その日は火曜日です。");
			}else if(y == 2){
				System.out.println("その日は水曜日です。");
			}else if(y == 3){
				System.out.println("その日は木曜日です。");
			}else if(y == 4){
				System.out.println("その日は金曜日です。");
			}else if(y == 5){
				System.out.println("その日は土曜日です。");
			}else{
				System.out.println("その日は日曜日です。");
			}
			
		}
	}
			
}
