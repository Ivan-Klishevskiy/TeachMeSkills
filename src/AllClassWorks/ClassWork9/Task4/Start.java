package AllClassWorks.ClassWork9.Task4;

public class Start {
    public String deleteCharacters(String str, int length){
        String[]words=str.split(" ");
        for(String i:words){
            if(i.length()==length){
                return i;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Start start=new Start();
        String str="Hello world Java !";
        System.out.println(start.deleteCharacters(str, 4));
    }
}
