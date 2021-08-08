package Unit8.Task2;

public class Main {
    public static void main(String[] args) {
        IStart [] spaceships=new IStart[3];
        spaceships[0]=new Shuttle();
        spaceships[1]=new Falcon();
        spaceships[2]=new Shepard();
        Cosmodrome cosmodrome=new Cosmodrome();

        for(IStart i:spaceships){
            cosmodrome.launch(i);
            System.out.println();
        }
    }
}
