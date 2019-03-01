package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-credentialrequestoptions}
  */
trait CredentialRequestOptions extends js.Object {
  /**
    * If set, the user agent will request {@link FederatedCredential} objects
    * for the providers and protocol types listed. Defaults to {@code null}.
    */
  var federated: js.UndefOr[FederatedCredentialRequestOptions] = js.undefined
  /**
    * This property specifies the mediation requirements for a given credential
    * request.
    */
  var mediation: js.UndefOr[CredentialMediationRequirement] = js.undefined
  /**
    * If set, the user agent will request {@link PasswordCredential} objects.
    * Defaults to {@code false}.
    */
  var password: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This property specifies options for requesting a public-key signature.
    */
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.undefined
  /**
    * This property lets the developer abort an ongoing get() operation.
    */
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
  /**
    * If {@code true}, the user agent will only attempt to provide a Credential
    * without user interaction. Defaults to {@code false}.
    *
    * @deprecated Use {@link mediation} instead.
    */
  var unmediated: js.UndefOr[scala.Boolean] = js.undefined
}

object CredentialRequestOptions {
  @scala.inline
  def apply(
    federated: FederatedCredentialRequestOptions = null,
    mediation: CredentialMediationRequirement = null,
    password: js.UndefOr[scala.Boolean] = js.undefined,
    publicKey: PublicKeyCredentialRequestOptions = null,
    signal: stdLib.AbortSignal = null,
    unmediated: js.UndefOr[scala.Boolean] = js.undefined
  ): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (federated != null) __obj.updateDynamic("federated")(federated)
    if (mediation != null) __obj.updateDynamic("mediation")(mediation)
    if (!js.isUndefined(password)) __obj.updateDynamic("password")(password)
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (!js.isUndefined(unmediated)) __obj.updateDynamic("unmediated")(unmediated)
    __obj.asInstanceOf[CredentialRequestOptions]
  }
}

