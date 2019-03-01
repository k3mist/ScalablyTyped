package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassificationRowTagInput extends js.Object {
  var classification: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var rowTag: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ClassificationRowTagInput {
  @scala.inline
  def apply(
    classification: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    rowTag: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_ClassificationRowTagInput = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], rowTag = rowTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClassificationRowTagInput]
  }
}

