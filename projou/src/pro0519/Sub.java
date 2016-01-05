package pro0519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sub {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		{

			System.out.println("ax+by=Aとcx+dy=Bを連立方程式で解きます。");

			String s;
			String t;
			String u;
			String v;
			String w;
			String x;
			int a ;
			int b ;
			int c;
			int d;
			float ans;
			float ans2;
			float g;
			float f;
			int r;
			int e;
			int h;
			float i;
			int j;
			float k;
			int l;
			int m;
			float n;
			int o;
			float p;
			int q;

			System.out.println("整数aを入力してください。");
			s = buf.readLine();
			a = Integer.parseInt(s);
			g = Integer.parseInt(s);
			e = Integer.parseInt(s);

			System.out.println("整数bを入力してください。");
			t = buf.readLine();
			b = Integer.parseInt(t);
			f = Integer.parseInt(t);
			h = Integer.parseInt(t);

			System.out.println("整数Aを入力してください。");
			w = buf.readLine();
			m = Integer.parseInt(w);
			n = Integer.parseInt(w);

			System.out.println("整数cを入力してください。");
			u = buf.readLine();
			c = Integer.parseInt(u);
			i = Integer.parseInt(u);
			j = Integer.parseInt(u);

			System.out.println("整数dを入力してください。");
			v = buf.readLine();
			d = Integer.parseInt(v);
			k = Integer.parseInt(v);
			l = Integer.parseInt(v);
			q = Integer.parseInt(v);

			System.out.println("整数Bを入力してください。");
			x = buf.readLine();
			o = Integer.parseInt(x);
			p = Integer.parseInt(x);

			if (m == 0&&o == 0){
				System.out.println("解はx=0,y=0です。");
			}else{
				if(a == 0&&b == 0&&m == 0){
					System.out.println("解を求められません。a,b,A全てに0を入力しないでください。" );
				}else{

					if (c == 0&& d == 0&&n == 0){
						System.out.println("解を求められません。c,d,B全てに0を入力しないでください。" );
					}else{
						if(a*d==b*c && (g*p-i*n)!=0 && (n*k-p*f)!=0){
							System.out.println(a + "x+" + b + "y=" + m +"と" + c + "x+" + d + "y=" + o + "は、解なしです。"  );
						}else{
							ans = (n*k-p*f)/(g*k-i*f);
							ans2 = (g*p-i*n)/(g*k-i*f);
							if((n*k-p*f)==0){
								if(q == 0 && h == 0){
									System.out.println(a + "x+" + b + "y=" + m +"と" + c + "x+" + d + "y=" + o + "は、解なしです。"  );
								}else{
								System.out.println("x=t");
								}
							}else{
								if((m*l-o*h)%(e*l-j*h)==0){
									System.out.println("x=" + ans);
								}else{
									int A =(m*l-o*h);
									int B =(e*l-j*h);
									while ((r = A%B) != 0) {
										A = B;
										B = r;
									}	//最大公約数bの計算
									System.out.println("x=" + (m*l-o*h)/B + "/" + (e*l-j*h)/B + "又、" + ans);
								}
							}//x出力(約分済み)
							if((n*k-p*f)==0){
								if(q != 0 && h != 0){
								System.out.println("y=" + -1*j + "/" + q + "t" + "+" + o + "/" + q);
								System.out.println("tはすべての実数です。");
								}
							}else if((e*o-j*m)%(e*l-j*h)==0){
								System.out.println("y=" + ans2);
							}else{

								System.out.println("y=" + (e*o-j*m) + "/" + (e*l-j*h) + "又、" + ans2);
							}//y出力(約分せず)
						}
					}
				}
			}
		}//end BufferedReader
	}//end main
}//end Sub


