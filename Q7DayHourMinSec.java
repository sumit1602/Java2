import java.util.Scanner;

public class Q7DayHourMinSec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter seconds you want to convert into days");
        int input=sc.nextInt();
//        Double day=(input/((60.0)*(60.0)*(24.0)));
//        int hour =(input/((60)*(60)));
//        int min =(input/60);
//
//        System.out.println(input+" seconds is converted into "+day+ " number of days");
//        System.out.println(input+" seconds is converted into "+hour+ " number of hour");
//        System.out.println(input+" seconds is converted into "+min+ " number of min");
//        System.out.println(day+":"+hour+":"+min );

        int d=input/(60*60*24);
        int dh=(input)%(60*60*24);
        int h=dh/(60*60);
        int hm=dh%(60*60);
        int s=hm/(60);
        int ss=hm%(60);



        System.out.println("time is in DAY/HOUR/MINUTES/SECONDS="+d+":"+h+":"+s+":"+ss);
//   int var=129666%86400;
//   int var1=var%(60*60);
//        System.out.println(var);
//        System.out.println(var1);
//        System.out.println(hm);


    }
}
