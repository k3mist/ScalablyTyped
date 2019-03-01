package typings
package atPulumiAwsLib.codepipelineWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookState extends js.Object {
  /**
    * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
    */
  val authentication: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
    */
  val authenticationConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedIpRangeSecretToken]
  ] = js.undefined
  /**
    * One or more `filter` blocks. Filter blocks are documented below.
    */
  val filters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_JsonPathMatchEquals]]
    ]
  ] = js.undefined
  /**
    * The name of the webhook.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
    */
  val targetAction: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the pipeline.
    */
  val targetPipeline: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
    */
  val url: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object WebhookState {
  @scala.inline
  def apply(
    authentication: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    authenticationConfiguration: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedIpRangeSecretToken] = null,
    filters: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_JsonPathMatchEquals]]
    ] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    targetAction: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    targetPipeline: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    url: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): WebhookState = {
    val __obj = js.Dynamic.literal()
    if (authentication != null) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (authenticationConfiguration != null) __obj.updateDynamic("authenticationConfiguration")(authenticationConfiguration.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (targetAction != null) __obj.updateDynamic("targetAction")(targetAction.asInstanceOf[js.Any])
    if (targetPipeline != null) __obj.updateDynamic("targetPipeline")(targetPipeline.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookState]
  }
}

