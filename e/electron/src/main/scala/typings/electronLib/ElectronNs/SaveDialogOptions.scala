package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveDialogOptions extends js.Object {
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Absolute directory path, absolute file path, or file name to use by default.
    */
  var defaultPath: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[js.Array[FileFilter]] = js.undefined
  /**
    * Message to display above text fields.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom label for the text displayed in front of the filename text field.
    */
  var nameFieldLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Create a when packaged for the Mac App Store. If this option is enabled and the
    * file doesn't already exist a blank file will be created at the chosen path.
    */
  var securityScopedBookmarks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show the tags input box, defaults to true.
    */
  var showsTagField: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SaveDialogOptions {
  @scala.inline
  def apply(
    buttonLabel: java.lang.String = null,
    defaultPath: java.lang.String = null,
    filters: js.Array[FileFilter] = null,
    message: java.lang.String = null,
    nameFieldLabel: java.lang.String = null,
    securityScopedBookmarks: js.UndefOr[scala.Boolean] = js.undefined,
    showsTagField: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): SaveDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel)
    if (defaultPath != null) __obj.updateDynamic("defaultPath")(defaultPath)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (message != null) __obj.updateDynamic("message")(message)
    if (nameFieldLabel != null) __obj.updateDynamic("nameFieldLabel")(nameFieldLabel)
    if (!js.isUndefined(securityScopedBookmarks)) __obj.updateDynamic("securityScopedBookmarks")(securityScopedBookmarks)
    if (!js.isUndefined(showsTagField)) __obj.updateDynamic("showsTagField")(showsTagField)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SaveDialogOptions]
  }
}

