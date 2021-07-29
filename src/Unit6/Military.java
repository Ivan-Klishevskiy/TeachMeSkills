package Unit6;

public class Military extends AbstractAir {
    boolean catapult;
    int numbersOfMissiles;

    public Military(int wingspan, int lengthOfTheRunway, int power, int maxSpeed, int weight, String mark, boolean catapult, int numbersOfMissiles) {
        super(wingspan, lengthOfTheRunway, power, maxSpeed, weight, mark);
        this.catapult = catapult;
        this.numbersOfMissiles = numbersOfMissiles;
    }

    @Override
    public void show() {
        System.out.println("Military:");
        super.show();
        System.out.println(" catapult=" + catapult +
                ", numbersOfMissiles=" + numbersOfMissiles+" power = " + (power * 0.74));
    }


    public void shot() {
        if (numbersOfMissiles > 0) {
            System.out.println("Ракета пошла…");
            numbersOfMissiles--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void checkCatapult() {
        if (catapult) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
