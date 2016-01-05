package pro0714;

import java.io.IOException;
public class main { 
	public static void main(String[] args) { 
	System.out.println("A-Z,.,?の中の文字を入力してください");
//	String dot = new String(".");
//	String que = new String("?");
	byte[] input = new byte[1024];

	int length = 0; 
	//入力待ち 
try { 
	length = System.in.read(input); 
	} catch (IOException e) { 
	e.printStackTrace(); 
	} 

	//入力した文字を数字に変える 
for(int i=0;i<length;i++){ 
	//「a」が1なのでaのコード番号を引いて1を足す 
int num = input[i] - 'a' + 1; 
	if(num > 0){ 

	System.out.println(num); 
		
	} 
	} 
	} 
} 