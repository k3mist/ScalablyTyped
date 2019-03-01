package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingWebhooks[T] extends js.Object {
  var calls: js.Array[IncomingWebhookCall[T]]
  def addResponse(opts: IncomingWebhookOptions[T]): scala.Unit
  def reset(): scala.Unit
}

object IncomingWebhooks {
  @scala.inline
  def apply[T](
    addResponse: js.Function1[IncomingWebhookOptions[T], scala.Unit],
    calls: js.Array[IncomingWebhookCall[T]],
    reset: js.Function0[scala.Unit]
  ): IncomingWebhooks[T] = {
    val __obj = js.Dynamic.literal(addResponse = addResponse, calls = calls, reset = reset)
  
    __obj.asInstanceOf[IncomingWebhooks[T]]
  }
}

