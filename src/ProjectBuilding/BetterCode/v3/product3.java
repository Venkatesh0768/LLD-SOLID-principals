package ProjectBuilding.BetterCode.v3;

import java.util.List;

public class product3 {
    private String name;
    private String desc;
    private int prices;
    private  int discount;
    private  String brand;
    private List<String> images;

    product3(Builder b){
        if(b.getPrices() > 0){
            this.prices = b.getPrices();
        }
        this.name = b.getName();
    }

}
