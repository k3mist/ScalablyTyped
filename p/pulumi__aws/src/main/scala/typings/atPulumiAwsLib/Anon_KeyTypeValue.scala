package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyTypeValue extends js.Object {
  var key: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var value: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_KeyTypeValue {
  @scala.inline
  def apply(
    key: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    value: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_KeyTypeValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyTypeValue]
  }
}

