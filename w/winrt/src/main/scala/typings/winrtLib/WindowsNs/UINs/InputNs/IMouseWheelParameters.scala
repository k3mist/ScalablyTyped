package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseWheelParameters extends js.Object {
  var charTranslation: winrtLib.WindowsNs.FoundationNs.Point
  var deltaRotationAngle: scala.Double
  var deltaScale: scala.Double
  var pageTranslation: winrtLib.WindowsNs.FoundationNs.Point
}

object IMouseWheelParameters {
  @scala.inline
  def apply(
    charTranslation: winrtLib.WindowsNs.FoundationNs.Point,
    deltaRotationAngle: scala.Double,
    deltaScale: scala.Double,
    pageTranslation: winrtLib.WindowsNs.FoundationNs.Point
  ): IMouseWheelParameters = {
    val __obj = js.Dynamic.literal(charTranslation = charTranslation, deltaRotationAngle = deltaRotationAngle, deltaScale = deltaScale, pageTranslation = pageTranslation)
  
    __obj.asInstanceOf[IMouseWheelParameters]
  }
}

