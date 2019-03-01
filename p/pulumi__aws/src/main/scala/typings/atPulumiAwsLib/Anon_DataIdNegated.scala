package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataIdNegated extends js.Object {
  var dataId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var negated: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_DataIdNegated {
  @scala.inline
  def apply(
    dataId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    negated: atPulumiPulumiLib.resourceMod.Input[scala.Boolean],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_DataIdNegated = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataIdNegated]
  }
}

