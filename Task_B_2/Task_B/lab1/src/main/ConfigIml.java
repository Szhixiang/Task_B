package main;

public class ConfigIml implements configuration {
    private Product product;

    public ConfigIml(Product product) {
        this.product = product;
    }


    @Override
    public void configure() {
        this.product.create();
    }
}
