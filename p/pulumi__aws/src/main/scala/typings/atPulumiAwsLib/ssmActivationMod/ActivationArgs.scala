package typings
package atPulumiAwsLib.ssmActivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivationArgs extends js.Object {
  /**
    * The description of the resource that you want to register.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time.
    */
  val expirationDate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM Role to attach to the managed instance.
    */
  val iamRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The default name of the registered managed instance.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The maximum number of managed instances you want to register. The default value is 1 instance.
    */
  val registrationLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object ActivationArgs {
  @scala.inline
  def apply(
    iamRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    expirationDate: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    registrationLimit: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): ActivationArgs = {
    val __obj = js.Dynamic.literal(iamRole = iamRole.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (registrationLimit != null) __obj.updateDynamic("registrationLimit")(registrationLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationArgs]
  }
}

