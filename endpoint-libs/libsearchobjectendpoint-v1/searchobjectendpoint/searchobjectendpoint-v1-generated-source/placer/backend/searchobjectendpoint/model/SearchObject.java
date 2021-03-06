/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-06-09 16:41:44 UTC)
 * on 2014-06-23 at 12:12:34 UTC 
 * Modify at your own risk.
 */

package placer.backend.searchobjectendpoint.model;

/**
 * Model definition for SearchObject.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the searchobjectendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchObject extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float axisX;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float axisY;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float axisZ;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float bearing;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double longitude;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getAxisX() {
    return axisX;
  }

  /**
   * @param axisX axisX or {@code null} for none
   */
  public SearchObject setAxisX(java.lang.Float axisX) {
    this.axisX = axisX;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getAxisY() {
    return axisY;
  }

  /**
   * @param axisY axisY or {@code null} for none
   */
  public SearchObject setAxisY(java.lang.Float axisY) {
    this.axisY = axisY;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getAxisZ() {
    return axisZ;
  }

  /**
   * @param axisZ axisZ or {@code null} for none
   */
  public SearchObject setAxisZ(java.lang.Float axisZ) {
    this.axisZ = axisZ;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getBearing() {
    return bearing;
  }

  /**
   * @param bearing bearing or {@code null} for none
   */
  public SearchObject setBearing(java.lang.Float bearing) {
    this.bearing = bearing;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public SearchObject setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * @param latitude latitude or {@code null} for none
   */
  public SearchObject setLatitude(java.lang.Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * @param longitude longitude or {@code null} for none
   */
  public SearchObject setLongitude(java.lang.Double longitude) {
    this.longitude = longitude;
    return this;
  }

  @Override
  public SearchObject set(String fieldName, Object value) {
    return (SearchObject) super.set(fieldName, value);
  }

  @Override
  public SearchObject clone() {
    return (SearchObject) super.clone();
  }

}
