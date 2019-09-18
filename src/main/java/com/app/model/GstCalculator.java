package com.app.model;


import java.util.Map;

public class GstCalculator {
  private Cart cart;

  public GstCalculator(Cart cart) {
    this.cart = cart;
  }

  public void display() {
    Map<Product, Integer> map = cart.getCart();
    double totalprice = 0;
    for (Product.Category category : Product.Category.values()) {
      for (Map.Entry<Product, Integer> e : map.entrySet()) {
        if (e.getKey().getCategory() == category) {
          System.out.println(e.getKey() + " " + e.getValue());
          totalprice += e.getKey().getPrice() * e.getValue();
        }
      }
      System.out.println("Total Price on " + category + ": " + totalprice);
      double gst = totalprice * (category.getGstRate());
      System.out.println("Total gst on " + category + ": " + gst);
      System.out.println("Price including Gst: " + (totalprice + gst) + "\n\n");
    }

  }
}
