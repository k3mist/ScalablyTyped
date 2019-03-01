package typings
package reactDashNativeDashGobyLib.reactDashNativeDashGobyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDialog extends js.Object {
  /**
    * Indicates whether you would like to append the description of an available release to the
    * notification message which is displayed to the end user. Defaults to false.
    */
  var appendReleaseDescription: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates the string you would like to prefix the release description with, if any, when
    * displaying the update notification to the end user. Defaults to " Description: "
    */
  var descriptionPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to use for the button the end user must press in order to install a mandatory update. Defaults to "Continue".
    */
  var mandatoryContinueButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text used as the body of an update notification, when the update is specified as mandatory.
    * Defaults to "An update is available that must be installed.".
    */
  var mandatoryUpdateMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to use for the button the end user can press in order to ignore an optional update that is available. Defaults to "Ignore".
    */
  var optionalIgnoreButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to use for the button the end user can press in order to install an optional update. Defaults to "Install".
    */
  var optionalInstallButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text used as the body of an update notification, when the update is optional. Defaults to "An update is available. Would you like to install it?".
    */
  var optionalUpdateMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text used as the header of an update notification that is displayed to the end user. Defaults to "Update available".
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateDialog {
  @scala.inline
  def apply(
    appendReleaseDescription: js.UndefOr[scala.Boolean] = js.undefined,
    descriptionPrefix: java.lang.String = null,
    mandatoryContinueButtonLabel: java.lang.String = null,
    mandatoryUpdateMessage: java.lang.String = null,
    optionalIgnoreButtonLabel: java.lang.String = null,
    optionalInstallButtonLabel: java.lang.String = null,
    optionalUpdateMessage: java.lang.String = null,
    title: java.lang.String = null
  ): UpdateDialog = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendReleaseDescription)) __obj.updateDynamic("appendReleaseDescription")(appendReleaseDescription)
    if (descriptionPrefix != null) __obj.updateDynamic("descriptionPrefix")(descriptionPrefix)
    if (mandatoryContinueButtonLabel != null) __obj.updateDynamic("mandatoryContinueButtonLabel")(mandatoryContinueButtonLabel)
    if (mandatoryUpdateMessage != null) __obj.updateDynamic("mandatoryUpdateMessage")(mandatoryUpdateMessage)
    if (optionalIgnoreButtonLabel != null) __obj.updateDynamic("optionalIgnoreButtonLabel")(optionalIgnoreButtonLabel)
    if (optionalInstallButtonLabel != null) __obj.updateDynamic("optionalInstallButtonLabel")(optionalInstallButtonLabel)
    if (optionalUpdateMessage != null) __obj.updateDynamic("optionalUpdateMessage")(optionalUpdateMessage)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UpdateDialog]
  }
}

