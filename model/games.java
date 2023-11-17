package model;

public class Games {
    private int id;
    private String name;
    private String genre;
    private int price;

    public Games(int id, String name, String genre, int price) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
