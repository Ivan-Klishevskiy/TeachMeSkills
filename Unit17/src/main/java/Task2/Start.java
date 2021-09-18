package Task2;

import Task1.Family;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {
    public static void toXML(Library library, String filename) {
        try {
            JAXBContext context = JAXBContext.newInstance(Library.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(library,new FileWriter(filename));
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void toJSON(Library library, String filename){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filename), library);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        Collections.addAll(list, new Book("BELIKEFirstArt", "BELIKEAv1", 2002)
                , new Book("BELIKEFirstArt1", "BELIKEAv2", 2003)
                , new Book("BELIKEFirstArt2", "BELIKEAv3", 2004));

        Book book1 = new Book("FirstArt", "Av1", 2001, list);
        Book book2 = new Book("SecondArt", "Bv2", 1998);
        List<Book> forArgs = new ArrayList<Book>();
        Collections.addAll(forArgs, book1, book2);
        Library library =new Library(forArgs);
        toXML(library,"Unit17/src/main/java/Task2/libraryXML.xml");
        toJSON(library,"Unit17/src/main/java/Task2/libraryJSON.json");
    }
}
