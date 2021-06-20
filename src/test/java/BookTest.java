import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTest {

    @Test
    public void test1() {
        Book bookMainigais = new Book();
        bookMainigais.setAuthor("Jack London");
        bookMainigais.setYear(1906);
        bookMainigais.setGenre("Adventure");
        bookMainigais.setIsbn("Something random");
        bookMainigais.setBookName("White Fang");

        assertThat(bookMainigais.getAuthor()).isEqualTo("Jack London");
        assertThat(bookMainigais.getYear()).isEqualTo(1906);
        assertThat(bookMainigais.getGenre()).isEqualTo("Adventure");
        assertThat(bookMainigais.getIsbn()).isEqualTo("Something random");
        assertThat(bookMainigais.getBookName()).isEqualTo("White Fang");

    }
}
