package com.app.model;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class Cart {
  private Map<Product, Integer> products;

  public Cart() {
    products = new HashMap<Product, Integer>();
  }

  public void addItem(Product product, Integer quantity) {
    if (products.containsKey(product)) {
      Integer quan = products.get(product);
      products.put(product, quan + quantity);
    } else {
      products.put(product, quantity);
    }
  }

  public Map<Product, Integer> getCart() {
    return products;
  }
}
