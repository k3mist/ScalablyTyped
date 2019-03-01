package typings
package gapiDotAuth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apppackagename extends js.Object {
  /**
    * The package name of the Android app to install over the air. See
    * <a href="https://developers.google.com/identity/sign-in/web/android-app-installs">Android app installs from your web site</a>.
    * Optional. (default: none)
    */
  var app_package_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the button in pixels (default: 36).
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Display long labels such as "Sign in with Google" rather than "Sign in" (default: false).
    */
  var longtitle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The callback function to call when sign-in fails (default: none).
    */
  var onfailure: js.UndefOr[js.Function1[/* reason */ Anon_Error, scala.Unit]] = js.undefined
  /**
    * The callback function to call when a user successfully signs in (default: none).
    */
  var onsuccess: js.UndefOr[js.Function1[/* user */ gapiDotAuth2Lib.gapiNs.auth2Ns.GoogleUser, scala.Unit]] = js.undefined
  /**
    * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color theme of the button: either light or dark (default: light).
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the button in pixels (default: 120).
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Apppackagename {
  @scala.inline
  def apply(
    app_package_name: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    longtitle: js.UndefOr[scala.Boolean] = js.undefined,
    onfailure: js.Function1[/* reason */ Anon_Error, scala.Unit] = null,
    onsuccess: js.Function1[/* user */ gapiDotAuth2Lib.gapiNs.auth2Ns.GoogleUser, scala.Unit] = null,
    scope: java.lang.String = null,
    theme: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Anon_Apppackagename = {
    val __obj = js.Dynamic.literal()
    if (app_package_name != null) __obj.updateDynamic("app_package_name")(app_package_name)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(longtitle)) __obj.updateDynamic("longtitle")(longtitle)
    if (onfailure != null) __obj.updateDynamic("onfailure")(onfailure)
    if (onsuccess != null) __obj.updateDynamic("onsuccess")(onsuccess)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Apppackagename]
  }
}

