package pro0616;

import java.util.Calendar;

class testCalendar1{
  public static void main(String args[]){
    String[] week_name = {"日曜日", "月曜日", "火曜日", "水曜日",
                          "木曜日", "金曜日", "土曜日"};

    Calendar calendar = Calendar.getInstance();

    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int day = calendar.get(Calendar.DATE);
    int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;


    System.out.println("現在の日時は");
    System.out.println(year + "年" + month + "月" + day + "日");
    System.out.println("(" + week_name[week] + ")");
  }
}