package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KmsKeyArnS3EncryptionMode extends js.Object {
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var s3EncryptionMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_KmsKeyArnS3EncryptionMode {
  @scala.inline
  def apply(
    kmsKeyArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    s3EncryptionMode: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_KmsKeyArnS3EncryptionMode = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (s3EncryptionMode != null) __obj.updateDynamic("s3EncryptionMode")(s3EncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KmsKeyArnS3EncryptionMode]
  }
}

