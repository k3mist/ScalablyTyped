package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketKeyRoleArn extends js.Object {
  var bucket: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var key: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_BucketKeyRoleArn {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    key: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_BucketKeyRoleArn = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BucketKeyRoleArn]
  }
}

