package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends js.Object {
  /**
    * Set the duration of the transition animation in ms
    * @default 500
    */
  var duration: scala.Double
  /**
    * Set height of slider
    * @default 400
    */
  var height: scala.Double
  /**
    * Set to false to hide slide indicators
    * @default true
    */
  var indicators: scala.Boolean
  /**
    * Set the duration between transitions in ms
    * @default 6000
    */
  var interval: scala.Double
}

object SliderOptions {
  @scala.inline
  def apply(duration: scala.Double, height: scala.Double, indicators: scala.Boolean, interval: scala.Double): SliderOptions = {
    val __obj = js.Dynamic.literal(duration = duration, height = height, indicators = indicators, interval = interval)
  
    __obj.asInstanceOf[SliderOptions]
  }
}

