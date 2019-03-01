package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyGetProjectConfigResponse extends js.Object {
  /** Whether to allow password user sign in or sign up. */
  var allowPasswordUser: js.UndefOr[scala.Boolean] = js.undefined
  /** Browser API key, needed when making http request to Apiary. */
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  /** Authorized domains. */
  var authorizedDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Change email template. */
  var changeEmailTemplate: js.UndefOr[EmailTemplate] = js.undefined
  var dynamicLinksDomain: js.UndefOr[java.lang.String] = js.undefined
  /** Whether anonymous user is enabled. */
  var enableAnonymousUser: js.UndefOr[scala.Boolean] = js.undefined
  /** OAuth2 provider configuration. */
  var idpConfig: js.UndefOr[js.Array[IdpConfig]] = js.undefined
  /** Legacy reset password email template. */
  var legacyResetPasswordTemplate: js.UndefOr[EmailTemplate] = js.undefined
  /** Project ID of the relying party. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** Reset password email template. */
  var resetPasswordTemplate: js.UndefOr[EmailTemplate] = js.undefined
  /** Whether to use email sending provided by Firebear. */
  var useEmailSending: js.UndefOr[scala.Boolean] = js.undefined
  /** Verify email template. */
  var verifyEmailTemplate: js.UndefOr[EmailTemplate] = js.undefined
}

object IdentitytoolkitRelyingpartyGetProjectConfigResponse {
  @scala.inline
  def apply(
    allowPasswordUser: js.UndefOr[scala.Boolean] = js.undefined,
    apiKey: java.lang.String = null,
    authorizedDomains: js.Array[java.lang.String] = null,
    changeEmailTemplate: EmailTemplate = null,
    dynamicLinksDomain: java.lang.String = null,
    enableAnonymousUser: js.UndefOr[scala.Boolean] = js.undefined,
    idpConfig: js.Array[IdpConfig] = null,
    legacyResetPasswordTemplate: EmailTemplate = null,
    projectId: java.lang.String = null,
    resetPasswordTemplate: EmailTemplate = null,
    useEmailSending: js.UndefOr[scala.Boolean] = js.undefined,
    verifyEmailTemplate: EmailTemplate = null
  ): IdentitytoolkitRelyingpartyGetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPasswordUser)) __obj.updateDynamic("allowPasswordUser")(allowPasswordUser)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (authorizedDomains != null) __obj.updateDynamic("authorizedDomains")(authorizedDomains)
    if (changeEmailTemplate != null) __obj.updateDynamic("changeEmailTemplate")(changeEmailTemplate)
    if (dynamicLinksDomain != null) __obj.updateDynamic("dynamicLinksDomain")(dynamicLinksDomain)
    if (!js.isUndefined(enableAnonymousUser)) __obj.updateDynamic("enableAnonymousUser")(enableAnonymousUser)
    if (idpConfig != null) __obj.updateDynamic("idpConfig")(idpConfig)
    if (legacyResetPasswordTemplate != null) __obj.updateDynamic("legacyResetPasswordTemplate")(legacyResetPasswordTemplate)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (resetPasswordTemplate != null) __obj.updateDynamic("resetPasswordTemplate")(resetPasswordTemplate)
    if (!js.isUndefined(useEmailSending)) __obj.updateDynamic("useEmailSending")(useEmailSending)
    if (verifyEmailTemplate != null) __obj.updateDynamic("verifyEmailTemplate")(verifyEmailTemplate)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  }
}

