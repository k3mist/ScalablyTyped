package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnFileKey extends js.Object {
  var bucketArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var fileKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_BucketArnFileKey {
  @scala.inline
  def apply(
    bucketArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    fileKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_BucketArnFileKey = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BucketArnFileKey]
  }
}

