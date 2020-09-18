package Exhibition.Paints;

public class Author {
    private int id;
    private String name;
    private String surname;
    private static int amount = 0;

    public Author() {
        this.id = amount;
        amount++;
        this.name = "Неизвестно";
        this.surname = "";
    }
    public Author(String new_name, String new_surname) {
        this.id = amount;
        amount++;
        this.name = new_name;
        this.surname = new_surname;
    }
    public String toString() {
        return "Автор: " + name + " " + surname;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
