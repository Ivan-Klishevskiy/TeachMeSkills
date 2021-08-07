package AllClassWorks.classwork2;

public class Cl2T2 {
    public static void main(String[] args) {
        int ms[]={-1,-2,3,6,-10,99};
        int min=ms[0];
        for(int i=0;i<6;i++){
            if(ms[i]<min&&ms[i]<0){
                min=ms[i];
            }
        }
        if(min<0) {
            System.out.println(min);
        }
    }
}
