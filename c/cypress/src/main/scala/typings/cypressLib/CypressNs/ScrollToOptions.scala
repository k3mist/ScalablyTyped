package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToOptions
  extends Loggable
     with Timeoutable {
  /**
    * Scrolls over the duration (in ms)
    *
    * @default 0
    */
  var duration: scala.Double
  /**
    * Will scroll with the easing animation
    *
    * @default 'swing'
    */
  var easing: cypressLib.cypressLibStrings.swing | cypressLib.cypressLibStrings.linear
}

object ScrollToOptions {
  @scala.inline
  def apply(
    duration: scala.Double,
    easing: cypressLib.cypressLibStrings.swing | cypressLib.cypressLibStrings.linear,
    log: scala.Boolean,
    timeout: scala.Double
  ): ScrollToOptions = {
    val __obj = js.Dynamic.literal(duration = duration, easing = easing.asInstanceOf[js.Any], log = log, timeout = timeout)
  
    __obj.asInstanceOf[ScrollToOptions]
  }
}

