package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameKey extends js.Object {
  var bucketName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var key: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_BucketNameKey {
  @scala.inline
  def apply(
    bucketName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    key: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_BucketNameKey = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BucketNameKey]
  }
}

