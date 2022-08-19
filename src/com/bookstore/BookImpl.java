package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {
        Book book=new Book();

        book.setIsbnNumber(1234567890987L);
        book.setTittle("The Complete Reference");
        book.setDescription("Information about Java");
        book.setPrice(1000);


        Author author=new Author();
        
        author.setAuthorName("Herbert Schildt");
        author.setAuthorPenName("Herbert");
        //book.setAuthor(author);
        book.display();

       System.out.println("author = " + author);

    }
}
