package typings
package atPulumiAwsLib.pinpointApnsSandboxChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApnsSandboxChannelState extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
    */
  val bundleId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The pem encoded TLS Certificate from Apple.
    */
  val certificate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The default authentication method used for APNs Sandbox.
    * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
    * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
    * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
    */
  val defaultAuthenticationMethod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The Certificate Private Key file (ie. `.key` file).
    */
  val privateKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
    */
  val teamId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The `.p8` file that you download from your Apple developer account when you create an authentication key.
    */
  val tokenKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
    */
  val tokenKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ApnsSandboxChannelState {
  @scala.inline
  def apply(
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    bundleId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    certificate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultAuthenticationMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    privateKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    teamId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tokenKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tokenKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ApnsSandboxChannelState = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (defaultAuthenticationMethod != null) __obj.updateDynamic("defaultAuthenticationMethod")(defaultAuthenticationMethod.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (teamId != null) __obj.updateDynamic("teamId")(teamId.asInstanceOf[js.Any])
    if (tokenKey != null) __obj.updateDynamic("tokenKey")(tokenKey.asInstanceOf[js.Any])
    if (tokenKeyId != null) __obj.updateDynamic("tokenKeyId")(tokenKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApnsSandboxChannelState]
  }
}

