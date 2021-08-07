package AllClassWorks.classwork6Reborn.part1;

public class CelsiusConverter extends BaseConverter {
    @Override
    double convert(double format) {
        System.out.println("Convert to celsius");
        return format*2;
    }
}
