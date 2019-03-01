package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeaderNameHeaderValue extends js.Object {
  var headerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var headerValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var position: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

object Anon_HeaderNameHeaderValue {
  @scala.inline
  def apply(
    headerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    headerValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    position: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  ): Anon_HeaderNameHeaderValue = {
    val __obj = js.Dynamic.literal(headerName = headerName.asInstanceOf[js.Any], headerValue = headerValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HeaderNameHeaderValue]
  }
}

