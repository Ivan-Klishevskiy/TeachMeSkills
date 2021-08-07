package AllClassWorks.ClassWork9.Task3;

public class Start {
    void func(String name, String mark, String sub){
        String substring = name.substring(0, 15);
        StringBuilder strForName=new StringBuilder("               ");
        StringBuilder strForMark=new StringBuilder("   ");
        StringBuilder strForSub=new StringBuilder("          ");
        strForMark.replace(0,mark.length()-1,mark);
        strForSub.replace(0,sub.length()-1,sub);
        strForName.replace(0,name.length()-1,name);
        System.out.println("Студент "+strForName.append(" получил ").append(strForMark).append("по ").append(strForSub));
    }

    public static void main(String[] args) {
        Start start=new Start();
        start.func("Иванов","5","Программированию");
    }
}
