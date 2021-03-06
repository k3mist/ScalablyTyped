package typings
package electronLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  @JSName("createElement")
  def createElement_webview(tagName: electronLib.electronLibStrings.webview): electronLib.ElectronNs.WebviewTag
}

object Document {
  @scala.inline
  def apply(createElement_webview: electronLib.electronLibStrings.webview => electronLib.ElectronNs.WebviewTag): Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createElement")(js.Any.fromFunction1(createElement_webview))
    __obj.asInstanceOf[Document]
  }
}

