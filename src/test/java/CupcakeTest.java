import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CupcakeTest {

    Cupcake cupcake1;

    @BeforeEach
    public void setUp(){
        ArrayList<String> icingFlavour = new ArrayList<>();
        cupcake1 = new Cupcake("Decorated cupcakes", "vanilla", 180, true);
    }

    //Testing that methods are inherited properly from BakedGoods and Icing class (inheritance chain)
    @Test
    public void canSetBaseFlavour(){
        cupcake1.setBaseFlavour("Chocolate");
        assertThat(cupcake1.getBaseFlavour()).isEqualTo("Chocolate");
    }

}
