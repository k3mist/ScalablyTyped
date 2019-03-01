package typings
package xrmLib.XrmNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmStrings extends js.Object {
  /**
    * (Optional) The cancel button label. If you do not specify the cancel button label, Cancel is used as the button label.
    */
  var cancelButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Optional) The confirm button label.If you do not specify the button label, OK is used as the button label.
    */
  var confirmButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Optional) The subtitle to be displayed in the confirmation dialog.
    */
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The message to be displyed in the alert dialog.
    */
  var text: java.lang.String
  /**
    * (Optional) The title to be displyed in the confirmation dialog.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ConfirmStrings {
  @scala.inline
  def apply(
    text: java.lang.String,
    cancelButtonLabel: java.lang.String = null,
    confirmButtonLabel: java.lang.String = null,
    subtitle: java.lang.String = null,
    title: java.lang.String = null
  ): ConfirmStrings = {
    val __obj = js.Dynamic.literal(text = text)
    if (cancelButtonLabel != null) __obj.updateDynamic("cancelButtonLabel")(cancelButtonLabel)
    if (confirmButtonLabel != null) __obj.updateDynamic("confirmButtonLabel")(confirmButtonLabel)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ConfirmStrings]
  }
}

