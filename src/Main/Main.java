package Main;
import Exhibition.Exhibition;
import Exhibition.Paints.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // AUTHORS
        Author vinci = new Author("Леонадро", "да Винчи");
        Author vangog = new Author("Винсент", "ван Гог");
        Author picasso = new Author("Пабло", "Пикассо");

        // PAINTINGS
        Painting[] paintings_list = new Painting[5];
        paintings_list[0] = new Painting(picasso, "Герника");
        paintings_list[1] = new Painting(picasso, "Авиньонские девицы");
        paintings_list[2] = new Painting(vangog, "Звездная ночь");
        paintings_list[3] = new Painting(vangog, "Автопортрет");
        paintings_list[4] = new Painting(vinci, "Мона Лиза");

        // SCANNER INPUT NAME AND PRICE
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя выставки: ");
        String name = in.nextLine();
        System.out.print("Введите цену входа: ");
        int price = in.nextInt(); in.nextLine();

        // CREATE EXHIBITION
        Exhibition exhibition = new Exhibition(name, price);

        // ADD PAINTINGS
        for (int i=0; i<5; i++) {
            System.out.println(paintings_list[i].get_information());
            System.out.print("Введите 'Да' если хотите добавить картину: ");
            String answer = in.nextLine();
            if (answer.equals("Да")) {
                exhibition.add_painting(paintings_list[i]);
            }
        }

        // RETURN INFO ABOUT EXHIBITION
        System.out.println();
        System.out.println("Имя выставки: " + exhibition.get_name());
        System.out.println("Цена входа: " + exhibition.get_price());
        System.out.println("Картины: ");
        exhibition.print();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        else {
            return false;
        }
    }
}