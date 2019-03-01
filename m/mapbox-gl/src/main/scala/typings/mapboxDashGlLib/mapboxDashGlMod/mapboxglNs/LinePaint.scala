package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinePaint extends js.Object {
  var `line-blur`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `line-blur-transition`: js.UndefOr[Transition] = js.undefined
  var `line-color`: js.UndefOr[java.lang.String | StyleFunction | Expression] = js.undefined
  var `line-color-transition`: js.UndefOr[Transition] = js.undefined
  var `line-dasharray`: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var `line-dasharray-transition`: js.UndefOr[Transition] = js.undefined
  var `line-gap-width`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `line-gap-width-transition`: js.UndefOr[Transition] = js.undefined
  var `line-gradient`: js.UndefOr[Expression] = js.undefined
  var `line-offset`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `line-offset-transition`: js.UndefOr[Transition] = js.undefined
  var `line-opacity`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `line-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `line-pattern`: js.UndefOr[java.lang.String | Expression] = js.undefined
  var `line-pattern-transition`: js.UndefOr[Transition] = js.undefined
  var `line-translate`: js.UndefOr[js.Array[scala.Double] | Expression] = js.undefined
  var `line-translate-anchor`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport
  ] = js.undefined
  var `line-translate-transition`: js.UndefOr[Transition] = js.undefined
  var `line-width`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `line-width-transition`: js.UndefOr[Transition] = js.undefined
}

object LinePaint {
  @scala.inline
  def apply(
    `line-blur`: scala.Double | StyleFunction | Expression = null,
    `line-blur-transition`: Transition = null,
    `line-color`: java.lang.String | StyleFunction | Expression = null,
    `line-color-transition`: Transition = null,
    `line-dasharray`: js.Array[scala.Double] = null,
    `line-dasharray-transition`: Transition = null,
    `line-gap-width`: scala.Double | StyleFunction | Expression = null,
    `line-gap-width-transition`: Transition = null,
    `line-gradient`: Expression = null,
    `line-offset`: scala.Double | StyleFunction | Expression = null,
    `line-offset-transition`: Transition = null,
    `line-opacity`: scala.Double | StyleFunction | Expression = null,
    `line-opacity-transition`: Transition = null,
    `line-pattern`: java.lang.String | Expression = null,
    `line-pattern-transition`: Transition = null,
    `line-translate`: js.Array[scala.Double] | Expression = null,
    `line-translate-anchor`: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport = null,
    `line-translate-transition`: Transition = null,
    `line-width`: scala.Double | StyleFunction | Expression = null,
    `line-width-transition`: Transition = null
  ): LinePaint = {
    val __obj = js.Dynamic.literal()
    if (`line-blur` != null) __obj.updateDynamic("line-blur")(`line-blur`.asInstanceOf[js.Any])
    if (`line-blur-transition` != null) __obj.updateDynamic("line-blur-transition")(`line-blur-transition`)
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-color-transition` != null) __obj.updateDynamic("line-color-transition")(`line-color-transition`)
    if (`line-dasharray` != null) __obj.updateDynamic("line-dasharray")(`line-dasharray`)
    if (`line-dasharray-transition` != null) __obj.updateDynamic("line-dasharray-transition")(`line-dasharray-transition`)
    if (`line-gap-width` != null) __obj.updateDynamic("line-gap-width")(`line-gap-width`.asInstanceOf[js.Any])
    if (`line-gap-width-transition` != null) __obj.updateDynamic("line-gap-width-transition")(`line-gap-width-transition`)
    if (`line-gradient` != null) __obj.updateDynamic("line-gradient")(`line-gradient`)
    if (`line-offset` != null) __obj.updateDynamic("line-offset")(`line-offset`.asInstanceOf[js.Any])
    if (`line-offset-transition` != null) __obj.updateDynamic("line-offset-transition")(`line-offset-transition`)
    if (`line-opacity` != null) __obj.updateDynamic("line-opacity")(`line-opacity`.asInstanceOf[js.Any])
    if (`line-opacity-transition` != null) __obj.updateDynamic("line-opacity-transition")(`line-opacity-transition`)
    if (`line-pattern` != null) __obj.updateDynamic("line-pattern")(`line-pattern`.asInstanceOf[js.Any])
    if (`line-pattern-transition` != null) __obj.updateDynamic("line-pattern-transition")(`line-pattern-transition`)
    if (`line-translate` != null) __obj.updateDynamic("line-translate")(`line-translate`.asInstanceOf[js.Any])
    if (`line-translate-anchor` != null) __obj.updateDynamic("line-translate-anchor")(`line-translate-anchor`.asInstanceOf[js.Any])
    if (`line-translate-transition` != null) __obj.updateDynamic("line-translate-transition")(`line-translate-transition`)
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    if (`line-width-transition` != null) __obj.updateDynamic("line-width-transition")(`line-width-transition`)
    __obj.asInstanceOf[LinePaint]
  }
}

