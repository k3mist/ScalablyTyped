package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClaimMatchType extends js.Object {
  var claim: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var matchType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var value: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ClaimMatchType {
  @scala.inline
  def apply(
    claim: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    matchType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    value: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_ClaimMatchType = {
    val __obj = js.Dynamic.literal(claim = claim.asInstanceOf[js.Any], matchType = matchType.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClaimMatchType]
  }
}

