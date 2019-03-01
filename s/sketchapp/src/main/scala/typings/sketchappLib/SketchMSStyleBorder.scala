package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleBorder extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.styleBorder
  var color: SketchMSColor
  var contextSettings: SketchMSGraphicsContextSettings
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var fillType: scala.Double
  var gradient: SketchMSGradient
  var isEnabled: scala.Double
  var position: scala.Double
  var thickness: scala.Double
}

object SketchMSStyleBorder {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.styleBorder,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    fillType: scala.Double,
    gradient: SketchMSGradient,
    isEnabled: scala.Double,
    position: scala.Double,
    thickness: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSStyleBorder = {
    val __obj = js.Dynamic.literal(_class = _class, color = color, contextSettings = contextSettings, fillType = fillType, gradient = gradient, isEnabled = isEnabled, position = position, thickness = thickness)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleBorder]
  }
}

