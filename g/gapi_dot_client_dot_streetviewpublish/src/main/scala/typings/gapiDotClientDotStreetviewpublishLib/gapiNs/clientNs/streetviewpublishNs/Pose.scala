package typings
package gapiDotClientDotStreetviewpublishLib.gapiNs.clientNs.streetviewpublishNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pose extends js.Object {
  /**
    * Altitude of the pose in meters above ground level (as defined by WGS84).
    * NaN indicates an unmeasured quantity.
    */
  var altitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * Compass heading, measured at the center of the photo in degrees clockwise
    * from North. Value must be >=0 and <360.
    * NaN indicates an unmeasured quantity.
    */
  var heading: js.UndefOr[scala.Double] = js.undefined
  /**
    * Latitude and longitude pair of the pose, as explained here:
    * https://cloud.google.com/datastore/docs/reference/rest/Shared.Types/LatLng
    * When creating a Photo, if the
    * latitude and longitude pair are not provided here, the geolocation from the
    * exif header will be used. If the latitude and longitude pair is not
    * provided and cannot be found in the exif header, the create photo process
    * will fail.
    */
  var latLngPair: js.UndefOr[LatLng] = js.undefined
  /** Level (the floor in a building) used to configure vertical navigation. */
  var level: js.UndefOr[Level] = js.undefined
  /**
    * Pitch, measured at the center of the photo in degrees. Value must be >=-90
    * and <= 90. A value of -90 means looking directly down, and a value of 90
    * means looking directly up.
    * NaN indicates an unmeasured quantity.
    */
  var pitch: js.UndefOr[scala.Double] = js.undefined
  /**
    * Roll, measured in degrees. Value must be >= 0 and <360. A value of 0
    * means level with the horizon.
    * NaN indicates an unmeasured quantity.
    */
  var roll: js.UndefOr[scala.Double] = js.undefined
}

object Pose {
  @scala.inline
  def apply(
    altitude: scala.Int | scala.Double = null,
    heading: scala.Int | scala.Double = null,
    latLngPair: LatLng = null,
    level: Level = null,
    pitch: scala.Int | scala.Double = null,
    roll: scala.Int | scala.Double = null
  ): Pose = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (latLngPair != null) __obj.updateDynamic("latLngPair")(latLngPair)
    if (level != null) __obj.updateDynamic("level")(level)
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (roll != null) __obj.updateDynamic("roll")(roll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pose]
  }
}

