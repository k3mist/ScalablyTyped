package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatchRegexPatternSetIdTextTransformation extends js.Object {
  var fieldToMatch: atPulumiPulumiLib.resourceMod.Input[Anon_DataTypeInput]
  var regexPatternSetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var textTransformation: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_FieldToMatchRegexPatternSetIdTextTransformation {
  @scala.inline
  def apply(
    fieldToMatch: atPulumiPulumiLib.resourceMod.Input[Anon_DataTypeInput],
    regexPatternSetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    textTransformation: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_FieldToMatchRegexPatternSetIdTextTransformation = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], regexPatternSetId = regexPatternSetId.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FieldToMatchRegexPatternSetIdTextTransformation]
  }
}

