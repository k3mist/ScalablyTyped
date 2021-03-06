package typings
package requestidlecallbackLib.requestidlecallbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleDeadline extends js.Object {
  val didTimeout: scala.Boolean
  def timeRemaining(): DOMHighResTimeStamp
}

object IdleDeadline {
  @scala.inline
  def apply(didTimeout: scala.Boolean, timeRemaining: () => DOMHighResTimeStamp): IdleDeadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout, timeRemaining = js.Any.fromFunction0(timeRemaining))
  
    __obj.asInstanceOf[IdleDeadline]
  }
}

