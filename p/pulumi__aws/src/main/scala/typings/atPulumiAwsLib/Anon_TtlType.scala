package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TtlType extends js.Object {
  var ttl: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_TtlType {
  @scala.inline
  def apply(
    ttl: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_TtlType = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TtlType]
  }
}

