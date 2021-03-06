package typings
package microsoftteamsLib.microsoftTeamsNs.authenticationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthTokenRequest extends js.Object {
  /**
    * A function that is called if the token request fails, with the reason for the failure.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * An array of resource URIs identifying the target resources for which the token should be requested.
    */
  var resources: js.Array[java.lang.String]
  /**
    * A function that is called if the token request succeeds, with the resulting token.
    */
  var successCallback: js.UndefOr[js.Function1[/* token */ java.lang.String, scala.Unit]] = js.undefined
}

object AuthTokenRequest {
  @scala.inline
  def apply(
    resources: js.Array[java.lang.String],
    failureCallback: /* reason */ java.lang.String => scala.Unit = null,
    successCallback: /* token */ java.lang.String => scala.Unit = null
  ): AuthTokenRequest = {
    val __obj = js.Dynamic.literal(resources = resources)
    if (failureCallback != null) __obj.updateDynamic("failureCallback")(js.Any.fromFunction1(failureCallback))
    if (successCallback != null) __obj.updateDynamic("successCallback")(js.Any.fromFunction1(successCallback))
    __obj.asInstanceOf[AuthTokenRequest]
  }
}

