package com.github.iintothewind.pool;

import java.util.concurrent.TimeUnit;

public interface CachePool<T, R> {
  R borrow(T key);


  R borrow(T key, long timeout, TimeUnit timeUnit);
}
