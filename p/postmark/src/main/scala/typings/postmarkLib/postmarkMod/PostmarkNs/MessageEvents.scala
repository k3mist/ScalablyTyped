package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// message events
trait MessageEvents extends js.Object {
  var Details: MessageEventDetails
  var ReceivedAt: java.lang.String
  var Recipient: java.lang.String
  var Type: java.lang.String
}

object MessageEvents {
  @scala.inline
  def apply(
    Details: MessageEventDetails,
    ReceivedAt: java.lang.String,
    Recipient: java.lang.String,
    Type: java.lang.String
  ): MessageEvents = {
    val __obj = js.Dynamic.literal(Details = Details, ReceivedAt = ReceivedAt, Recipient = Recipient, Type = Type)
  
    __obj.asInstanceOf[MessageEvents]
  }
}

