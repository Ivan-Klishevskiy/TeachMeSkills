package Task1;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"lastName", "persons"}, name = "Family")
@XmlRootElement
public class Family {
    private String lastName;
    private List<Person> persons = new ArrayList<>();

    public Family() {
    }

    public Family(String lastName, List<Person> persons) {
        this.lastName = lastName;
        this.persons = persons;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElementWrapper(name = "members")
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Family{" +
                "lastName='" + lastName + '\'' +
                ", persons=" + persons +
                '}';
    }
}
