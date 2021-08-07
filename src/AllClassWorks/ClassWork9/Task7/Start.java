package AllClassWorks.ClassWork9.Task7;

public class Start {
    public static String capitalize(String text) {
        StringBuilder builder = new StringBuilder(text);
        if (Character.isAlphabetic(text.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));
        for (int i = 1; i < text.length(); i++)
            if (Character.isAlphabetic(text.charAt(i)) && Character.isSpaceChar(text.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));
        return builder.toString();
    }
    public static void main(String[] args) {
        Start start=new Start();
        String str="hello world Java !";
        System.out.println(start.capitalize(str));
    }
}
