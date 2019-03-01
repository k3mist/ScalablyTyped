package typings
package atPulumiAwsLib.ssmActivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivationState extends js.Object {
  /**
    * The code the system generates when it processes the activation.
    */
  val activationCode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the resource that you want to register.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time.
    */
  val expirationDate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * If the current activation has expired.
    */
  val expired: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM Role to attach to the managed instance.
    */
  val iamRole: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The default name of the registered managed instance.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of managed instances that are currently registered using this activation.
    */
  val registrationCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The maximum number of managed instances you want to register. The default value is 1 instance.
    */
  val registrationLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object ActivationState {
  @scala.inline
  def apply(
    activationCode: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    expirationDate: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    expired: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    iamRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    registrationCount: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    registrationLimit: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): ActivationState = {
    val __obj = js.Dynamic.literal()
    if (activationCode != null) __obj.updateDynamic("activationCode")(activationCode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (expired != null) __obj.updateDynamic("expired")(expired.asInstanceOf[js.Any])
    if (iamRole != null) __obj.updateDynamic("iamRole")(iamRole.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (registrationCount != null) __obj.updateDynamic("registrationCount")(registrationCount.asInstanceOf[js.Any])
    if (registrationLimit != null) __obj.updateDynamic("registrationLimit")(registrationLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationState]
  }
}

