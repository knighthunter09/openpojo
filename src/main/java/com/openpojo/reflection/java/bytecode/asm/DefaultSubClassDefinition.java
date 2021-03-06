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

package com.openpojo.reflection.java.bytecode.asm;

import com.openpojo.reflection.java.Java;
import org.objectweb.asm.ClassReader;

/**
 * @author oshoukry
 */
public class DefaultSubClassDefinition implements SubClassDefinition {
  private final String generatedClassName;
  private final ClassReader classReader;

  public DefaultSubClassDefinition(Class<?> parentClass) {
    this(parentClass, parentClass.getName() + "__Generated_OpenPojo");
  }

  public DefaultSubClassDefinition(Class<?> parentClass, String subClassName) {
    this.generatedClassName = subClassName;
    this.classReader = ClassReaderFactory.getClassReader(parentClass);
  }

  public ClassReader getClassReader() {
    return classReader;
  }

  public String getGeneratedClassNameAsJDKPath() {
    return generatedClassName.replace(Java.PACKAGE_DELIMITER, Java.PATH_DELIMITER);
  }

  public String getGeneratedClassName() {
    return generatedClassName;
  }
}
