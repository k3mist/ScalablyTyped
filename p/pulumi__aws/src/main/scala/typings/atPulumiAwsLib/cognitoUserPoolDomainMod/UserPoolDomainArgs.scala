package typings
package atPulumiAwsLib.cognitoUserPoolDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolDomainArgs extends js.Object {
  /**
    * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
    */
  val certificateArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The domain string.
    */
  val domain: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The user pool ID.
    */
  val userPoolId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object UserPoolDomainArgs {
  @scala.inline
  def apply(
    domain: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    userPoolId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    certificateArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): UserPoolDomainArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolDomainArgs]
  }
}

