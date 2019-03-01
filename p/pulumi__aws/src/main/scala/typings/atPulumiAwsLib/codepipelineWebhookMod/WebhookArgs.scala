package typings
package atPulumiAwsLib.codepipelineWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookArgs extends js.Object {
  /**
    * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
    */
  val authentication: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
    */
  val authenticationConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedIpRangeSecretToken]
  ] = js.undefined
  /**
    * One or more `filter` blocks. Filter blocks are documented below.
    */
  val filters: atPulumiPulumiLib.resourceMod.Input[
    js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_JsonPathMatchEquals]]
  ]
  /**
    * The name of the webhook.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
    */
  val targetAction: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of the pipeline.
    */
  val targetPipeline: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object WebhookArgs {
  @scala.inline
  def apply(
    authentication: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    filters: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_JsonPathMatchEquals]]
    ],
    targetAction: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    targetPipeline: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    authenticationConfiguration: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedIpRangeSecretToken] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): WebhookArgs = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], targetAction = targetAction.asInstanceOf[js.Any], targetPipeline = targetPipeline.asInstanceOf[js.Any])
    if (authenticationConfiguration != null) __obj.updateDynamic("authenticationConfiguration")(authenticationConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookArgs]
  }
}

