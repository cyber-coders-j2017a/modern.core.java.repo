package ArrayEx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LewisMonplaisir on 17/07/2017.
 */
public class House {
    public void HouseTypes() {

        List<Long> priceRange = new ArrayList<Long>();

        priceRange.add(200000L);
        priceRange.add(400000L);
        priceRange.add(600000L);
        priceRange.add(800000L);
        priceRange.add(650000L);
        priceRange.add(3,50000L);
        for(long priceRanges:priceRange) {
            System.out.println(priceRange);

        }

    }
}
