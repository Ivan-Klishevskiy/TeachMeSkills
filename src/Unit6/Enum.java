package Unit6;

public enum Enum {
        AUDI("Audi"),
        BMW("BMW"),
        MUSTANG("Mustang"),
        VOLVO("Volvo"),
        BOEING("Boeing"),
        Airbus("Airbus");

        private final String title;

        Enum(String title) {
                this.title = title;
        }

        public String getTitle() {
                return title;
        }
}
