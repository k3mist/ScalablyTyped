package typings
package winrtLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageDialog extends js.Object {
  var cancelCommandIndex: scala.Double
  var commands: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IUICommand]
  var content: java.lang.String
  var defaultCommandIndex: scala.Double
  var options: MessageDialogOptions
  var title: java.lang.String
  def showAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IUICommand]
}

object IMessageDialog {
  @scala.inline
  def apply(
    cancelCommandIndex: scala.Double,
    commands: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IUICommand],
    content: java.lang.String,
    defaultCommandIndex: scala.Double,
    options: MessageDialogOptions,
    showAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IUICommand]],
    title: java.lang.String
  ): IMessageDialog = {
    val __obj = js.Dynamic.literal(cancelCommandIndex = cancelCommandIndex, commands = commands, content = content, defaultCommandIndex = defaultCommandIndex, options = options, showAsync = showAsync, title = title)
  
    __obj.asInstanceOf[IMessageDialog]
  }
}

