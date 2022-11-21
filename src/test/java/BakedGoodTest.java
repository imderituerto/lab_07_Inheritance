import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class BakedGoodTest {

        Cake cake;
        Cupcake cupcake;
        Cookie cookie;

        @BeforeEach
        public void setUp(){
            ArrayList<String> toppings = new ArrayList<>();
            toppings.add("Sprinkles");
            toppings.add("Sliced almonds");
            toppings.add("Chocolate buttons");
            cake = new Cake("Victoria sponge", "Vanilla", 180, false, 3);
            cupcake = new Cupcake("Red cupcake", "Red velvet", 180, true, toppings);
            cookie = new Cookie("Chocolate chip", "Cookie dough", 180, false, false);
        }

        @Test
        public void canGetName(){
            String expected = cupcake.getName();
            assertThat(expected).isEqualTo("Red cupcake");
        }
        @Test
        public void canSetName(){
            cookie.setName("Oatmeal cookie");
            assertThat(cookie.getName()).isEqualTo("Oatmeal cookie");
        }
        @Test
        public void canGetBaseFlavour(){
            String expected = cookie.getBaseFlavour();
            assertThat(expected).isEqualTo("Cookie dough");
        }
        @Test
        public void canSetBaseFlavour(){
            cake.setBaseFlavour("Chocolate");
            assertThat(cake.getBaseFlavour()).isEqualTo("Chocolate");
        }
        @Test
        public void canGetOvenTemp(){
            String expected = cake.getOvenTemp();
            assertThat(expected).isEqualTo("Bake me at 180!");
        }
        @Test
        public void canSetOvenTemp(){
            cake.setOvenTemp(200);
            assertThat(cake.getOvenTemp()).isEqualTo("Bake me at 200!");
        }
}
