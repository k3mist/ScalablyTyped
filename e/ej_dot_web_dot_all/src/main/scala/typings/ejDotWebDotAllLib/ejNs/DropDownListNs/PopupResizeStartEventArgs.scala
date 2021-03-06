package typings
package ejDotWebDotAllLib.ejNs.DropDownListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupResizeStartEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data from the resizable plugin.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the DropDownList model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PopupResizeStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    event: js.Any = null,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): PopupResizeStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PopupResizeStartEventArgs]
  }
}

