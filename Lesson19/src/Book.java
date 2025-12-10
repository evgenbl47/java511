public class Book {
    private String autor;
    private String title;
    private int page;
    private double price;

    public Book(String autor, String title, int page, double price) {
        this.autor = autor;
        this.title = title;
        this.page = page;
        this.price = price;
    }

    public Book(String autor, String title, double price) {
        this.autor = autor;
        this.title = title;
        this.price = price;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0.0) {
            return;
        }

        this.price = price;
    }
}
