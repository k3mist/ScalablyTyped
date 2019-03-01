package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleShadow extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.styleShadow
  var blurRadius: scala.Double
  var color: SketchMSColor
  var contextSettings: SketchMSGraphicsContextSettings
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var isEnabled: scala.Double
  var offsetX: scala.Double
  var offsetY: scala.Double
  var spread: scala.Double
}

object SketchMSStyleShadow {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.styleShadow,
    blurRadius: scala.Double,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    isEnabled: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double,
    spread: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSStyleShadow = {
    val __obj = js.Dynamic.literal(_class = _class, blurRadius = blurRadius, color = color, contextSettings = contextSettings, isEnabled = isEnabled, offsetX = offsetX, offsetY = offsetY, spread = spread)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleShadow]
  }
}

