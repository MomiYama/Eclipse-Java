package pro0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


 class sub{
 public static void main(String[] args)throws IOException{
 String str;

 //入力//
BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
 System.out.print("a-zを入力してください");
str=in.readLine();
 //変換//
 str = str.replaceAll("a","1");
 str = str.replaceAll("b","2");
 str = str.replaceAll("c","3");
 str = str.replaceAll("d","4");
 str = str.replaceAll("e","5");
 str = str.replaceAll("f","6");
 str = str.replaceAll("g","7");
 str = str.replaceAll("h","8");
 str = str.replaceAll("i","9");
 str = str.replaceAll("j","10");
 str = str.replaceAll("k","11");
 str = str.replaceAll("l","12");
 str = str.replaceAll("m","13");
 str = str.replaceAll("n","14");
 str = str.replaceAll("o","15");
 str = str.replaceAll("p","16");
 str = str.replaceAll("q","17");
 str = str.replaceAll("r","18");
 str = str.replaceAll("s","19");
 str = str.replaceAll("t","20");
 str = str.replaceAll("u","21");
 str = str.replaceAll("v","22");
 str = str.replaceAll("w","23");
 str = str.replaceAll("x","24");
 str = str.replaceAll("y","25");
 str = str.replaceAll("z","26");




 //出力//
System.out.print(str);

BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
{
System.out.print("パラメータkを入力してください");
String s = buf.readLine();
int a = Integer.parseInt(s);
String regex = "a";
Pattern p = Pattern.compile(regex);
Matcher m = p.matcher(str);
if(m.find()){
	int x = (1 * a)%29;
	if(x == 17){
		System.out.println("q");
	}

}


}

}

}