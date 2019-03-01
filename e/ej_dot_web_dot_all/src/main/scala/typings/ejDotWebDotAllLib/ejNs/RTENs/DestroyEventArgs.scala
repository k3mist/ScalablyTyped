package typings
package ejDotWebDotAllLib.ejNs.RTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyEventArgs extends js.Object {
  /** When the event is canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the RTE model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DestroyEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): DestroyEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DestroyEventArgs]
  }
}

