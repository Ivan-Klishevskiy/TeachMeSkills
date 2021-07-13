package Unit2;

public class Unit2Task8 {
    public static void main(String[] args) {
     int count=1;
     int space=3;
     int i=0;
     int j=0;
     for(i=0;i<=8;i++){
         if(i==4){
             System.out.println();
             continue;
         }
         for(j=0;j<space;j++){
             System.out.printf(" ");
         }
         for(j=0;j<count;j++){
             System.out.printf("*");
         }
         System.out.println();
         if(i<3){
             count++;
             space--;
         }
         if(i>3){
             count--;
             space++;
         }
     }
    }
}
