package com.tr.umitsamimi.solid.ocp.filter.impl;

import com.tr.umitsamimi.solid.ocp.filter.Specification;
import com.tr.umitsamimi.solid.ocp.model.Product;
import com.tr.umitsamimi.solid.ocp.model.Size;

public class SizeSpecification implements Specification<Product>
{
  private Size size;

  public SizeSpecification(Size size) {
    this.size = size;
  }

  @Override
  public boolean isSatisfied(Product p) {
    return p.size == size;
  }
}