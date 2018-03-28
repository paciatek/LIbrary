package pl.sda.library.entity;


import java.time.LocalDate;


public class Book {

    private String title;
    private LocalDate dateOfPublishing;
    private String isbn;
    private BooksType booksType;
    private Integer numberOfPages;
    private String description;

    private Author autorID;

    public Book(){
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateOfPublishing() {
        return dateOfPublishing;
    }

    public void setDateOfPublishing(LocalDate dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BooksType getBooksType() {
        return booksType;
    }

    public void setBooksType(BooksType booksType) {
        this.booksType = booksType;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAutorID() {
        return autorID;
    }

    public void setAutorID(Author autorID) {
        this.autorID = autorID;
    }
}
