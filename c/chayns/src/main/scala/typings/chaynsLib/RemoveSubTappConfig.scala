package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.removeSubTapp()
trait RemoveSubTappConfig extends js.Object {
  var close: scala.Boolean
  var remove: scala.Boolean
  var tappID: scala.Double
}

object RemoveSubTappConfig {
  @scala.inline
  def apply(close: scala.Boolean, remove: scala.Boolean, tappID: scala.Double): RemoveSubTappConfig = {
    val __obj = js.Dynamic.literal(close = close, remove = remove, tappID = tappID)
  
    __obj.asInstanceOf[RemoveSubTappConfig]
  }
}

