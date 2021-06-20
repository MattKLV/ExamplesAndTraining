import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTest2 {

    Book bookMainigais = new Book();

    @Before
    public void setUp(){
        bookMainigais.setAuthor("Jack London");
        bookMainigais.setYear(1906);
        bookMainigais.setGenre("Adventure");
        bookMainigais.setIsbn("Something random");
        bookMainigais.setBookName("White Fang");

    }

    @After
    public void tearDown(){
        bookMainigais = null;
    }

    @Test
    public void test1() {



        assertThat(bookMainigais.getAuthor()).isEqualTo("Jack London");
        assertThat(bookMainigais.getYear()).isEqualTo(1906);
        assertThat(bookMainigais.getGenre()).isEqualTo("Adventure");
        assertThat(bookMainigais.getIsbn()).isEqualTo("Something random");
        assertThat(bookMainigais.getBookName()).isEqualTo("White Fang");

    }
}
