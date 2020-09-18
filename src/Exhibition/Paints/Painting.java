package Exhibition.Paints;

public class Painting extends Drawing {
    private Author author;

    public Painting() {
        Author a = new Author("a", "s");
        name = "Неизвестно";
    }
    public Painting(Author new_author, String new_name) {
        this.author = new_author;
        this.name = new_name;
    }
    public Author get_author() {
        return this.author;
    }
    public String get_information() {
        return this.author.toString() + ". Картина: " + this.name;
    }
}