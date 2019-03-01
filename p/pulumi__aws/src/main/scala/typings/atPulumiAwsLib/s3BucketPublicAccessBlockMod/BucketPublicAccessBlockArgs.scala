package typings
package atPulumiAwsLib.s3BucketPublicAccessBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketPublicAccessBlockArgs extends js.Object {
  /**
    * Whether Amazon S3 should block public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
    * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
    * * PUT Object calls will fail if the request includes an object ACL.
    */
  val blockPublicAcls: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether Amazon S3 should block public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the existing bucket policy. When set to `true` causes Amazon S3 to:
    * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
    */
  val blockPublicPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * S3 Bucket to which this Public Access Block configuration should be applied.
    */
  val bucket: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Whether Amazon S3 should ignore public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
    * * Ignore all public ACLs on buckets in this account and any objects that they contain.
    */
  val ignorePublicAcls: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether Amazon S3 should restrict public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the previously stored bucket policy, except that public and cross-account access within the public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
    * * Only the bucket owner and AWS Services can access this buckets if it has a public policy.
    */
  val restrictPublicBuckets: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

object BucketPublicAccessBlockArgs {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    blockPublicAcls: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    blockPublicPolicy: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    ignorePublicAcls: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    restrictPublicBuckets: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): BucketPublicAccessBlockArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (blockPublicAcls != null) __obj.updateDynamic("blockPublicAcls")(blockPublicAcls.asInstanceOf[js.Any])
    if (blockPublicPolicy != null) __obj.updateDynamic("blockPublicPolicy")(blockPublicPolicy.asInstanceOf[js.Any])
    if (ignorePublicAcls != null) __obj.updateDynamic("ignorePublicAcls")(ignorePublicAcls.asInstanceOf[js.Any])
    if (restrictPublicBuckets != null) __obj.updateDynamic("restrictPublicBuckets")(restrictPublicBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPublicAccessBlockArgs]
  }
}

