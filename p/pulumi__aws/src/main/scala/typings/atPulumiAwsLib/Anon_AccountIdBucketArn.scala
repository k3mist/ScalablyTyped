package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdBucketArn extends js.Object {
  var accountId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var bucketArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var encryption: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_SseKmsSseS3]] = js.undefined
  var format: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var prefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_AccountIdBucketArn {
  @scala.inline
  def apply(
    bucketArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    format: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    accountId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    encryption: atPulumiPulumiLib.resourceMod.Input[Anon_SseKmsSseS3] = null,
    prefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_AccountIdBucketArn = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccountIdBucketArn]
  }
}

