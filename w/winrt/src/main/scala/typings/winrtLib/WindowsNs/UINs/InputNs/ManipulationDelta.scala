package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManipulationDelta extends js.Object {
  var expansion: scala.Double
  var rotation: scala.Double
  var scale: scala.Double
  var translation: winrtLib.WindowsNs.FoundationNs.Point
}

object ManipulationDelta {
  @scala.inline
  def apply(
    expansion: scala.Double,
    rotation: scala.Double,
    scale: scala.Double,
    translation: winrtLib.WindowsNs.FoundationNs.Point
  ): ManipulationDelta = {
    val __obj = js.Dynamic.literal(expansion = expansion, rotation = rotation, scale = scale, translation = translation)
  
    __obj.asInstanceOf[ManipulationDelta]
  }
}

