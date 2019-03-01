package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidInfo extends js.Object {
  /** Link to open on Android if the app is not installed. */
  var androidFallbackLink: js.UndefOr[java.lang.String] = js.undefined
  /** If specified, this overrides the ‘link’ parameter on Android. */
  var androidLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Minimum version code for the Android app. If the installed app’s version
    * code is lower, then the user is taken to the Play Store.
    */
  var androidMinPackageVersionCode: js.UndefOr[java.lang.String] = js.undefined
  /** Android package name of the app. */
  var androidPackageName: js.UndefOr[java.lang.String] = js.undefined
}

object AndroidInfo {
  @scala.inline
  def apply(
    androidFallbackLink: java.lang.String = null,
    androidLink: java.lang.String = null,
    androidMinPackageVersionCode: java.lang.String = null,
    androidPackageName: java.lang.String = null
  ): AndroidInfo = {
    val __obj = js.Dynamic.literal()
    if (androidFallbackLink != null) __obj.updateDynamic("androidFallbackLink")(androidFallbackLink)
    if (androidLink != null) __obj.updateDynamic("androidLink")(androidLink)
    if (androidMinPackageVersionCode != null) __obj.updateDynamic("androidMinPackageVersionCode")(androidMinPackageVersionCode)
    if (androidPackageName != null) __obj.updateDynamic("androidPackageName")(androidPackageName)
    __obj.asInstanceOf[AndroidInfo]
  }
}

