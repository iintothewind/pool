package com.github.iintothewind.pool;

import java.util.concurrent.TimeUnit;

public class FunctionPool<T, R> implements CachePool<T, R> {


  @Override
  public R borrow(T key) {
    return null;
  }

  @Override
  public R borrow(T key, long timeout, TimeUnit timeUnit) {
    return null;
  }
}
