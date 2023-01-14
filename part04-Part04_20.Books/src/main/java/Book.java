public class Book {
    String name;
    int pages;
    int publicationDate;

    public Book(String name, int pages, int publicationDate) {
        this.name = name;
        this.pages = pages;
        this.publicationDate = publicationDate;
    }

    String getName(){
        return this.name;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.publicationDate;
    }
}
