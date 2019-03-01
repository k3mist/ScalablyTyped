package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /** The accuracy of the location fix in meters. */
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /** The full address of the location. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** The name to be displayed. This may be a business name or a user-defined place, such as "Home". */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the location. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The type of resource. This is always mirror#location. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The latitude, in degrees. */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /** The longitude, in degrees. */
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /** The time at which this location was captured, formatted according to RFC 3339. */
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    accuracy: scala.Int | scala.Double = null,
    address: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    timestamp: java.lang.String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Location]
  }
}

