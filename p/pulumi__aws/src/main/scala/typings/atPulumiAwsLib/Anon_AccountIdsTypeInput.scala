package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdsTypeInput extends js.Object {
  var accountIds: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_AccountIdsTypeInput {
  @scala.inline
  def apply(
    accountIds: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_AccountIdsTypeInput = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AccountIdsTypeInput]
  }
}

