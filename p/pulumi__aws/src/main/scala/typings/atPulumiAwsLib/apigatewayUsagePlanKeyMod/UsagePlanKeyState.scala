package typings
package atPulumiAwsLib.apigatewayUsagePlanKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlanKeyState extends js.Object {
  /**
    * The identifier of the API key resource.
    */
  val keyId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of the API key resource. Currently, the valid key type is API_KEY.
    */
  val keyType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of a usage plan key.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Id of the usage plan resource representing to associate the key to.
    */
  val usagePlanId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The value of a usage plan key.
    */
  val value: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object UsagePlanKeyState {
  @scala.inline
  def apply(
    keyId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    keyType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    usagePlanId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    value: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): UsagePlanKeyState = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (usagePlanId != null) __obj.updateDynamic("usagePlanId")(usagePlanId.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanKeyState]
  }
}

