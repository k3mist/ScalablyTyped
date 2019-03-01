package typings
package atPulumiAwsLib.pinpointAdmChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdmChannelArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
    */
  val clientId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
    */
  val clientSecret: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

object AdmChannelArgs {
  @scala.inline
  def apply(
    applicationId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    clientId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    clientSecret: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): AdmChannelArgs = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdmChannelArgs]
  }
}

