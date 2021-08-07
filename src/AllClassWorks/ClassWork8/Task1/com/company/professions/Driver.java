package AllClassWorks.ClassWork8.Task1.com.company.professions;

public class Driver {
    private String name;
    private int workExperience;

    public Driver(String name, int workExperience) {
        this.name = name;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }

}
