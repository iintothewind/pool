package com.github.iintothewind.util;

import java.util.Objects;

public interface Preconditions {
  static void checkArg(final boolean expression, final Object msg) {
    if (!expression) {
      throw new IllegalArgumentException(String.valueOf(msg));
    }
  }

  static void checkState(final boolean expression, final Object msg) {
    if (!expression) {
      throw new IllegalStateException(String.valueOf(msg));
    }
  }

  static <T> T checkNotNull(T obj, final Object msg) {
    if (Objects.isNull(obj)) {
      throw new NullPointerException(String.valueOf(msg));
    }
    return obj;
  }
}
