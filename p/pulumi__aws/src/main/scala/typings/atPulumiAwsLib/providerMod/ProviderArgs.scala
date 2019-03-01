package typings
package atPulumiAwsLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderArgs extends js.Object {
  /**
    * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS
    * console.
    */
  val accessKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val allowedAccountIds: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  val assumeRole: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ExternalIdPolicyRoleArn]] = js.undefined
  val endpoints: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AcmApigateway]]]
  ] = js.undefined
  val forbiddenAccountIds: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Explicitly allow the provider to perform "insecure" SSL requests. If omitted,default value is `false`
    */
  val insecure: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The maximum number of times an AWS API request is being executed. If the API request still fails, an error is
    * thrown.
    */
  val maxRetries: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
    */
  val profile: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
    */
  val region: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.regionMod.Region]] = js.undefined
  /**
    * Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
    * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
    * Specific to the Amazon S3 service.
    */
  val s3ForcePathStyle: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS
    * console.
    */
  val secretKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
    */
  val sharedCredentialsFile: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
    * available/implemented.
    */
  val skipCredentialsValidation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
    */
  val skipGetEc2Platforms: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  val skipMetadataApiCheck: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that
    * are not public (yet).
    */
  val skipRegionValidation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
    */
  val skipRequestingAccountId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * session token. A session token is only required if you are using temporary security credentials.
    */
  val token: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object ProviderArgs {
  @scala.inline
  def apply(
    accessKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    allowedAccountIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    assumeRole: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ExternalIdPolicyRoleArn] = null,
    endpoints: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AcmApigateway]]] = null,
    forbiddenAccountIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    insecure: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    maxRetries: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    profile: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    region: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.regionMod.Region] = null,
    s3ForcePathStyle: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    secretKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    sharedCredentialsFile: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    skipCredentialsValidation: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    skipGetEc2Platforms: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    skipMetadataApiCheck: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    skipRegionValidation: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    skipRequestingAccountId: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    token: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): ProviderArgs = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (allowedAccountIds != null) __obj.updateDynamic("allowedAccountIds")(allowedAccountIds.asInstanceOf[js.Any])
    if (assumeRole != null) __obj.updateDynamic("assumeRole")(assumeRole.asInstanceOf[js.Any])
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (forbiddenAccountIds != null) __obj.updateDynamic("forbiddenAccountIds")(forbiddenAccountIds.asInstanceOf[js.Any])
    if (insecure != null) __obj.updateDynamic("insecure")(insecure.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (s3ForcePathStyle != null) __obj.updateDynamic("s3ForcePathStyle")(s3ForcePathStyle.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    if (sharedCredentialsFile != null) __obj.updateDynamic("sharedCredentialsFile")(sharedCredentialsFile.asInstanceOf[js.Any])
    if (skipCredentialsValidation != null) __obj.updateDynamic("skipCredentialsValidation")(skipCredentialsValidation.asInstanceOf[js.Any])
    if (skipGetEc2Platforms != null) __obj.updateDynamic("skipGetEc2Platforms")(skipGetEc2Platforms.asInstanceOf[js.Any])
    if (skipMetadataApiCheck != null) __obj.updateDynamic("skipMetadataApiCheck")(skipMetadataApiCheck.asInstanceOf[js.Any])
    if (skipRegionValidation != null) __obj.updateDynamic("skipRegionValidation")(skipRegionValidation.asInstanceOf[js.Any])
    if (skipRequestingAccountId != null) __obj.updateDynamic("skipRequestingAccountId")(skipRequestingAccountId.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderArgs]
  }
}

