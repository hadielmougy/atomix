/*
 * Copyright 2019-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.utils.component;

import org.junit.Test;

/**
 * Component manager test.
 */
public class ComponentManagerTest {
  @Test
  public void testComponentManager() throws Exception {
    ComponentManager<TestComponent> manager = new ComponentManager<>(TestComponent.class);
    manager.start().join();
    manager.stop().join();
  }
}