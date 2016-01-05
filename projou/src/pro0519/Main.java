package pro0519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		{

			System.out.println("ax+b=0の解を求めます。");

			String s;
			String t;
			int a ;
			int b ;
			float ans;
			float c;
			float f;
			int r;
			int e;
			int d;

			System.out.println("整数aを入力してください。");
			s = buf.readLine();
			a = Integer.parseInt(s);
			c = Integer.parseInt(s);
			e = Integer.parseInt(s);

			System.out.println("整数bを入力してください。");
			t = buf.readLine();
			b = Integer.parseInt(t);
			d = Integer.parseInt(t);
			f = Integer.parseInt(t);
			
			if(a == 0 && b == 0){
				System.out.println(a + "x+" + b + "=0の解は、全ての実数です。" );
			}else{
			
				if (b == 0){
					ans = 0;
					System.out.println(a + "x+" + b + "=0の解は、x=" + ans +"です。" );
				}else{
					if(a == 0){
						System.out.println(e + "x+" + d + "=0の解は、解なしです。");
					}else{
						ans = -f/c;	//=a/b
						
						if(b%a==0){
							System.out.println(a + "x+" + b + "=0の解は、x=" + ans + "です。");
						}else{
							
						while ((r = a % b) != 0) {
							 a = b;
							 b = r;
						}	//最大公約数bの計算
		
						System.out.println(e + "x+" + d + "=0の解は、x=" + -d/b + "/" + e/b + "で、又" + ans + "です。");
	
						}
					
					}
				}
			}

		}

	}

}
