package Unit6;

public class Main {
    public static void main(String[] args) {
        Passenger passenger=new Passenger(350,1000,2500,
                Enum.AUDI.getTitle(),4,15,"C100",2);
        passenger.range(2);

        Cargo cargo=new Cargo(1500,150,8000,Enum.VOLVO.getTitle(), 8,210,15000);
        cargo.checkLoad(9000);
        Civil civil=new Civil(200,300,4212,900,
                2000,Enum.BOEING.getTitle(), 5,true);
        civil.checkPassenger(300);
        Military military=new Military(400,10,5000,
                1200,25000,Enum.Airbus.getTitle(), false,1);
        military.shot();
        military.shot();
        military.checkCatapult();
        military.show();
    }
}
