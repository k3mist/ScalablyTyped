package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameBucketPrefixIngestionRole extends js.Object {
  var bucketName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var bucketPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var ingestionRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var sourceEngine: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var sourceEngineVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_BucketNameBucketPrefixIngestionRole {
  @scala.inline
  def apply(
    bucketName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    ingestionRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    sourceEngine: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    sourceEngineVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    bucketPrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_BucketNameBucketPrefixIngestionRole = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], ingestionRole = ingestionRole.asInstanceOf[js.Any], sourceEngine = sourceEngine.asInstanceOf[js.Any], sourceEngineVersion = sourceEngineVersion.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketNameBucketPrefixIngestionRole]
  }
}

