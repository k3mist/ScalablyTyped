package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameVirtualName extends js.Object {
  var deviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var virtualName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_DeviceNameVirtualName {
  @scala.inline
  def apply(
    deviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    virtualName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_DeviceNameVirtualName = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DeviceNameVirtualName]
  }
}

