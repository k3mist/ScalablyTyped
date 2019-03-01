package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromPortIpRange extends js.Object {
  var fromPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var ipRange: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var protocol: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var toPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

object Anon_FromPortIpRange {
  @scala.inline
  def apply(
    fromPort: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    ipRange: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    protocol: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    toPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  ): Anon_FromPortIpRange = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], ipRange = ipRange.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FromPortIpRange]
  }
}

