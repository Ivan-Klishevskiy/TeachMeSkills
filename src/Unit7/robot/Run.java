package Unit7.robot;


import Unit7.robot.hands.IHand;
import Unit7.robot.hands.SamsungHand;
import Unit7.robot.hands.ToshibaHand;
import Unit7.robot.heads.IHead;
import Unit7.robot.heads.SamsungHead;
import Unit7.robot.heads.SonyHead;
import Unit7.robot.heads.ToshibaHead;
import Unit7.robot.legs.ILeg;
import Unit7.robot.legs.SamsungLeg;
import Unit7.robot.legs.SonyLeg;
import Unit7.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHand handSamsung=new SamsungHand(2000);
        IHand handSony=new SamsungHand(150);
        IHand handToshiba=new ToshibaHand(350);

        IHead headSamsung=new SamsungHead(50);
        IHead headSony=new SonyHead(180);
        IHead headToshiba=new ToshibaHead(380);

        ILeg legSamsung=new SamsungLeg(500);
        ILeg legSony=new SonyLeg(1000);
        ILeg legToshiba=new ToshibaLeg(400);

        IRobot jora =new Robot(headSamsung,handSony,legSamsung);
        IRobot nikitos = new Robot(headSamsung,handToshiba,legSony);
        IRobot navalniy = new Robot(headToshiba,handSamsung,legToshiba);

        jora.action();
        System.out.println();
        nikitos.action();
        System.out.println();
        navalniy.action();


        if(jora.getPrice()>= nikitos.getPrice()&&jora.getPrice()>= navalniy.getPrice()){
            System.out.println("\nРобот jora самый дорогой, стоимость которого = "+jora.getPrice());
        }else if(nikitos.getPrice()>=navalniy.getPrice()&&nikitos.getPrice()>= jora.getPrice()){
            System.out.println("\nРобот nikitos самый дорогой, стоимость которого = "+nikitos.getPrice());
        }else{
            System.out.println("\nРобот navalniy самый дорогой, стоимость которого = "+navalniy.getPrice());
        }

    }
}
