import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class BakedGoodTest {

        Cake cake;
        Cupcake cupcake;
        Cookie cookie;
        Shop shop;

        @BeforeEach
        public void setUp(){
            cake = new Cake("Victoria sponge", "Vanilla", 180, false, 3);
            cupcake = new Cupcake("Red cupcake", "Red velvet", 180, true);
            cookie = new Cookie("Chocolate chip", "Cookie dough", 180, false, false, false);

            ArrayList<String> bakedGoodsAvailable = new ArrayList<>();
            bakedGoodsAvailable.add("Cake");
            bakedGoodsAvailable.add("Cupcake");
            bakedGoodsAvailable.add("Cookie");
            shop = new Shop("BNTA Bakery", bakedGoodsAvailable);
        }

        /*
        @BeforeEach
        public void setUp(){
        championship = new Championship("World Athletics");
        swimmer = new Swimmer("Jane");
        triathlete = new Triathlete("Kevin");
        }

        @Test
        public void addSwimmer(){
        championship.addSwimmer(swimmer);
        championship.addSwimmer(triathlete);
        assertThat(championship.getSwimmers().size()).isEqualTo(2);
         }
         */

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
        public void canGetOvenTemp__bakingNeeded(){
            String expected = cake.getOvenTemp();
            assertThat(expected).isEqualTo("Bake me at 180!");
        }

        @Test
        public void canGetOvenTemp__bakingNotNeeded(String message){
            String expected = cake.getOvenTemp();
            assertThat(expected).isEqualTo("I'm a no-bake cake!");
        }
        @Test
        public void canSetOvenTemp(){
            cake.setOvenTemp(200);
            assertThat(cake.getOvenTemp()).isEqualTo("Bake me at 200!");
        }

        @Test
        public void canGetIcing(){
            boolean expected = cookie.getIcing();
            assertThat(expected).isEqualTo(false);
        }
        @Test
        public void canSetIcing(){
            cookie.setIcing(true);
            assertThat(cookie.getIcing()).isEqualTo(true);
        }

        @Test
        public void canGetBakedGoodsAvailable(){
            ArrayList<String> expected = cookie.getBakedGoodsAvailable();
            expected.add("Cakes, Cookies, Cupcakes");
            System.out.println(expected);
//            assertThat(expected).isEqualTo("Chocolate cookie");
        }
        @Test void canSetBakedGoodsAvailable(){
            ArrayList<String> expected = cookie.getBakedGoodsAvailable();
            expected.remove("Cookies");
            System.out.println(expected);
//            cookie.setBakedGoods(expected);
//            assertThat(cookie.getBakedGoods()).isEqualTo("Chocolate Cookie, Oatmeal cookie");
        }

}
