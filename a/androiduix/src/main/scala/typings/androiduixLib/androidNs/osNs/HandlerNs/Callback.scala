package typings
package androiduixLib.androidNs.osNs.HandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def handleMessage(msg: androiduixLib.androidNs.osNs.Message): scala.Boolean
}

object Callback {
  @scala.inline
  def apply(handleMessage: androiduixLib.androidNs.osNs.Message => scala.Boolean): Callback = {
    val __obj = js.Dynamic.literal(handleMessage = js.Any.fromFunction1(handleMessage))
  
    __obj.asInstanceOf[Callback]
  }
}

