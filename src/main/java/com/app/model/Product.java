package com.app.model;


public class Product {
  private String name;
  private Integer price;
  private Category category;

  public enum Category {
    FOOD(0.0), FURNITURE(0.05), ELECTRONICS(0.10);
    private Double value;

    Category(Double value) {
      this.value = value;
    }

    public Double getGstRate() {
      return value;
    }
  }

  public Product(String name, Integer price, Integer category) {
    this.name = name;
    this.price = price;
    this.category = Product.Category.values()[category];
  }



  public Integer getPrice() {
    return price;
  }

  public Category getCategory() {
    return category;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", category=" + category +
        '}';
  }


}
