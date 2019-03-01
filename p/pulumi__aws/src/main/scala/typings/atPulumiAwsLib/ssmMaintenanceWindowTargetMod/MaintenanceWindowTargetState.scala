package typings
package atPulumiAwsLib.ssmMaintenanceWindowTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTargetState extends js.Object {
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  val ownerInformation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of target being registered with the Maintenance Window. Possible values `INSTANCE`.
    */
  val resourceType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The targets (either instances or tags). Instances are specified using Key=instanceids,Values=instanceid1,instanceid2. Tags are specified using Key=tag name,Values=tag value.
    */
  val targets: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]
    ]
  ] = js.undefined
  /**
    * The Id of the maintenance window to register the target with.
    */
  val windowId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object MaintenanceWindowTargetState {
  @scala.inline
  def apply(
    ownerInformation: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    resourceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    targets: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]
    ] = null,
    windowId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): MaintenanceWindowTargetState = {
    val __obj = js.Dynamic.literal()
    if (ownerInformation != null) __obj.updateDynamic("ownerInformation")(ownerInformation.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTargetState]
  }
}

