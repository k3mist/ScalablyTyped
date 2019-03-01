package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalIdSnsCallerArn extends js.Object {
  var externalId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var snsCallerArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ExternalIdSnsCallerArn {
  @scala.inline
  def apply(
    externalId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    snsCallerArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_ExternalIdSnsCallerArn = {
    val __obj = js.Dynamic.literal(externalId = externalId.asInstanceOf[js.Any], snsCallerArn = snsCallerArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ExternalIdSnsCallerArn]
  }
}

