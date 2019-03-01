package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relyingparty extends js.Object {
  /** whether or not to install the android app on the device where the link is opened */
  var androidInstallApp: js.UndefOr[scala.Boolean] = js.undefined
  /** minimum version of the app. if the version on the device is lower than this version then the user is taken to the play store to upgrade the app */
  var androidMinimumVersion: js.UndefOr[java.lang.String] = js.undefined
  /** android package name of the android app to handle the action code */
  var androidPackageName: js.UndefOr[java.lang.String] = js.undefined
  /** whether or not the app can handle the oob code without first going to web */
  var canHandleCodeInApp: js.UndefOr[scala.Boolean] = js.undefined
  /** The recaptcha response from the user. */
  var captchaResp: js.UndefOr[java.lang.String] = js.undefined
  /** The recaptcha challenge presented to the user. */
  var challenge: js.UndefOr[java.lang.String] = js.undefined
  /** The url to continue to the Gitkit app */
  var continueUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** iOS app store id to download the app if it's not already installed */
  var iOSAppStoreId: js.UndefOr[java.lang.String] = js.undefined
  /** the iOS bundle id of iOS app to handle the action code */
  var iOSBundleId: js.UndefOr[java.lang.String] = js.undefined
  /** The user's Gitkit login token for email change. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** The fixed string "identitytoolkit#relyingparty". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The new email if the code is for email change. */
  var newEmail: js.UndefOr[java.lang.String] = js.undefined
  /** The request type. */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** The IP address of the user. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Relyingparty {
  @scala.inline
  def apply(
    androidInstallApp: js.UndefOr[scala.Boolean] = js.undefined,
    androidMinimumVersion: java.lang.String = null,
    androidPackageName: java.lang.String = null,
    canHandleCodeInApp: js.UndefOr[scala.Boolean] = js.undefined,
    captchaResp: java.lang.String = null,
    challenge: java.lang.String = null,
    continueUrl: java.lang.String = null,
    email: java.lang.String = null,
    iOSAppStoreId: java.lang.String = null,
    iOSBundleId: java.lang.String = null,
    idToken: java.lang.String = null,
    kind: java.lang.String = null,
    newEmail: java.lang.String = null,
    requestType: java.lang.String = null,
    userIp: java.lang.String = null
  ): Relyingparty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(androidInstallApp)) __obj.updateDynamic("androidInstallApp")(androidInstallApp)
    if (androidMinimumVersion != null) __obj.updateDynamic("androidMinimumVersion")(androidMinimumVersion)
    if (androidPackageName != null) __obj.updateDynamic("androidPackageName")(androidPackageName)
    if (!js.isUndefined(canHandleCodeInApp)) __obj.updateDynamic("canHandleCodeInApp")(canHandleCodeInApp)
    if (captchaResp != null) __obj.updateDynamic("captchaResp")(captchaResp)
    if (challenge != null) __obj.updateDynamic("challenge")(challenge)
    if (continueUrl != null) __obj.updateDynamic("continueUrl")(continueUrl)
    if (email != null) __obj.updateDynamic("email")(email)
    if (iOSAppStoreId != null) __obj.updateDynamic("iOSAppStoreId")(iOSAppStoreId)
    if (iOSBundleId != null) __obj.updateDynamic("iOSBundleId")(iOSBundleId)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (newEmail != null) __obj.updateDynamic("newEmail")(newEmail)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Relyingparty]
  }
}

