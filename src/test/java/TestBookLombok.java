import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestBookLombok {

    @Test
    public void test1() {
        Book bookLombok = new Book();
        bookLombok.setAuthor("Jack London");
        bookLombok.setYear(1906);
        bookLombok.setGenre("Adventure");
        bookLombok.setIsbn("Something random");
        bookLombok.setBookName("White Fang");

        assertThat(bookLombok.getAuthor()).isEqualTo("Jack London");
        assertThat(bookLombok.getYear()).isEqualTo(1906);
        assertThat(bookLombok.getGenre()).isEqualTo("Adventure");
        assertThat(bookLombok.getIsbn()).isEqualTo("Something random");
        assertThat(bookLombok.getBookName()).isEqualTo("White Fang");

    }
}
