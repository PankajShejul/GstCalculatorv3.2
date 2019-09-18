package com.app.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GstCalculatorTest {
  Product food = new Product("Burger", 50, 0);
  Product furniture = new Product("Table", 50, 1);
  Product electronics = new Product("Mobile", 50, 2);
  Product washingMachine = new Product("Washing Machine", 1500, 2);
  Product pizza = new Product("Pizza", 120, 0);
  Integer quantity = 10;
  Cart cart = new Cart();
  GstCalculator cal = new GstCalculator(cart);

  @Before
  public void setUp() throws Exception {
    cart.addItem(food, quantity);
    cart.addItem(food, quantity);
    cart.addItem(furniture, quantity);
    cart.addItem(electronics, quantity);
    cart.addItem(pizza, 15);
    cart.addItem(washingMachine, 2);
  }

  @Test
  public void display() {
    cal.display();
  }


}