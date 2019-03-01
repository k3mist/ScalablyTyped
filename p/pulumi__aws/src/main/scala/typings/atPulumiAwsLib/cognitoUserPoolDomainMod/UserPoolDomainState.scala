package typings
package atPulumiAwsLib.cognitoUserPoolDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolDomainState extends js.Object {
  /**
    * The AWS account ID for the user pool owner.
    */
  val awsAccountId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
    */
  val certificateArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the CloudFront distribution.
    */
  val cloudfrontDistributionArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The domain string.
    */
  val domain: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The S3 bucket where the static files for this domain are stored.
    */
  val s3Bucket: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The user pool ID.
    */
  val userPoolId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The app version.
    */
  val version: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object UserPoolDomainState {
  @scala.inline
  def apply(
    awsAccountId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    certificateArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    cloudfrontDistributionArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    domain: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    s3Bucket: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    userPoolId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    version: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): UserPoolDomainState = {
    val __obj = js.Dynamic.literal()
    if (awsAccountId != null) __obj.updateDynamic("awsAccountId")(awsAccountId.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (cloudfrontDistributionArn != null) __obj.updateDynamic("cloudfrontDistributionArn")(cloudfrontDistributionArn.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket.asInstanceOf[js.Any])
    if (userPoolId != null) __obj.updateDynamic("userPoolId")(userPoolId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolDomainState]
  }
}

