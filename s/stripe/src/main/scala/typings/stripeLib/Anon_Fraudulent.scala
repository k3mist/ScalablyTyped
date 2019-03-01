package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fraudulent extends js.Object {
  /**
    * Assessments from Stripe have the key stripe_report and, if set, the value "fraudulent".
    */
  var stripe_report: js.UndefOr[stripeLib.stripeLibStrings.fraudulent] = js.undefined
  /**
    * Assessments reported by you have the key user_report and, if set, possible values of "safe" and "fraudulent".
    */
  var user_report: js.UndefOr[stripeLib.stripeLibStrings.fraudulent | stripeLib.stripeLibStrings.safe] = js.undefined
}

object Anon_Fraudulent {
  @scala.inline
  def apply(
    stripe_report: stripeLib.stripeLibStrings.fraudulent = null,
    user_report: stripeLib.stripeLibStrings.fraudulent | stripeLib.stripeLibStrings.safe = null
  ): Anon_Fraudulent = {
    val __obj = js.Dynamic.literal()
    if (stripe_report != null) __obj.updateDynamic("stripe_report")(stripe_report)
    if (user_report != null) __obj.updateDynamic("user_report")(user_report.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fraudulent]
  }
}

