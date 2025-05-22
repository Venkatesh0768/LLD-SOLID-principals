package ProjectBuilding.problmetic;

public class product {
    private String name;
    private  int price;
    private  String desc;
    private  int  discount;
    private  String brand;

    public product(int price, String desc, int discount, String brand, String name) {
        this.price = price;
        this.desc = desc;
        this.discount = discount;
        this.brand = brand;
        this.name = name;
    }
}
