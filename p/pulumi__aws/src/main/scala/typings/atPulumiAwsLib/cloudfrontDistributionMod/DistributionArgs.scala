package typings
package atPulumiAwsLib.cloudfrontDistributionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionArgs extends js.Object {
  /**
    * Extra CNAMEs (alternate domain names), if any, for
    * this distribution.
    */
  val aliases: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * **Deprecated**, use `ordered_cache_behavior` instead.
    */
  val cacheBehaviors: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompress]
      ]
    ]
  ] = js.undefined
  /**
    * Any comments you want to include about the
    * distribution.
    */
  val comment: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * One or more custom error response elements (multiples allowed).
    */
  val customErrorResponses: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ErrorCachingMinTtlErrorCode]
      ]
    ]
  ] = js.undefined
  /**
    * The default cache behavior for this distribution (maximum
    * one).
    */
  val defaultCacheBehavior: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompressDefaultTtl]
  /**
    * The object that you want CloudFront to
    * return (for example, index.html) when an end user requests the root URL.
    */
  val defaultRootObject: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  val enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  /**
    * The maximum HTTP version to support on the
    * distribution. Allowed values are `http1.1` and `http2`. The default is
    * `http2`.
    */
  val httpVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the IPv6 is enabled for the distribution.
    */
  val isIpv6Enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The logging
    * configuration that controls how logs are written
    * to your distribution (maximum one).
    */
  val loggingConfig: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketIncludeCookiesPrefix]
  ] = js.undefined
  /**
    * An ordered list of cache behaviors
    * resource for this distribution. List from top to bottom
    * +    in order of precedence. The topmost cache behavior will have precedence 0.
    */
  val orderedCacheBehaviors: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompress]
      ]
    ]
  ] = js.undefined
  /**
    * One or more origins for this
    * distribution (multiples allowed).
    */
  val origins: atPulumiPulumiLib.resourceMod.Input[
    js.Array[
      atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CustomHeadersCustomOriginConfig]
    ]
  ]
  /**
    * The price class for this distribution. One of
    * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
    */
  val priceClass: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The restriction
    * configuration for this distribution (maximum one).
    */
  val restrictions: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_GeoRestrictionAnonLocationsRestrictionType]
  /**
    * Disables the distribution instead of
    * deleting it when destroying the resource through Terraform. If this is set,
    * the distribution needs to be deleted manually afterwards. Default: `false`.
    */
  val retainOnDelete: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The SSL
    * configuration for this distribution (maximum
    * one).
    */
  val viewerCertificate: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AcmCertificateArnCloudfrontDefaultCertificate]
  /**
    * If you're using AWS WAF to filter CloudFront
    * requests, the Id of the AWS WAF web ACL that is associated with the
    * distribution.
    */
  val webAclId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object DistributionArgs {
  @scala.inline
  def apply(
    defaultCacheBehavior: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompressDefaultTtl],
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean],
    origins: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CustomHeadersCustomOriginConfig]
      ]
    ],
    restrictions: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_GeoRestrictionAnonLocationsRestrictionType],
    viewerCertificate: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AcmCertificateArnCloudfrontDefaultCertificate],
    aliases: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    cacheBehaviors: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompress]
      ]
    ] = null,
    comment: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    customErrorResponses: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ErrorCachingMinTtlErrorCode]
      ]
    ] = null,
    defaultRootObject: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    httpVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    isIpv6Enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    loggingConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketIncludeCookiesPrefix] = null,
    orderedCacheBehaviors: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompress]
      ]
    ] = null,
    priceClass: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    retainOnDelete: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    webAclId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): DistributionArgs = {
    val __obj = js.Dynamic.literal(defaultCacheBehavior = defaultCacheBehavior.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], viewerCertificate = viewerCertificate.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (cacheBehaviors != null) __obj.updateDynamic("cacheBehaviors")(cacheBehaviors.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (customErrorResponses != null) __obj.updateDynamic("customErrorResponses")(customErrorResponses.asInstanceOf[js.Any])
    if (defaultRootObject != null) __obj.updateDynamic("defaultRootObject")(defaultRootObject.asInstanceOf[js.Any])
    if (httpVersion != null) __obj.updateDynamic("httpVersion")(httpVersion.asInstanceOf[js.Any])
    if (isIpv6Enabled != null) __obj.updateDynamic("isIpv6Enabled")(isIpv6Enabled.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (orderedCacheBehaviors != null) __obj.updateDynamic("orderedCacheBehaviors")(orderedCacheBehaviors.asInstanceOf[js.Any])
    if (priceClass != null) __obj.updateDynamic("priceClass")(priceClass.asInstanceOf[js.Any])
    if (retainOnDelete != null) __obj.updateDynamic("retainOnDelete")(retainOnDelete.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (webAclId != null) __obj.updateDynamic("webAclId")(webAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionArgs]
  }
}

