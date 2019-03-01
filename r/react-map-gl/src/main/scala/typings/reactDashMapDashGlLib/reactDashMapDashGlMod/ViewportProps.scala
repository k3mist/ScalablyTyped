package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportProps extends js.Object {
  var altitude: scala.Double
  var bearing: scala.Double
  var height: scala.Double
  var latitude: scala.Double
  var longitude: scala.Double
  var maxPitch: scala.Double
  var maxZoom: scala.Double
  var minPitch: scala.Double
  var minZoom: scala.Double
  var pitch: scala.Double
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  var transitionEasing: js.UndefOr[EasingFunction] = js.undefined
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.undefined
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.undefined
  var width: scala.Double
  var zoom: scala.Double
}

object ViewportProps {
  @scala.inline
  def apply(
    altitude: scala.Double,
    bearing: scala.Double,
    height: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    maxPitch: scala.Double,
    maxZoom: scala.Double,
    minPitch: scala.Double,
    minZoom: scala.Double,
    pitch: scala.Double,
    width: scala.Double,
    zoom: scala.Double,
    transitionDuration: scala.Int | scala.Double = null,
    transitionEasing: EasingFunction = null,
    transitionInterpolator: TransitionInterpolator = null,
    transitionInterruption: TRANSITION_EVENTS = null
  ): ViewportProps = {
    val __obj = js.Dynamic.literal(altitude = altitude, bearing = bearing, height = height, latitude = latitude, longitude = longitude, maxPitch = maxPitch, maxZoom = maxZoom, minPitch = minPitch, minZoom = minZoom, pitch = pitch, width = width, zoom = zoom)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasing != null) __obj.updateDynamic("transitionEasing")(transitionEasing)
    if (transitionInterpolator != null) __obj.updateDynamic("transitionInterpolator")(transitionInterpolator)
    if (transitionInterruption != null) __obj.updateDynamic("transitionInterruption")(transitionInterruption)
    __obj.asInstanceOf[ViewportProps]
  }
}

