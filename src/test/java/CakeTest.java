import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CakeTest {

    Cake cake1;
    Cake cake2;
    Cake cake3;

    @BeforeEach
    public void setUp(){
        cake1 = new Cake("Victoria sponge", "vanilla", 180, false, 3);
        cake2 = new Cake("Birthday cake", "vanilla", 180, true, 5);
        cake3 = new Cake("No-bake cake", "Chocolate",0,true, 2);
    }

    @Test
    public void canGetOvenTemp(){
        String expected = cake3.getOvenTemp();
        assertThat(expected).isEqualTo("I'm a no-bake cake :)");
    }
    @Test
    public void canSetOvenTemp(){
        cake3.setOvenTemp(200);
        assertThat(cake3.getOvenTemp()).isEqualTo("Bake me at 200!");
    }

    @Test
    public void canGetLayers(){
        int expected = cake1.getLayers();
        assertThat(expected).isEqualTo(3);
    }
    @Test
    public void canSetLayers(){
        cake1.setLayers(2);
        assertThat(cake1.getLayers()).isEqualTo(2);
    }
}
