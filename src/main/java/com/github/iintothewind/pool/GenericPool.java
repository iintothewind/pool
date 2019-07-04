package com.github.iintothewind.pool;

import java.util.concurrent.TimeUnit;

public interface GenericPool<T> {

  T borrow();


  T borrow(long timeout, TimeUnit timeUnit);

}
