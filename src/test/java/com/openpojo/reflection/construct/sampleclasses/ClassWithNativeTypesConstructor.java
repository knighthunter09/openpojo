/*
 * Copyright (c) 2010-2017 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.openpojo.reflection.construct.sampleclasses;

/**
 * @author oshoukry
 */
public final class ClassWithNativeTypesConstructor {

  // a constuctor that has ALL native types, and one none-native.
  public ClassWithNativeTypesConstructor(final Boolean someBoolean, final boolean someNativeBoolean, final int someNativeInt,
                                         final float someNativeFloat, final double someNativeDouble, final long someNativeLong,
                                         final short someNativeShort, final byte someNativeByte, final char someNativeChar) {
  }
}
