package typings
package reactDashCartographerLib.libComponentsMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapProps extends js.Object {
  var addressLine1: js.UndefOr[java.lang.String] = js.undefined
  var city: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** Default: 270 */
  var height: scala.Double
  var latitude: js.UndefOr[scala.Double] = js.undefined
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /** Default: map */
  var mapId: java.lang.String
  /** Default: yahoo */
  var provider: reactDashCartographerLib.reactDashCartographerLibStrings.yahoo | reactDashCartographerLib.reactDashCartographerLibStrings.google | reactDashCartographerLib.reactDashCartographerLibStrings.bing
  var providerKey: java.lang.String
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Default: false */
  var useBackgroundImageStyle: scala.Boolean
  /** Default: 580 */
  var width: scala.Double
  /** Default: 10 */
  var zoom: scala.Double
}

object MapProps {
  @scala.inline
  def apply(
    height: scala.Double,
    mapId: java.lang.String,
    provider: reactDashCartographerLib.reactDashCartographerLibStrings.yahoo | reactDashCartographerLib.reactDashCartographerLibStrings.google | reactDashCartographerLib.reactDashCartographerLibStrings.bing,
    providerKey: java.lang.String,
    useBackgroundImageStyle: scala.Boolean,
    width: scala.Double,
    zoom: scala.Double,
    addressLine1: java.lang.String = null,
    city: java.lang.String = null,
    country: java.lang.String = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    state: java.lang.String = null
  ): MapProps = {
    val __obj = js.Dynamic.literal(height = height, mapId = mapId, provider = provider.asInstanceOf[js.Any], providerKey = providerKey, useBackgroundImageStyle = useBackgroundImageStyle, width = width, zoom = zoom)
    if (addressLine1 != null) __obj.updateDynamic("addressLine1")(addressLine1)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[MapProps]
  }
}

