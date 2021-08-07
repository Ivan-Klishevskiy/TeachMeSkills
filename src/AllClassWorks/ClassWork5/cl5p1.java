package AllClassWorks.classwork5;

public class cl5p1 {
    public static void main(String[] args) {
        Test test=new Test();
        test.div(4,2);
        test.show("hello ","world ","!");
    }
}
class Test{
    double div(double a,double b){
        if(a!=0&&b!=0){
            return a/b;
        }else{
            return 0;
        }
    }
    void show(String a,String b,String c){
        System.out.println(a+b+c);
    }
}
