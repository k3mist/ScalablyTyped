package typings
package atPulumiAwsLib.cloudfrontOriginAccessIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginAccessIdentityState extends js.Object {
  /**
    * Internal value used by CloudFront to allow future
    * updates to the origin access identity.
    */
  val callerReference: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A shortcut to the full path for the
    * origin access identity to use in CloudFront, see below.
    */
  val cloudfrontAccessIdentityPath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * An optional comment for the origin access identity.
    */
  val comment: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The current version of the origin access identity's information.
    * For example: `E2QWRUHAPOMQZL`.
    */
  val etag: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A pre-generated ARN for use in S3 bucket policies (see below).
    * Example: `arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity
    * E2QWRUHAPOMQZL`.
    */
  val iamArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon S3 canonical user ID for the origin
    * access identity, which you use when giving the origin access identity read
    * permission to an object in Amazon S3.
    */
  val s3CanonicalUserId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

