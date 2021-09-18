package Task1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        Collections.addAll(personList, new Person("Гомер", 30, "Пиво")
                , new Person("Мардж", 28, "Уборка")
                , new Person("Барт", 12, "Программирование на php")
                , new Person("Лиза", 10, "Пиво Охота крепкое"));
        Family family = new Family("Симпсоны", personList);

        try {
            JAXBContext context = JAXBContext.newInstance(Family.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(family, new BufferedWriter(new FileWriter("Unit17/src/main/java/Task1/familyXML.xml")));
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }
}
