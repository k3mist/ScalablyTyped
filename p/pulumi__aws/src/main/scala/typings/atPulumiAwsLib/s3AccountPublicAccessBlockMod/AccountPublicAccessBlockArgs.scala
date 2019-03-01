package typings
package atPulumiAwsLib.s3AccountPublicAccessBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPublicAccessBlockArgs extends js.Object {
  /**
    * AWS account ID to configure. Defaults to automatically determined account ID of the Terraform AWS provider.
    */
  val accountId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
    * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
    * * PUT Object calls will fail if the request includes an object ACL.
    */
  val blockPublicAcls: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
    * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
    */
  val blockPublicPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
    * * Ignore all public ACLs on buckets in this account and any objects that they contain.
    */
  val ignorePublicAcls: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
    * * Only the bucket owner and AWS Services can access buckets with public policies.
    */
  val restrictPublicBuckets: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

object AccountPublicAccessBlockArgs {
  @scala.inline
  def apply(
    accountId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    blockPublicAcls: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    blockPublicPolicy: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    ignorePublicAcls: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    restrictPublicBuckets: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): AccountPublicAccessBlockArgs = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (blockPublicAcls != null) __obj.updateDynamic("blockPublicAcls")(blockPublicAcls.asInstanceOf[js.Any])
    if (blockPublicPolicy != null) __obj.updateDynamic("blockPublicPolicy")(blockPublicPolicy.asInstanceOf[js.Any])
    if (ignorePublicAcls != null) __obj.updateDynamic("ignorePublicAcls")(ignorePublicAcls.asInstanceOf[js.Any])
    if (restrictPublicBuckets != null) __obj.updateDynamic("restrictPublicBuckets")(restrictPublicBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountPublicAccessBlockArgs]
  }
}

