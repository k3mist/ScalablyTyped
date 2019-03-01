package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassificationCustomPatterns extends js.Object {
  var classification: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var customPatterns: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var grokPattern: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ClassificationCustomPatterns {
  @scala.inline
  def apply(
    classification: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    grokPattern: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    customPatterns: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ClassificationCustomPatterns = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], grokPattern = grokPattern.asInstanceOf[js.Any])
    if (customPatterns != null) __obj.updateDynamic("customPatterns")(customPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassificationCustomPatterns]
  }
}

