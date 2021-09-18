package Task2;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"article", "name", "year", "beLikeBooks"}, name = "Book")
@XmlRootElement
public class Book {
    @JsonProperty("article")
    private String article;
    @JsonProperty("name")
    private String name;
    @JsonProperty("year")
    private int year;
    private List<Book> beLikeBooks = new ArrayList<>();

    public Book() {
    }

    public Book(String article, String name, int year) {
        this.article = article;
        this.name = name;
        this.year = year;
    }

    public Book(String article, String name, int year, List<Book> beLikeBooks) {
        this.article = article;
        this.name = name;
        this.year = year;
        this.beLikeBooks = beLikeBooks;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Book> getBeLikeBooks() {
        return beLikeBooks;
    }

    public void setBeLikeBooks(List<Book> beLikeBooks) {
        this.beLikeBooks = beLikeBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "article='" + article + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", beLikeBooks=" + beLikeBooks +
                '}';
    }
}
