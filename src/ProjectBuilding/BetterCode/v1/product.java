package ProjectBuilding.BetterCode.v1;

import java.util.List;

public class product {
    private String name;
    private String desc;
    private int prices;
    private  int discount;
    private  String brand;
    private List<String> images;

    public product(String name, String desc, int prices, int discount, String brand, List<String> images) {
        this.name = name;
        this.desc = desc;
        this.prices = prices;
        this.discount = discount;
        this.brand = brand;
        this.images = images;
    }
}
