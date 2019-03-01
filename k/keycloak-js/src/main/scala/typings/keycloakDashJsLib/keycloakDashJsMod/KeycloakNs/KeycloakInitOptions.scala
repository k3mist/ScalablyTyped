package typings
package keycloakDashJsLib.keycloakDashJsMod.KeycloakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakInitOptions extends js.Object {
  /**
  		 * Allows to use different adapter:
  		 * 
  		 * - {string} default - using browser api for redirects
  		 * - {string} cordova - using cordova plugins 
  		 * - {function} - allows to provide custom function as adapter.
  		 */
  var adapter: js.UndefOr[KeycloakAdapterName] = js.undefined
  /**
  		 * Set to enable/disable monitoring login state.
  		 * @default true
  		 */
  var checkLoginIframe: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Set the interval to check login state (in seconds).
  		 * @default 5
  		 */
  var checkLoginIframeInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Set the OpenID Connect flow.
  		 * @default standard
  		 */
  var flow: js.UndefOr[KeycloakFlow] = js.undefined
  /**
  		 * Set an initial value for the id token (only together with `token` or
  		 * `refreshToken`).
  		 */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Specifies an action to do on load.
  		 */
  var onLoad: js.UndefOr[KeycloakOnLoad] = js.undefined
  /**
  		 * Specifies a default uri to redirect to after login or logout.
  		 * This is currently supported for adapter 'cordova-native' and 'default'
  		 */
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Set an initial value for the refresh token.
  		 */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Set the OpenID Connect response mode to send to Keycloak upon login.
  		 * @default fragment After successful authentication Keycloak will redirect
  		 *                   to JavaScript application with OpenID Connect parameters
  		 *                   added in URL fragment. This is generally safer and
  		 *                   recommended over query.
  		 */
  var responseMode: js.UndefOr[KeycloakResponseMode] = js.undefined
  /**
  		 * Set an initial value for skew between local time and Keycloak server in
  		 * seconds (only together with `token` or `refreshToken`).
  		 */
  var timeSkew: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Set an initial value for the token.
  		 */
  var token: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * @private Undocumented.
  		 */
  var useNonce: js.UndefOr[scala.Boolean] = js.undefined
}

object KeycloakInitOptions {
  @scala.inline
  def apply(
    adapter: KeycloakAdapterName = null,
    checkLoginIframe: js.UndefOr[scala.Boolean] = js.undefined,
    checkLoginIframeInterval: scala.Int | scala.Double = null,
    flow: KeycloakFlow = null,
    idToken: java.lang.String = null,
    onLoad: KeycloakOnLoad = null,
    redirectUri: java.lang.String = null,
    refreshToken: java.lang.String = null,
    responseMode: KeycloakResponseMode = null,
    timeSkew: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    useNonce: js.UndefOr[scala.Boolean] = js.undefined
  ): KeycloakInitOptions = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (!js.isUndefined(checkLoginIframe)) __obj.updateDynamic("checkLoginIframe")(checkLoginIframe)
    if (checkLoginIframeInterval != null) __obj.updateDynamic("checkLoginIframeInterval")(checkLoginIframeInterval.asInstanceOf[js.Any])
    if (flow != null) __obj.updateDynamic("flow")(flow)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode)
    if (timeSkew != null) __obj.updateDynamic("timeSkew")(timeSkew.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (!js.isUndefined(useNonce)) __obj.updateDynamic("useNonce")(useNonce)
    __obj.asInstanceOf[KeycloakInitOptions]
  }
}

