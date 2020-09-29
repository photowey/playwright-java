/**
 * Copyright (c) Microsoft Corporation.
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

package com.microsoft.playwright;

import java.util.*;
import java.util.function.BiConsumer;

public interface ElementHandle {
  enum ElementState { DISABLED, ENABLED, HIDDEN, STABLE, VISIBLE}
  class CheckOptions {
    Boolean force;
    Boolean noWaitAfter;
    Integer timeout;

    public CheckOptions withForce(Boolean force) {
      this.force = force;
      return this;
    }
    public CheckOptions withNoWaitAfter(Boolean noWaitAfter) {
      this.noWaitAfter = noWaitAfter;
      return this;
    }
    public CheckOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class ClickOptions {
    enum Button { LEFT, MIDDLE, RIGHT}
    enum Modifier { ALT, CONTROL, META, SHIFT}
    public class Position {
      int x;
      int y;

      Position() {
      }
      public ClickOptions done() {
        return ClickOptions.this;
      }

      public Position withX(int x) {
        this.x = x;
        return this;
      }
      public Position withY(int y) {
        this.y = y;
        return this;
      }
    }
    Button button;
    Integer clickCount;
    Integer delay;
    Position position;
    Set<Modifier> modifiers;
    Boolean force;
    Boolean noWaitAfter;
    Integer timeout;

    public ClickOptions withButton(Button button) {
      this.button = button;
      return this;
    }
    public ClickOptions withClickCount(Integer clickCount) {
      this.clickCount = clickCount;
      return this;
    }
    public ClickOptions withDelay(Integer delay) {
      this.delay = delay;
      return this;
    }
    public Position setPosition() {
      this.position = new Position();
      return this.position;
    }
    public ClickOptions withModifiers(Set<Modifier> modifiers) {
      this.modifiers = modifiers;
      return this;
    }
    public ClickOptions withForce(Boolean force) {
      this.force = force;
      return this;
    }
    public ClickOptions withNoWaitAfter(Boolean noWaitAfter) {
      this.noWaitAfter = noWaitAfter;
      return this;
    }
    public ClickOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class DblclickOptions {
    enum Button { LEFT, MIDDLE, RIGHT}
    enum Modifier { ALT, CONTROL, META, SHIFT}
    public class Position {
      int x;
      int y;

      Position() {
      }
      public DblclickOptions done() {
        return DblclickOptions.this;
      }

      public Position withX(int x) {
        this.x = x;
        return this;
      }
      public Position withY(int y) {
        this.y = y;
        return this;
      }
    }
    Button button;
    Integer delay;
    Position position;
    Set<Modifier> modifiers;
    Boolean force;
    Boolean noWaitAfter;
    Integer timeout;

    public DblclickOptions withButton(Button button) {
      this.button = button;
      return this;
    }
    public DblclickOptions withDelay(Integer delay) {
      this.delay = delay;
      return this;
    }
    public Position setPosition() {
      this.position = new Position();
      return this.position;
    }
    public DblclickOptions withModifiers(Set<Modifier> modifiers) {
      this.modifiers = modifiers;
      return this;
    }
    public DblclickOptions withForce(Boolean force) {
      this.force = force;
      return this;
    }
    public DblclickOptions withNoWaitAfter(Boolean noWaitAfter) {
      this.noWaitAfter = noWaitAfter;
      return this;
    }
    public DblclickOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class FillOptions {
    Boolean noWaitAfter;
    Integer timeout;

    public FillOptions withNoWaitAfter(Boolean noWaitAfter) {
      this.noWaitAfter = noWaitAfter;
      return this;
    }
    public FillOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class HoverOptions {
    enum Modifier { ALT, CONTROL, META, SHIFT}
    public class Position {
      int x;
      int y;

      Position() {
      }
      public HoverOptions done() {
        return HoverOptions.this;
      }

      public Position withX(int x) {
        this.x = x;
        return this;
      }
      public Position withY(int y) {
        this.y = y;
        return this;
      }
    }
    Position position;
    Set<Modifier> modifiers;
    Boolean force;
    Integer timeout;

    public Position setPosition() {
      this.position = new Position();
      return this.position;
    }
    public HoverOptions withModifiers(Set<Modifier> modifiers) {
      this.modifiers = modifiers;
      return this;
    }
    public HoverOptions withForce(Boolean force) {
      this.force = force;
      return this;
    }
    public HoverOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class PressOptions {
    Integer delay;
    Boolean noWaitAfter;
    Integer timeout;

    public PressOptions withDelay(Integer delay) {
      this.delay = delay;
      return this;
    }
    public PressOptions withNoWaitAfter(Boolean noWaitAfter) {
      this.noWaitAfter = noWaitAfter;
      return this;
    }
    public PressOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class ScreenshotOptions {
    enum Type { JPEG, PNG}
    String path;
    Type type;
    Integer quality;
    Boolean omitBackground;
    Integer timeout;

    public ScreenshotOptions withPath(String path) {
      this.path = path;
      return this;
    }
    public ScreenshotOptions withType(Type type) {
      this.type = type;
      return this;
    }
    public ScreenshotOptions withQuality(Integer quality) {
      this.quality = quality;
      return this;
    }
    public ScreenshotOptions withOmitBackground(Boolean omitBackground) {
      this.omitBackground = omitBackground;
      return this;
    }
    public ScreenshotOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class ScrollIntoViewIfNeededOptions {
    Integer timeout;

    public ScrollIntoViewIfNeededOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class SelectOptionOptions {
    Boolean noWaitAfter;
    Integer timeout;

    public SelectOptionOptions withNoWaitAfter(Boolean noWaitAfter) {
      this.noWaitAfter = noWaitAfter;
      return this;
    }
    public SelectOptionOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class SelectTextOptions {
    Integer timeout;

    public SelectTextOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class SetInputFilesOptions {
    Boolean noWaitAfter;
    Integer timeout;

    public SetInputFilesOptions withNoWaitAfter(Boolean noWaitAfter) {
      this.noWaitAfter = noWaitAfter;
      return this;
    }
    public SetInputFilesOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class TypeOptions {
    Integer delay;
    Boolean noWaitAfter;
    Integer timeout;

    public TypeOptions withDelay(Integer delay) {
      this.delay = delay;
      return this;
    }
    public TypeOptions withNoWaitAfter(Boolean noWaitAfter) {
      this.noWaitAfter = noWaitAfter;
      return this;
    }
    public TypeOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class UncheckOptions {
    Boolean force;
    Boolean noWaitAfter;
    Integer timeout;

    public UncheckOptions withForce(Boolean force) {
      this.force = force;
      return this;
    }
    public UncheckOptions withNoWaitAfter(Boolean noWaitAfter) {
      this.noWaitAfter = noWaitAfter;
      return this;
    }
    public UncheckOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class WaitForElementStateOptions {
    Integer timeout;

    public WaitForElementStateOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  class WaitForSelectorOptions {
    enum State { ATTACHED, DETACHED, HIDDEN, VISIBLE}
    State state;
    Integer timeout;

    public WaitForSelectorOptions withState(State state) {
      this.state = state;
      return this;
    }
    public WaitForSelectorOptions withTimeout(Integer timeout) {
      this.timeout = timeout;
      return this;
    }
  }
  ElementHandle querySelector(String selector);
  List<ElementHandle> querySelectorAll(String selector);
  default Object evalOnSelector(String selector, String pageFunction) {
    return evalOnSelector(selector, pageFunction, null);
  }
  Object evalOnSelector(String selector, String pageFunction, Object arg);
  default Object evalOnSelectorAll(String selector, String pageFunction) {
    return evalOnSelectorAll(selector, pageFunction, null);
  }
  Object evalOnSelectorAll(String selector, String pageFunction, Object arg);
  Object boundingBox();
  default void check() {
    check(null);
  }
  void check(CheckOptions options);
  default void click() {
    click(null);
  }
  void click(ClickOptions options);
  Frame contentFrame();
  default void dblclick() {
    dblclick(null);
  }
  void dblclick(DblclickOptions options);
  default void dispatchEvent(String type) {
    dispatchEvent(type, null);
  }
  void dispatchEvent(String type, Object eventInit);
  default void fill(String value) {
    fill(value, null);
  }
  void fill(String value, FillOptions options);
  void focus();
  String getAttribute(String name);
  default void hover() {
    hover(null);
  }
  void hover(HoverOptions options);
  String innerHTML();
  String innerText();
  Frame ownerFrame();
  default void press(String key) {
    press(key, null);
  }
  void press(String key, PressOptions options);
  default byte[] screenshot() {
    return screenshot(null);
  }
  byte[] screenshot(ScreenshotOptions options);
  default void scrollIntoViewIfNeeded() {
    scrollIntoViewIfNeeded(null);
  }
  void scrollIntoViewIfNeeded(ScrollIntoViewIfNeededOptions options);
  default List<String> selectOption(String values) {
    return selectOption(values, null);
  }
  List<String> selectOption(String values, SelectOptionOptions options);
  default void selectText() {
    selectText(null);
  }
  void selectText(SelectTextOptions options);
  default void setInputFiles(String files) {
    setInputFiles(files, null);
  }
  void setInputFiles(String files, SetInputFilesOptions options);
  String textContent();
  String toString();
  default void type(String text) {
    type(text, null);
  }
  void type(String text, TypeOptions options);
  default void uncheck() {
    uncheck(null);
  }
  void uncheck(UncheckOptions options);
  default void waitForElementState(ElementState state) {
    waitForElementState(state, null);
  }
  void waitForElementState(ElementState state, WaitForElementStateOptions options);
  default ElementHandle waitForSelector(String selector) {
    return waitForSelector(selector, null);
  }
  ElementHandle waitForSelector(String selector, WaitForSelectorOptions options);
  ElementHandle asElement();
  void dispose();
  default Object evaluate(String pageFunction) {
    return evaluate(pageFunction, null);
  }
  Object evaluate(String pageFunction, Object arg);
  default JSHandle evaluateHandle(String pageFunction) {
    return evaluateHandle(pageFunction, null);
  }
  JSHandle evaluateHandle(String pageFunction, Object arg);
  Map<String, JSHandle> getProperties();
  JSHandle getProperty(String propertyName);
  Object jsonValue();
}

