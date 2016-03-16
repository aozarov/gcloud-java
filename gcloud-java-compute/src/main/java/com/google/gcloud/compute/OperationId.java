/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gcloud.compute;

/**
 * Interface for Google Compute Engine operation identities.
 */
public interface OperationId {

  /**
   * Possible types for a Google Compute Engine operation identity.
   */
  enum Type {
    /**
     * Global operations are those operations that deal with global resources, such as global
     * addresses or snapshots.
     */
    GLOBAL,
    /**
     * Region operations are those operations that deal with resources that live in a region, such
     * as subnetworks.
     */
    REGION,
    /**
     * Zone operations are those operations that deal with resources that live in a zone, such as
     * disks and instances.
     */
    ZONE
  }

  /**
   * Returns the type of this operation identity.
   */
  Type type();

  /**
   * Returns the name of the project.
   */
  String project();

  /**
   * Returns the name of the operation resource.
   */
  String operation();

  /**
   * Returns a fully qualified URL to the operation.
   */
  String selfLink();
}