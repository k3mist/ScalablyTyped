package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ServiceNamesArray extends js.Object {
  var serviceNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
}

object Anon_ServiceNamesArray {
  @scala.inline
  def apply(
    serviceNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ): Anon_ServiceNamesArray = {
    val __obj = js.Dynamic.literal(serviceNames = serviceNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ServiceNamesArray]
  }
}

