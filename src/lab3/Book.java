package lab3;

public class Book {
    private String authorBook;
    private String nameBook;
    private int yearBook;

    public Book(){

    }

    public Book(String authorBook, String nameBook, int yearBook){
        this.authorBook = authorBook;
        this.nameBook = nameBook;
        this.yearBook = yearBook;
    }

    public void showBook(){
        System.out.println("Название книги - "  + nameBook + "\nАвтор книги: " + authorBook  + "\nГод издания: " + yearBook);
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
    public String getAuthorBook() {
        return authorBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearBook() {
        return yearBook;
    }

}
