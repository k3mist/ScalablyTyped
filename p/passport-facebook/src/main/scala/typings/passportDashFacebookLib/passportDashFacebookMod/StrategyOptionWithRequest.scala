package typings
package passportDashFacebookLib.passportDashFacebookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: passportDashFacebookLib.passportDashFacebookLibNumbers.`true`
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashFacebookLib.passportDashFacebookLibNumbers.`true`,
    enableProof: js.UndefOr[scala.Boolean] = js.undefined,
    profileFields: js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

