package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var authorizationEndpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var clientId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var clientSecret: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var issuer: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var onUnauthenticatedRequest: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var scope: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var sessionCookieName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var sessionTimeout: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var tokenEndpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var userInfoEndpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret {
  @scala.inline
  def apply(
    authorizationEndpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    clientId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    clientSecret: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    issuer: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    tokenEndpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    userInfoEndpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    authenticationRequestExtraParams: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    onUnauthenticatedRequest: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    scope: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    sessionCookieName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    sessionTimeout: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams.asInstanceOf[js.Any])
    if (onUnauthenticatedRequest != null) __obj.updateDynamic("onUnauthenticatedRequest")(onUnauthenticatedRequest.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sessionCookieName != null) __obj.updateDynamic("sessionCookieName")(sessionCookieName.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret]
  }
}

