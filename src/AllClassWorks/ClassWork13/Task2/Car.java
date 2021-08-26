package AllClassWorks.ClassWork13.Task2;

public class Car {
    private String name;
    private boolean isFullDrive;
    private boolean isGusEngine;

    public Car(String name, boolean isFullDrive, boolean isGusEngine) {
        this.name = name;
        this.isFullDrive = isFullDrive;
        this.isGusEngine = isGusEngine;
    }

    public String getName() {
        return name;
    }

    public boolean getIsFullDrive() {
        return isFullDrive;
    }

    public boolean getIsGusEngine() {
        return isGusEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", isFullDrive='" + isFullDrive + '\'' +
                ", isGusEngine='" + isGusEngine + '\'' +
                '}';
    }
}
