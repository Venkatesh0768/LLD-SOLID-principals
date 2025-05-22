package ProjectBuilding.BetterCode.v4;

import java.util.List;

public class product4 {
    private String name;
    private String desc;
    private int prices;
    private int discount;
    private String brand;
    private List<String> images;

    private product4(Builder b) {
        if (b.getPrices() > 0) {
            this.prices = b.getPrices();
        }
        this.name = b.getName();
        this.desc = b.getDesc();
        this.discount = b.getDiscount();
        this.brand = b.getBrand();
        this.images = b.getImages();
    }

    // Add getter methods
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrices() {
        return prices;
    }

    public int getDiscount() {
        return discount;
    }

    public String getBrand() {
        return brand;
    }

    public List<String> getImages() {
        return images;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String desc;
        private int prices;
        private int discount;
        private String brand;
        private List<String> images;

        public Builder() {
        }

        public product4 build() {
            return new product4(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getDesc() {
            return desc;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public int getPrices() {
            return prices;
        }

        public Builder setPrices(int prices) {
            this.prices = prices;
            return this;
        }

        public int getDiscount() {
            return discount;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public String getBrand() {
            return brand;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public List<String> getImages() {
            return images;
        }

        public Builder setImages(List<String> images) {
            this.images = images;
            return this;
        }
    }
}