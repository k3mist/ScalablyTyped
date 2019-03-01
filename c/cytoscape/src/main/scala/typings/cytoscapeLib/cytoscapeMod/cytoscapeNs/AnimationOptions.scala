package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  /** An object containing centring options from which the graph will be animated. */
  var center: js.UndefOr[CenterOptions] = js.undefined
  /** duration - The duration of the animation in milliseconds. */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** easing - A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: js.UndefOr[cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction] = js.undefined
  /** An object containing fitting options from which the graph will be animated. */
  var fit: js.UndefOr[AnimationFitOptions] = js.undefined
  /** A panning position to which the graph will be animated. */
  var pan: js.UndefOr[Position] = js.undefined
  /** A relative panning position to which the graph will be animated. */
  var panBy: js.UndefOr[Position] = js.undefined
  /** A zoom level to which the graph will be animated. */
  var zoom: js.UndefOr[ZoomOptions] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    center: CenterOptions = null,
    duration: scala.Int | scala.Double = null,
    easing: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction = null,
    fit: AnimationFitOptions = null,
    pan: Position = null,
    panBy: Position = null,
    zoom: ZoomOptions = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (fit != null) __obj.updateDynamic("fit")(fit)
    if (pan != null) __obj.updateDynamic("pan")(pan)
    if (panBy != null) __obj.updateDynamic("panBy")(panBy)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[AnimationOptions]
  }
}

