package typings
package atPulumiAwsLib.codebuildWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookState extends js.Object {
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built.
    */
  val branchFilter: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The CodeBuild endpoint where webhook events are sent.
    */
  val payloadUrl: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the build project.
    */
  val projectName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
    */
  val secret: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The URL to the webhook.
    */
  val url: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object WebhookState {
  @scala.inline
  def apply(
    branchFilter: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    payloadUrl: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    projectName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    secret: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    url: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): WebhookState = {
    val __obj = js.Dynamic.literal()
    if (branchFilter != null) __obj.updateDynamic("branchFilter")(branchFilter.asInstanceOf[js.Any])
    if (payloadUrl != null) __obj.updateDynamic("payloadUrl")(payloadUrl.asInstanceOf[js.Any])
    if (projectName != null) __obj.updateDynamic("projectName")(projectName.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookState]
  }
}

