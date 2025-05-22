package ProjectBuilding.BetterCode.v4;

public class Main4 {
    public static void main(String[] args) {
        product4 product = product4.getBuilder()
                .setName("venkatesh")
                .setBrand("Brand")
                .setDesc("Human")
                .setDiscount(0)
                .setPrices(0)
                .build();

        // ✅ These will now work
        System.out.println("Name: " + product.getName());
        System.out.println("Brand: " + product.getBrand());
        System.out.println("Price: " + product.getPrices());
    }
}