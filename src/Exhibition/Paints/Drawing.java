package Exhibition.Paints;

public class Drawing extends Picture{
    protected String name;
    Drawing() {
        this.name = "Unknown";
    }
    Drawing(String new_name) {
        this.name = new_name;
    }
    public void set_name(String new_name) {
        this.name = new_name;
    }
    public String get_name() {
        return this.name;
    }
}