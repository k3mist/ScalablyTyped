package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonOperatorFieldToMatch extends js.Object {
  var comparisonOperator: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var fieldToMatch: atPulumiPulumiLib.resourceMod.Input[Anon_DataTypeInput]
  var size: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var textTransformation: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ComparisonOperatorFieldToMatch {
  @scala.inline
  def apply(
    comparisonOperator: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    fieldToMatch: atPulumiPulumiLib.resourceMod.Input[Anon_DataTypeInput],
    size: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    textTransformation: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_ComparisonOperatorFieldToMatch = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], fieldToMatch = fieldToMatch.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ComparisonOperatorFieldToMatch]
  }
}

