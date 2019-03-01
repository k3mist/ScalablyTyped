package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedMethodsCachedMethodsCompress extends js.Object {
  var allowedMethods: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var cachedMethods: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var compress: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var defaultTtl: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var fieldLevelEncryptionId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var forwardedValues: atPulumiPulumiLib.resourceMod.Input[Anon_CookiesHeaders]
  var lambdaFunctionAssociations: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_EventTypeIncludeBody]]]
  ] = js.undefined
  var maxTtl: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var minTtl: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var pathPattern: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var smoothStreaming: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var targetOriginId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var trustedSigners: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var viewerProtocolPolicy: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_AllowedMethodsCachedMethodsCompress {
  @scala.inline
  def apply(
    allowedMethods: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    cachedMethods: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    forwardedValues: atPulumiPulumiLib.resourceMod.Input[Anon_CookiesHeaders],
    pathPattern: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    targetOriginId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    viewerProtocolPolicy: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    compress: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    defaultTtl: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    fieldLevelEncryptionId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    lambdaFunctionAssociations: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_EventTypeIncludeBody]]] = null,
    maxTtl: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    minTtl: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    smoothStreaming: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    trustedSigners: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_AllowedMethodsCachedMethodsCompress = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], cachedMethods = cachedMethods.asInstanceOf[js.Any], forwardedValues = forwardedValues.asInstanceOf[js.Any], pathPattern = pathPattern.asInstanceOf[js.Any], targetOriginId = targetOriginId.asInstanceOf[js.Any], viewerProtocolPolicy = viewerProtocolPolicy.asInstanceOf[js.Any])
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (defaultTtl != null) __obj.updateDynamic("defaultTtl")(defaultTtl.asInstanceOf[js.Any])
    if (fieldLevelEncryptionId != null) __obj.updateDynamic("fieldLevelEncryptionId")(fieldLevelEncryptionId.asInstanceOf[js.Any])
    if (lambdaFunctionAssociations != null) __obj.updateDynamic("lambdaFunctionAssociations")(lambdaFunctionAssociations.asInstanceOf[js.Any])
    if (maxTtl != null) __obj.updateDynamic("maxTtl")(maxTtl.asInstanceOf[js.Any])
    if (minTtl != null) __obj.updateDynamic("minTtl")(minTtl.asInstanceOf[js.Any])
    if (smoothStreaming != null) __obj.updateDynamic("smoothStreaming")(smoothStreaming.asInstanceOf[js.Any])
    if (trustedSigners != null) __obj.updateDynamic("trustedSigners")(trustedSigners.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedMethodsCachedMethodsCompress]
  }
}

