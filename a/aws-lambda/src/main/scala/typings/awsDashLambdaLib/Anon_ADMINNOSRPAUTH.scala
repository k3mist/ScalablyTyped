package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADMINNOSRPAUTH extends js.Object {
  var challengeMetadata: js.UndefOr[java.lang.String] = js.undefined
  var challengeName: awsDashLambdaLib.awsDashLambdaLibStrings.CUSTOM_CHALLENGE | awsDashLambdaLib.awsDashLambdaLibStrings.PASSWORD_VERIFIER | awsDashLambdaLib.awsDashLambdaLibStrings.SMS_MFA | awsDashLambdaLib.awsDashLambdaLibStrings.DEVICE_SRP_AUTH | awsDashLambdaLib.awsDashLambdaLibStrings.DEVICE_PASSWORD_VERIFIER | awsDashLambdaLib.awsDashLambdaLibStrings.ADMIN_NO_SRP_AUTH
  var challengeResult: scala.Boolean
}

object Anon_ADMINNOSRPAUTH {
  @scala.inline
  def apply(
    challengeName: awsDashLambdaLib.awsDashLambdaLibStrings.CUSTOM_CHALLENGE | awsDashLambdaLib.awsDashLambdaLibStrings.PASSWORD_VERIFIER | awsDashLambdaLib.awsDashLambdaLibStrings.SMS_MFA | awsDashLambdaLib.awsDashLambdaLibStrings.DEVICE_SRP_AUTH | awsDashLambdaLib.awsDashLambdaLibStrings.DEVICE_PASSWORD_VERIFIER | awsDashLambdaLib.awsDashLambdaLibStrings.ADMIN_NO_SRP_AUTH,
    challengeResult: scala.Boolean,
    challengeMetadata: java.lang.String = null
  ): Anon_ADMINNOSRPAUTH = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult)
    if (challengeMetadata != null) __obj.updateDynamic("challengeMetadata")(challengeMetadata)
    __obj.asInstanceOf[Anon_ADMINNOSRPAUTH]
  }
}

