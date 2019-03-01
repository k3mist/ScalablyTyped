package typings
package atPulumiAwsLib.pinpointBaiduChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaiduChannelState extends js.Object {
  /**
    * Platform credential API key from Baidu.
    */
  val apiKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Platform credential Secret key from Baidu.
    */
  val secretKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object BaiduChannelState {
  @scala.inline
  def apply(
    apiKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    applicationId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    secretKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): BaiduChannelState = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelState]
  }
}

