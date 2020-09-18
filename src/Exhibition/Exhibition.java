package Exhibition;
import Exhibition.Paints.*;

import java.util.ArrayList;

public class Exhibition implements Printable {
    private String name;
    private double price;
    protected int paintings_amount = 0;
                                    // ADD CLASS PAINTING, CHANGE CODE BELOW
    private ArrayList<Painting> paintings = new ArrayList<Painting>(5);

    public void set_name(String new_name) {
        this.name = new_name;
    }
    public String get_name() {
        return this.name;
    }
    public void set_price(int new_price) {
        this.price = new_price;
    }
    public double get_price() {
        return this.price;
    }
    public void print() {
        for (int i=0;i<this.paintings_amount; i++) {
            System.out.println(i+1 + ". " + this.get_paintings().get(i).get_information());
        }
    }
                                    // ADD CLASS PAINTING, CHANGE CODE BELOW
    public void add_painting(Painting a) {
        paintings.add(a);
        paintings_amount++;
    }
    public void delete_paintings() {
        paintings = null;
    }
    public ArrayList<Painting> get_paintings() {
        return this.paintings;
    }

    public Exhibition() {
        this.name = "Неизвестно";
        this.price = 0;
    }

    public Exhibition(String new_name, double new_price) {
        this.name = new_name;
        this.price = new_price;
    }

}
