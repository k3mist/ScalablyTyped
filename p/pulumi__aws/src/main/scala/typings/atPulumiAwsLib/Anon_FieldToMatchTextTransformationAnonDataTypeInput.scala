package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatchTextTransformationAnonDataTypeInput extends js.Object {
  var fieldToMatch: atPulumiPulumiLib.resourceMod.Input[Anon_DataTypeInput]
  var textTransformation: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_FieldToMatchTextTransformationAnonDataTypeInput {
  @scala.inline
  def apply(
    fieldToMatch: atPulumiPulumiLib.resourceMod.Input[Anon_DataTypeInput],
    textTransformation: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_FieldToMatchTextTransformationAnonDataTypeInput = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FieldToMatchTextTransformationAnonDataTypeInput]
  }
}

