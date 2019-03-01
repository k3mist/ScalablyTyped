package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomCnameEnabled extends js.Object {
  var customCname: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var expirationInDays: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var s3BucketName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_CustomCnameEnabled {
  @scala.inline
  def apply(
    expirationInDays: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    customCname: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    s3BucketName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_CustomCnameEnabled = {
    val __obj = js.Dynamic.literal(expirationInDays = expirationInDays.asInstanceOf[js.Any])
    if (customCname != null) __obj.updateDynamic("customCname")(customCname.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomCnameEnabled]
  }
}

