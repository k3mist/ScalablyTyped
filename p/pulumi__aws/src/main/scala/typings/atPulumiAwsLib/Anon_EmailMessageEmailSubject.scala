package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailMessageEmailSubject extends js.Object {
  var emailMessage: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var emailSubject: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var smsMessage: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_EmailMessageEmailSubject {
  @scala.inline
  def apply(
    emailMessage: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    emailSubject: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    smsMessage: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_EmailMessageEmailSubject = {
    val __obj = js.Dynamic.literal()
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage.asInstanceOf[js.Any])
    if (emailSubject != null) __obj.updateDynamic("emailSubject")(emailSubject.asInstanceOf[js.Any])
    if (smsMessage != null) __obj.updateDynamic("smsMessage")(smsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EmailMessageEmailSubject]
  }
}

