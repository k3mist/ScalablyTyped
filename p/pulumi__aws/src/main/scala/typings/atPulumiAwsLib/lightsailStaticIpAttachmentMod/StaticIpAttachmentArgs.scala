package typings
package atPulumiAwsLib.lightsailStaticIpAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticIpAttachmentArgs extends js.Object {
  /**
    * The name of the Lightsail instance to attach the IP to
    */
  val instanceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of the allocated static IP
    */
  val staticIpName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object StaticIpAttachmentArgs {
  @scala.inline
  def apply(
    instanceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    staticIpName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): StaticIpAttachmentArgs = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], staticIpName = staticIpName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StaticIpAttachmentArgs]
  }
}

