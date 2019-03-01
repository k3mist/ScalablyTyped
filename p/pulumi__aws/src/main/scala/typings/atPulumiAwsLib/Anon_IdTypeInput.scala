package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdTypeInput extends js.Object {
  var id: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_IdTypeInput {
  @scala.inline
  def apply(
    id: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_IdTypeInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IdTypeInput]
  }
}

