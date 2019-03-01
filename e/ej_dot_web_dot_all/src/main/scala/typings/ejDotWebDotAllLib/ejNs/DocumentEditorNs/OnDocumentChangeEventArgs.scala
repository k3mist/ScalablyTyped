package typings
package ejDotWebDotAllLib.ejNs.DocumentEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDocumentChangeEventArgs extends js.Object {
  /** True, if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the document editor model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object OnDocumentChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): OnDocumentChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OnDocumentChangeEventArgs]
  }
}

