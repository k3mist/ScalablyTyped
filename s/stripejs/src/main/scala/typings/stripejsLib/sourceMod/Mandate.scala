package typings
package stripejsLib.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mandate extends js.Object {
  var acceptance: js.UndefOr[Acceptance] = js.undefined
  /**
    * The method Stripe should use to notify the customer
    * - email: an email is sent directly to the customer
    * - manual: a source.mandate_notification event is sent to your webhooks endpoint and you should handle the notification
    * - none: the underlying debit network does not require any notification
    */
  var notification_method: js.UndefOr[
    stripejsLib.stripejsLibStrings.email | stripejsLib.stripejsLibStrings.manual | stripejsLib.stripejsLibStrings.none
  ] = js.undefined
}

object Mandate {
  @scala.inline
  def apply(
    acceptance: Acceptance = null,
    notification_method: stripejsLib.stripejsLibStrings.email | stripejsLib.stripejsLibStrings.manual | stripejsLib.stripejsLibStrings.none = null
  ): Mandate = {
    val __obj = js.Dynamic.literal()
    if (acceptance != null) __obj.updateDynamic("acceptance")(acceptance)
    if (notification_method != null) __obj.updateDynamic("notification_method")(notification_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mandate]
  }
}

