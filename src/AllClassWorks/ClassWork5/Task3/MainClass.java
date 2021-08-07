package AllClassWorks.classwork5.Task3;

public class MainClass {
    public static void main(String[] args) {
        Phone phone1=new Phone(375284,"Iphone",200);
        Phone phone2=new Phone(332545,"Huawei",100);
        Phone phone3=new Phone(533325,"Nokia",150);
        System.out.println("phone1 = "+phone1.model+" "+phone1.number+" "+phone1.weight);
        System.out.println("phone2 = "+phone2.model+" "+phone2.number+" "+phone2.weight);
        System.out.println("phone3 = "+phone3.model+" "+phone3.number+" "+phone3.weight);
        phone1.receiveCall("Abobus");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Ilon");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Jorjio");
        System.out.println(phone3.getNumber());
        System.out.println("\n");
        phone1.sendMessage(34525,53253,6745,6453,7658);
    }
}
