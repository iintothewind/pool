package com.github.iintothewind.pool;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class LoadingPoolTest {
  @Test
  public void testPool() {
    GenericPool<String> pool = SupplierPool
      .withSupplier(() -> {
        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        return String.valueOf(System.currentTimeMillis());
      })
      .withMinSize(5)
      .withMaxSize(9)
      .build();
    for (int i = 0; i < 99; i++) {
      System.out.println(String.format("%s borrowed: %s", i, pool.borrow()));
    }
  }
}
