import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class ShopTest {

    Shop bakery;
    ArrayList<String> bakedGoodsAvailable;

    @BeforeEach
    bakedGoodsAvailable = new ArrayList<String>();
    bakery = new Shop("BNTA Bakery", bakedGoodsAvailable);
}
