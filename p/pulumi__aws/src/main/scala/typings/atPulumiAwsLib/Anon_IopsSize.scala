package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IopsSize extends js.Object {
  var iops: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var size: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var volumesPerInstance: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object Anon_IopsSize {
  @scala.inline
  def apply(
    size: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    iops: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    volumesPerInstance: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_IopsSize = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumesPerInstance != null) __obj.updateDynamic("volumesPerInstance")(volumesPerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IopsSize]
  }
}

