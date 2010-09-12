/**
 * Copyright (C) 2010 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.inject.persist.finder;

import java.lang.reflect.Method;

/**
 * Utility that helps you discover metadata about dynamic finder methods.
 *
 * @author dhanji@gmail.com (Dhanji R. Prasanna)
 */
public final class DynamicFinder {

  /**
   * Tests if {@code method} is a dynamic finder method.
   *
   * @param method a method you want to test as a dynamic finder
   * @return {@code true} if the method is annotated {@code @Finder}
   */
  public static boolean isFinder(Method method) {
    return method.isAnnotationPresent(Finder.class);
  }
}