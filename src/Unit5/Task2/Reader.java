package Unit5.Task2;

public class Reader {
    String name;
    int readersNumber;
    String faculty;
    String dateOfBirth;     //в формате хх.хх.хххх
    int phoneNumber;

    public Reader(String name, int readersNumber, String faculty, String dateOfBirth, int phoneNumber) {
        this.name = name;
        this.readersNumber = readersNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    void takeBook(int count){
        System.out.println(name+" взял "+count+"книги");
    }

    void takeBook(String... title){
        System.out.print(name+" взял книги: ");
        for(int i=0;i<title.length;i++){
            System.out.print(title[i]);
            if(i< title.length-1){
                System.out.print(", ");
            }
        }
    }

    void takeBook(Book ... obj){
        System.out.print(name+" взял книги: ");
        for(int i=0;i<obj.length;i++){
            System.out.print(obj[i].title);
            if(i< obj.length-1){
                System.out.print(", ");
            }
        }
    }

    void returnBook(int count){
        System.out.println(name+" вернул "+count+"книги");
    }

    void returnBook(String ... title){
        System.out.print(name+" вернул книги: ");
        for(int i=0;i<title.length;i++){
            System.out.print(title[i]);
            if(i< title.length-1){
                System.out.print(", ");
            }
        }
    }

    void returnBook(Book ... obj){
        System.out.print(name+" вернул книги: ");
        for(int i=0;i<obj.length;i++){
            System.out.print(obj[i].title);
            if(i< obj.length-1){
                System.out.print(", ");
            }
        }
    }

}
