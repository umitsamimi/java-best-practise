package com.tr.umitsamimi.solid.ocp;

import com.tr.umitsamimi.solid.ocp.filter.impl.AndSpecification;
import com.tr.umitsamimi.solid.ocp.filter.impl.BetterFilter;
import com.tr.umitsamimi.solid.ocp.filter.impl.ColorSpecification;
import com.tr.umitsamimi.solid.ocp.filter.impl.SizeSpecification;
import com.tr.umitsamimi.solid.ocp.model.Color;
import com.tr.umitsamimi.solid.ocp.model.Product;
import com.tr.umitsamimi.solid.ocp.model.Size;

import java.util.ArrayList;
import java.util.List;

public class OCPDemo
{
  public static void main(String[] args) {
    List<Product> products = getProductList();
    filterOCPBefore(products);
    filterOCPAfter(products);
  }

  private static void filterOCPBefore(List<Product> products){
    ProductFilter pf = new ProductFilter();
    System.out.println("Green products (old):");
    pf.filterByColor(products, Color.GREEN)
            .forEach(p -> System.out.println(" - " + p.name + " is green"));
  }

  private static void filterOCPAfter(List<Product> products){
    BetterFilter bf = new BetterFilter();
    System.out.println("Green products (new):");
    bf.filter(products, new ColorSpecification(Color.GREEN))
            .forEach(p -> System.out.println(" - " + p.name + " is green"));

    System.out.println("Large products:");
    bf.filter(products, new SizeSpecification(Size.LARGE))
            .forEach(p -> System.out.println(" - " + p.name + " is large"));

    System.out.println("Large blue items:");
    bf.filter(products,
            new AndSpecification<>(
                    new ColorSpecification(Color.BLUE),
                    new SizeSpecification(Size.LARGE)
            ))
            .forEach(p -> System.out.println(" - " + p.name + " is large and blue"));
  }

  private static List<Product> getProductList(){
    Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
    Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
    Product house = new Product("House", Color.BLUE, Size.LARGE);

    List<Product> products = new ArrayList<>();
    products.add(apple);
    products.add(tree);
    products.add(house);
    return products;
  }
}