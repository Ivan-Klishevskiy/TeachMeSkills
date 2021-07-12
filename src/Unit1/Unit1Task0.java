package Unit1;

public class Unit1Task0 {
    public static void main(String[] args) {
        int month=4;
        int day=27;
        double ans=0;

        //Arithmitic
        ans=month+day;
        System.out.println("month+day = "+ans);

        ans=month+=day;
        System.out.println("month+=day = "+ans);

        ans=month-day;
        System.out.println("month-day = "+ans);

        ans=month-=day;
        System.out.println("month-=day = "+ans);

        ans=month*day;
        System.out.println("month*day = "+ans);

        ans=month*=day;
        System.out.println("month*=day = "+ans);

        ans=month/day;
        System.out.println("month/day = "+ans);

        ans=month/=day;
        System.out.println("month/=day = "+ans);


        ans=day%month;
        System.out.println("month%day = "+ans);

        ans=day%=month;
        System.out.println("day%=month = "+ans);

        month++;
        System.out.println("month++ = "+month);

        day--;
        System.out.println("day-- = "+day);

        //Bitwise
        System.out.println(~day);
        System.out.println(day&month);
        System.out.println(day|month);
        System.out.println(day^month);
        System.out.println(day<<month);
        System.out.println(day>>month);

        //Comparison
        System.out.println(day<month);
        System.out.println(day<=month);
        System.out.println(day>month);
        System.out.println(day>=month);
        System.out.println(day==month);
        System.out.println(day!=month);

        //Logical
        if(day == 27 && month != 4 || day!=27){
            System.out.println("True");
        }
    }
}
