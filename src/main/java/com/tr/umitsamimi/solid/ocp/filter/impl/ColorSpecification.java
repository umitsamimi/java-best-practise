package com.tr.umitsamimi.solid.ocp.filter.impl;

import com.tr.umitsamimi.solid.ocp.filter.Specification;
import com.tr.umitsamimi.solid.ocp.model.Color;
import com.tr.umitsamimi.solid.ocp.model.Product;

public class ColorSpecification implements Specification<Product>
{
  private Color color;

  public ColorSpecification(Color color) {
    this.color = color;
  }

  @Override
  public boolean isSatisfied(Product p) {
    return p.color == color;
  }
}