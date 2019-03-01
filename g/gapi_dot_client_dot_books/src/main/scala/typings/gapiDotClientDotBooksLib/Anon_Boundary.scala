package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Boundary extends js.Object {
  /** The boundary of the location as a set of loops containing pairs of latitude, longitude coordinates. */
  var boundary: js.UndefOr[js.Array[js.Array[Anon_Latitude]]] = js.undefined
  /** The cache policy active for this data. EX: UNRESTRICTED, RESTRICTED, NEVER */
  var cachePolicy: js.UndefOr[java.lang.String] = js.undefined
  /** The country code of the location. */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /** The latitude of the location. */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /** The longitude of the location. */
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /** The type of map that should be used for this location. EX: HYBRID, ROADMAP, SATELLITE, TERRAIN */
  var mapType: js.UndefOr[java.lang.String] = js.undefined
  /** The viewport for showing this location. This is a latitude, longitude rectangle. */
  var viewport: js.UndefOr[Anon_Hi] = js.undefined
  /**
    * The Zoom level to use for the map. Zoom levels between 0 (the lowest zoom level, in which the entire world can be seen on one map) to 21+ (down to
    * individual buildings). See: https://developers.google.com/maps/documentation/staticmaps/#Zoomlevels
    */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Boundary {
  @scala.inline
  def apply(
    boundary: js.Array[js.Array[Anon_Latitude]] = null,
    cachePolicy: java.lang.String = null,
    countryCode: java.lang.String = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    mapType: java.lang.String = null,
    viewport: Anon_Hi = null,
    zoom: scala.Int | scala.Double = null
  ): Anon_Boundary = {
    val __obj = js.Dynamic.literal()
    if (boundary != null) __obj.updateDynamic("boundary")(boundary)
    if (cachePolicy != null) __obj.updateDynamic("cachePolicy")(cachePolicy)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (mapType != null) __obj.updateDynamic("mapType")(mapType)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Boundary]
  }
}

