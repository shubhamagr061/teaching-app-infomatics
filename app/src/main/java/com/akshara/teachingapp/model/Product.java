package com.akshara.teachingapp.model;

public class Product {

    //Methods ==> Implementation

    //name, image, price , discounted_price

    //Declaration
    public String name;
    private String image;
    private double price;
    private double discounted_price;
    private Category category;

    // access returnType methodName(){}

    //Initilization ==> Value initilize garne
    public Product(String name, String url, double price , double discounted_price,Category variable ){
        this.name = name;
        this.image = url;
        this.price = price;
        this.discounted_price = discounted_price;
        this.category = variable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscounted_price() {
        return discounted_price;
    }

    public void setDiscounted_price(double discounted_price) {
        this.discounted_price = discounted_price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public interface CartInterface{
        void addToCart();
        void removeFromCart();
    }


}
