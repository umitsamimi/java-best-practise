package com.tr.umitsamimi.solid.ocp.filter.impl;

import com.tr.umitsamimi.solid.ocp.filter.Filter;
import com.tr.umitsamimi.solid.ocp.filter.Specification;
import com.tr.umitsamimi.solid.ocp.model.Product;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product>
{
  @Override
  public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
    return items.stream().filter(p -> spec.isSatisfied(p));
  }
}