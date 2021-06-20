import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CrocodileTest {


    Crocodile crocodileMainigais = new Crocodile();

    @Before
            public void setUp(){

        crocodileMainigais.setName("Crocodile Dandy");
        crocodileMainigais.setWeight(85.2);
        crocodileMainigais.setLength(105);
        crocodileMainigais.setHungry(true);

    }

    @After
    public void tearDown(){
        crocodileMainigais = null;

    }

    @Test
    public void test1() {

        assertThat(crocodileMainigais.getName()).isEqualTo("Crocodile Dandy");
        assertThat(crocodileMainigais.getWeight()).isEqualTo(85.2);
        assertThat(crocodileMainigais.getLength()).isEqualTo(105);
        assertThat(crocodileMainigais.isHungry()).isTrue();

    }

}
