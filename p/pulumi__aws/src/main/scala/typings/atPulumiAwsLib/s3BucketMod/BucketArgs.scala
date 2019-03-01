package typings
package atPulumiAwsLib.s3BucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketArgs extends js.Object {
  /**
    * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
    */
  val accelerationStatus: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to "private".
    */
  val acl: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.s3CannedAclMod.CannedAcl]
  ] = js.undefined
  /**
    * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
    */
  val bucket: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`.
    */
  val bucketPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
    */
  val corsRules: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedHeadersAllowedMethods]
      ]
    ]
  ] = js.undefined
  /**
    * A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
    */
  val hostedZoneId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
    */
  val lifecycleRules: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AbortIncompleteMultipartUploadDaysEnabled]
      ]
    ]
  ] = js.undefined
  /**
    * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
    */
  val loggings: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TargetBucketTargetPrefix]
      ]
    ]
  ] = js.undefined
  /**
    * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
    */
  val objectLockConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ObjectLockEnabledRule]] = js.undefined
  /**
    * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), Terraform may view the policy as constantly changing in a `terraform plan`. In this case, please make sure you use the verbose/specific version of the policy. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * If specified, the AWS region this bucket should reside in. Otherwise, the region used by the callee.
    */
  val region: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
    */
  val replicationConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_RoleRules]] = js.undefined
  /**
    * Specifies who should bear the cost of Amazon S3 data transfer.
    * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
    * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
    * developer guide for more information.
    */
  val requestPayer: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
    */
  val serverSideEncryptionConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      atPulumiAwsLib.Anon_RuleAnonApplyServerSideEncryptionByDefaultAnonKmsMasterKeyIdSseAlgorithm
    ]
  ] = js.undefined
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
    */
  val versioning: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EnabledMfaDeleteBoolean]] = js.undefined
  /**
    * A website object (documented below).
    */
  val website: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ErrorDocumentIndexDocument]
  ] = js.undefined
  /**
    * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
    */
  val websiteDomain: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
    */
  val websiteEndpoint: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object BucketArgs {
  @scala.inline
  def apply(
    accelerationStatus: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    acl: atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.s3CannedAclMod.CannedAcl] = null,
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    bucket: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    bucketPrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    corsRules: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllowedHeadersAllowedMethods]
      ]
    ] = null,
    forceDestroy: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    hostedZoneId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    lifecycleRules: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AbortIncompleteMultipartUploadDaysEnabled]
      ]
    ] = null,
    loggings: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TargetBucketTargetPrefix]
      ]
    ] = null,
    objectLockConfiguration: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ObjectLockEnabledRule] = null,
    policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    region: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    replicationConfiguration: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_RoleRules] = null,
    requestPayer: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    serverSideEncryptionConfiguration: atPulumiPulumiLib.resourceMod.Input[
      atPulumiAwsLib.Anon_RuleAnonApplyServerSideEncryptionByDefaultAnonKmsMasterKeyIdSseAlgorithm
    ] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    versioning: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EnabledMfaDeleteBoolean] = null,
    website: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ErrorDocumentIndexDocument] = null,
    websiteDomain: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    websiteEndpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): BucketArgs = {
    val __obj = js.Dynamic.literal()
    if (accelerationStatus != null) __obj.updateDynamic("accelerationStatus")(accelerationStatus.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    if (corsRules != null) __obj.updateDynamic("corsRules")(corsRules.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (hostedZoneId != null) __obj.updateDynamic("hostedZoneId")(hostedZoneId.asInstanceOf[js.Any])
    if (lifecycleRules != null) __obj.updateDynamic("lifecycleRules")(lifecycleRules.asInstanceOf[js.Any])
    if (loggings != null) __obj.updateDynamic("loggings")(loggings.asInstanceOf[js.Any])
    if (objectLockConfiguration != null) __obj.updateDynamic("objectLockConfiguration")(objectLockConfiguration.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (replicationConfiguration != null) __obj.updateDynamic("replicationConfiguration")(replicationConfiguration.asInstanceOf[js.Any])
    if (requestPayer != null) __obj.updateDynamic("requestPayer")(requestPayer.asInstanceOf[js.Any])
    if (serverSideEncryptionConfiguration != null) __obj.updateDynamic("serverSideEncryptionConfiguration")(serverSideEncryptionConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    if (websiteDomain != null) __obj.updateDynamic("websiteDomain")(websiteDomain.asInstanceOf[js.Any])
    if (websiteEndpoint != null) __obj.updateDynamic("websiteEndpoint")(websiteEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketArgs]
  }
}

