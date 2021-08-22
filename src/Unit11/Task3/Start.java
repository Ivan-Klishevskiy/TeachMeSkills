package Unit11.Task3;

public class Start {
    public static void main(String[] args) {
        String txt= TxtFormatter.funcReader("src/Unit11/Task3/Text.txt");
        String blackWord=TxtFormatter.funcReader("src/Unit11/Task3/BlackList.txt");
        String[]arrTxt=TxtFormatter.parsingFunc(txt);
        TxtFormatter.checkTxt(arrTxt,blackWord);
    }
}
