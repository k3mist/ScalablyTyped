package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewOptions extends js.Object {
  /** The bounding rectangle of the map view. If both bounds and center are specified, bounds takes precedence over center. */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  /** The location of the center of the map view. If both bounds and center are specified, bounds takes precedence over center. */
  var center: js.UndefOr[Location] = js.undefined
  /**	The amount the center is shifted in pixels.This property is ignored if center is not specified. */
  var centerOffset: js.UndefOr[Point] = js.undefined
  /**
    * The directional heading of the map. The heading is represented in geometric degrees with 0 or 360 = North, 90 = East,
    * 180 = South, and 270 = West.
    */
  var heading: js.UndefOr[scala.Double] = js.undefined
  /** Indicates how the map labels are displayed. */
  var labelOverlay: js.UndefOr[LabelOverlay] = js.undefined
  /** The map type of the view. */
  var mapTypeId: js.UndefOr[MapTypeId] = js.undefined
  /** The amount of padding in pixels to be added to each side of the bounds of the map view. */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /** The angle relative to the horizon to tilt a streetside panorama image. */
  var pitch: js.UndefOr[scala.Double] = js.undefined
  /** The zoom level of the map view. */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object IViewOptions {
  @scala.inline
  def apply(
    bounds: LocationRect = null,
    center: Location = null,
    centerOffset: Point = null,
    heading: scala.Int | scala.Double = null,
    labelOverlay: LabelOverlay = null,
    mapTypeId: MapTypeId = null,
    padding: scala.Int | scala.Double = null,
    pitch: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
  ): IViewOptions = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (center != null) __obj.updateDynamic("center")(center)
    if (centerOffset != null) __obj.updateDynamic("centerOffset")(centerOffset)
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (labelOverlay != null) __obj.updateDynamic("labelOverlay")(labelOverlay)
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewOptions]
  }
}

