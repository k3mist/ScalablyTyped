package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointIdIndex extends js.Object {
  var endpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var id: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var index: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_EndpointIdIndex {
  @scala.inline
  def apply(
    endpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    id: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    index: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_EndpointIdIndex = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EndpointIdIndex]
  }
}

