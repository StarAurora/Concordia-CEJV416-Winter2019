package Lab3;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarLab {
	public static void main(String[]args) {
		int year,month;
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		if(args.length>=1) {
			try {
				year = Integer.parseInt(args[0]);
				if(year<0||year>5000) {
					System.out.println(" ");
					System.exit(0);}
			}catch(NumberFormatException e){
				System.out.println("");
				
			}
		}
		if(args.length>=2) {
			try {
				month = Integer.parseInt(args[1]);
				if(month<=0||month>12) {
					System.out.println("Month incorrect");
					System.exit(0);}
			}catch(NumberFormatException e){
					System.out.println("");
					System.exit(0);
			}
		}
		String b[] = new String[42];
		calendar.set(year,month-1,1);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)-1;//
		int days = 0;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			days = 31;
		}
		if(month==4||month==6||month==9||month==11) {
			days = 30;
		}
		if(month==2) {
			if(year%4==0&&year%100!=0||year%400==0) {
				days = 29;
			}else {
				days = 28;
			}
		}
		int j;
		for(j=0;j<42;j++)
			b[j]=" ";
		for(j=0;j<days;j++) {
			b[j+dayOfWeek] = String.valueOf(j+1);
		}
		System.out.println("\t\t"+year+"Year"+month+"Month");
		System.out.println("\tSUN MON TUE WED THU FRI SAT");
		for(j=0;j<42;j++) {
			if(j!=0&&j%7==0)
				System.out.println();
			if(b[j].length()==1)
				System.out.print("");
			System.out.print("\t"+b[j]);
		}
	}
	
}
