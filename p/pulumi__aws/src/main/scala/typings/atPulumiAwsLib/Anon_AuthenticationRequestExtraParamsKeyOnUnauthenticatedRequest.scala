package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var onUnauthenticatedRequest: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var scope: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var sessionCookieName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var sessionTimeout: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var userPoolArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var userPoolClientId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var userPoolDomain: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest {
  @scala.inline
  def apply(
    userPoolArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    userPoolClientId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    userPoolDomain: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    authenticationRequestExtraParams: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    onUnauthenticatedRequest: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    scope: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    sessionCookieName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    sessionTimeout: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest = {
    val __obj = js.Dynamic.literal(userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams.asInstanceOf[js.Any])
    if (onUnauthenticatedRequest != null) __obj.updateDynamic("onUnauthenticatedRequest")(onUnauthenticatedRequest.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sessionCookieName != null) __obj.updateDynamic("sessionCookieName")(sessionCookieName.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest]
  }
}

