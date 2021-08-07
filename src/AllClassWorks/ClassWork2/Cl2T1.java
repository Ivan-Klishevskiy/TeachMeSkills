package AllClassWorks.classwork2;

public class Cl2T1 {
    public static void main(String[] args) {
        int ms[]={-1,-2,3,6,-10,99};
        int sum=0;
        for(int i=0;i<6;i++){
            if(ms[i]>0){
                sum+=ms[i];
            }
        }
        System.out.println(sum);
    }
}
