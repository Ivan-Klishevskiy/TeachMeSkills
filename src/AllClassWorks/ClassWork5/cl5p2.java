package AllClassWorks.classwork5;

public class cl5p2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2(5);
        test2.show();
    }
}

class Test2 {
    int version;

    Test2(int version) {
        this.version = version;
    }

    void show() {
        System.out.println("Hello Java");
        this.mult();
    }

    int mult() {
        return this.version * 2;
    }
}
