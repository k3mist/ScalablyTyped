package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameKmsKeyArnObjectKeyPrefix extends js.Object {
  var bucketName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var objectKeyPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var position: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var topicArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_BucketNameKmsKeyArnObjectKeyPrefix {
  @scala.inline
  def apply(
    bucketName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    position: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    kmsKeyArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    objectKeyPrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    topicArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_BucketNameKmsKeyArnObjectKeyPrefix = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (objectKeyPrefix != null) __obj.updateDynamic("objectKeyPrefix")(objectKeyPrefix.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketNameKmsKeyArnObjectKeyPrefix]
  }
}

