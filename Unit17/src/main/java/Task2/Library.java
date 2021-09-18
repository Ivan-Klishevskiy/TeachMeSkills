package Task2;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = "listBook",name="Library")
@XmlRootElement
public class Library {
    @JsonProperty("listBook")
    List<Book> listBook = new ArrayList<>();

    public Library() {
    }

    public Library(List<Book> listBook) {
        this.listBook = listBook;
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }

    @Override
    public String toString() {
        return "Library{" +
                "listBook=" + listBook +
                '}';
    }
}
