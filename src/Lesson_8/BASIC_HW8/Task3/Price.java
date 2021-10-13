package Lesson_8.BASIC_HW8.Task3;

public class Price {
    private String product;
    private String market;
    private double cost;

    public void setProduct(String product) {
        this.product = product;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    public String getMarket() {
        return market;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product = " + this.getProduct() +
                "; Market = " + this.getMarket() +
                "; Cost = " + this.getCost();
    }
}
