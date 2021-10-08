package AllClassWorks.ClassWork12.Task3;

public class HeavyBox {
    private String name;

    public HeavyBox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "name='" + name + '\'' +
                '}';
    }
}
