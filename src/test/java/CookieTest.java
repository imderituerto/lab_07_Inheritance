import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookieTest {

    Cookie cookie1;
    Cookie cookie2;
    Cookie cookie3;

    @BeforeEach
    public void setUp(){
        cookie1 = new Cookie("Chocolate chip", "Cookie dough", 180, false, false, false);
        cookie2 = new Cookie("Oatmeal cookies", "Oats", 180, true, false, false);
        cookie3 = new Cookie("Almond cookies", "Almonds", 180, true, true, true);
    }

    @Test
    public void canGetHealthStatus(){
        String expected = cookie1.getHealthStatus();
        assertThat(expected).isEqualTo("There are healthier alternatives.");
    }

    @Test
    public void canSetHealthStatus(){
        cookie1.setHealthStatus(true);
        assertThat(cookie1.getHealthStatus()).isEqualTo("This is a healthy snack.");
    }

    @Test
    public void canGetNutStatus(){
        String expected = cookie3.getNutStatus();
        assertThat(expected).isEqualTo("Careful, this cookie contains nuts.");
    }
    @Test
    public void canSetNutStatus(){
        cookie3.setNutStatus(false);
        assertThat(cookie3.getNutStatus()).isEqualTo("No nuts.");
    }

}
