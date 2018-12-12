public class Author implements Cloneable{
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Book b = new Book("war and peace","Leo Tolstoy");
        Book b2 = b.clone();
        b2.setAuthor("Ivan Turgenev");
        System.out.println(b2.getAuthor());
        System.out.println(b.getAuthor());
    }

    public Author clone() throws CloneNotSupportedException{
        return (Author) super.clone();

    }
}
