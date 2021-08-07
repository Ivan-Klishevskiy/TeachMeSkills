package AllClassWorks.ClassWork8.Task1;

public class Worker {
    private String name;
    private String surname;
    private int rate;
    private int days;

    public Worker(String name, String surname, int rate, int days) {
        this.name = name;
        this.surname = surname;
        this.rate = rate;
        this.days = days;
    }

    public void getSalary(){
        System.out.println("Salary = "+rate*days);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getRate() {
        return rate;
    }

    public int getDays() {
        return days;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
