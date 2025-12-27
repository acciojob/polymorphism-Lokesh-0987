package com.driver;

public class Main {
    // Task 1: create a class Product inside Main class
  static class Product {


        // Task 3
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        //Task 2: create object of Product in Main function called p
        Product p = new Product();

        System.out.println(p.product(2, 3));
        System.out.println(p.product(2, 3, 4));
        System.out.println(p.product(2.5, 3.5));
    }

}
