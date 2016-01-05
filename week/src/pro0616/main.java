package pro0616;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
public static void main(String[] args) {
// 起動引数をDate型に変換するためのフォーマッタ
SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy/MM/dd");
// Date型を曜日に変換するためのフォーマッタ
SimpleDateFormat formatter2 = new SimpleDateFormat("EEEE");


if (args.length > 0) { // 起動引数の存在チェック
try {
// 起動引数をDate型に変換
Date date = formatter1.parse(args[0]);
// Date型に曜日に変換
System.out.println("その日は" + formatter2.format(date) + "です。");
} catch (ParseException e) {
// 変換エラー
System.out.println("起動引数がyyyy/MM/dd形式ではありません。");
}
} else {
// 起動引数の存在エラー
System.out.println("起動引数が指定されていません。");
}
}
}
/*起動方法
 * 実行→実行構成→引数→プログラムの引数に、yyyy/MM/ddを入力→実行
 */
