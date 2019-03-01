package typings
package atPulumiAwsLib.cloudfrontDistributionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionState extends js.Object {
  /**
    * The key pair IDs that CloudFront is aware of for
    * each trusted signer, if the distribution is set up to serve private content
    * with signed URLs.
    */
  val activeTrustedSigners: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * Extra CNAMEs (alternate domain names), if any, for
    * this distribution.
    */
  val aliases: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
    * Internal value used by CloudFront to allow future
    * updates to the distribution configuration.
    */
  val callerReference: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
  val defaultCacheBehavior: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompressDefaultTtl]
  ] = js.undefined
  /**
    * The object that you want CloudFront to
    * return (for example, index.html) when an end user requests the root URL.
    */
  val defaultRootObject: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  val domainName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The current version of the distribution's information. For example:
    * `E2QWRUHAPOMQZL`.
    */
  val etag: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The CloudFront Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set][7] to. This attribute is simply an
    * alias for the zone ID `Z2FDTNDATAQYW2`.
    */
  val hostedZoneId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The maximum HTTP version to support on the
    * distribution. Allowed values are `http1.1` and `http2`. The default is
    * `http2`.
    */
  val httpVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of invalidation batches
    * currently in progress.
    */
  val inProgressValidationBatches: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * Whether the IPv6 is enabled for the distribution.
    */
  val isIpv6Enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The date and time the distribution was last modified.
    */
  val lastModifiedTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
  val origins: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CustomHeadersCustomOriginConfig]
      ]
    ]
  ] = js.undefined
  /**
    * The price class for this distribution. One of
    * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
    */
  val priceClass: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The restriction
    * configuration for this distribution (maximum one).
    */
  val restrictions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_GeoRestrictionAnonLocationsRestrictionType]
  ] = js.undefined
  /**
    * Disables the distribution instead of
    * deleting it when destroying the resource through Terraform. If this is set,
    * the distribution needs to be deleted manually afterwards. Default: `false`.
    */
  val retainOnDelete: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The current status of the distribution. `Deployed` if the
    * distribution's information is fully propagated throughout the Amazon
    * CloudFront system.
    */
  val status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
  val viewerCertificate: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AcmCertificateArnCloudfrontDefaultCertificate]
  ] = js.undefined
  /**
    * If you're using AWS WAF to filter CloudFront
    * requests, the Id of the AWS WAF web ACL that is associated with the
    * distribution.
    */
  val webAclId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object DistributionState {
  @scala.inline
  def apply(
    activeTrustedSigners: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    aliases: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    cacheBehaviors: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompress]
      ]
    ] = null,
    callerReference: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    comment: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    customErrorResponses: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ErrorCachingMinTtlErrorCode]
      ]
    ] = null,
    defaultCacheBehavior: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompressDefaultTtl] = null,
    defaultRootObject: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    domainName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    etag: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    hostedZoneId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    httpVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    inProgressValidationBatches: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    isIpv6Enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    lastModifiedTime: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    loggingConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketIncludeCookiesPrefix] = null,
    orderedCacheBehaviors: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompress]
      ]
    ] = null,
    origins: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CustomHeadersCustomOriginConfig]
      ]
    ] = null,
    priceClass: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    restrictions: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_GeoRestrictionAnonLocationsRestrictionType] = null,
    retainOnDelete: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    status: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    viewerCertificate: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AcmCertificateArnCloudfrontDefaultCertificate] = null,
    webAclId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): DistributionState = {
    val __obj = js.Dynamic.literal()
    if (activeTrustedSigners != null) __obj.updateDynamic("activeTrustedSigners")(activeTrustedSigners.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (cacheBehaviors != null) __obj.updateDynamic("cacheBehaviors")(cacheBehaviors.asInstanceOf[js.Any])
    if (callerReference != null) __obj.updateDynamic("callerReference")(callerReference.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (customErrorResponses != null) __obj.updateDynamic("customErrorResponses")(customErrorResponses.asInstanceOf[js.Any])
    if (defaultCacheBehavior != null) __obj.updateDynamic("defaultCacheBehavior")(defaultCacheBehavior.asInstanceOf[js.Any])
    if (defaultRootObject != null) __obj.updateDynamic("defaultRootObject")(defaultRootObject.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (hostedZoneId != null) __obj.updateDynamic("hostedZoneId")(hostedZoneId.asInstanceOf[js.Any])
    if (httpVersion != null) __obj.updateDynamic("httpVersion")(httpVersion.asInstanceOf[js.Any])
    if (inProgressValidationBatches != null) __obj.updateDynamic("inProgressValidationBatches")(inProgressValidationBatches.asInstanceOf[js.Any])
    if (isIpv6Enabled != null) __obj.updateDynamic("isIpv6Enabled")(isIpv6Enabled.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (orderedCacheBehaviors != null) __obj.updateDynamic("orderedCacheBehaviors")(orderedCacheBehaviors.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (priceClass != null) __obj.updateDynamic("priceClass")(priceClass.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (retainOnDelete != null) __obj.updateDynamic("retainOnDelete")(retainOnDelete.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (viewerCertificate != null) __obj.updateDynamic("viewerCertificate")(viewerCertificate.asInstanceOf[js.Any])
    if (webAclId != null) __obj.updateDynamic("webAclId")(webAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionState]
  }
}

