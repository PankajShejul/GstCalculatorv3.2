package com.app.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
  Product product=new Product("Burger",50,0);

  @Test
  public void getCategory() {
    System.out.println(product.getCategory());
  }

  @Test
  public void testToString() {
    System.out.println(product);
  }
}