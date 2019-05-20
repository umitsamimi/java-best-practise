package com.tr.umitsamimi.solid.ocp.filter;

public interface Specification<T>
{
  boolean isSatisfied(T item);
}