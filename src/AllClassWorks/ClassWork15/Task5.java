package AllClassWorks.ClassWork15;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

abstract class Figure {
    protected String color;
    protected String name;

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}

class Square extends Figure {

    public Square(String color, String name) {
        super(color, name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Circle extends Figure {

    public Circle(String color, String name) {
        super(color, name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Task5 {
    public static void main(String[] args) {
        List<Circle> listCircle = List.of(new Circle("Red", "Victor"),
                new Circle("Green", "Nikolay"));
        Map<String, String> listSquare = listCircle
                .stream()
                .map(s -> new Square(s.getColor(), s.getName())).collect(Collectors.toMap(Figure::getColor, Figure::getName));
    }
}
