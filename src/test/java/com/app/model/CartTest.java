package com.app.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest {
  Product food = new Product("Burger", 50, 0);
  Product furniture = new Product("Burger", 50, 1);
  Product electronics = new Product("Burger", 50, 2);
  Integer quantity = 10;
  Cart cart = new Cart();

  @Before
  public void setUp() throws Exception {
    cart.addItem(food, quantity);
    cart.addItem(food, quantity);
    cart.addItem(furniture, quantity);
    cart.addItem(electronics, quantity);
  }



  @Test
  public void getCart() {
    System.out.println(cart.getCart());
  }
}