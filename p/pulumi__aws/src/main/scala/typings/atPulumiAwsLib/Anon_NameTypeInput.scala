package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTypeInput extends js.Object {
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_NameTypeInput {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_NameTypeInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameTypeInput]
  }
}

