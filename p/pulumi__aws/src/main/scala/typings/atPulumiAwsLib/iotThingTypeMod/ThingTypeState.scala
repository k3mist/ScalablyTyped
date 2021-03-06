package typings
package atPulumiAwsLib.iotThingTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingTypeState extends js.Object {
  /**
    * The ARN of the created AWS IoT Thing Type.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  val deprecated: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The name of the thing type.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val properties: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DescriptionSearchableAttributes]
  ] = js.undefined
}

object ThingTypeState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    deprecated: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    properties: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DescriptionSearchableAttributes] = null
  ): ThingTypeState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeState]
  }
}

