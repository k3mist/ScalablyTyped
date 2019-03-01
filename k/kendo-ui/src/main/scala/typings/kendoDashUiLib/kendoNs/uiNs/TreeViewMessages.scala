package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewMessages extends js.Object {
  var loading: js.UndefOr[java.lang.String] = js.undefined
  var requestFailed: js.UndefOr[java.lang.String] = js.undefined
  var retry: js.UndefOr[java.lang.String] = js.undefined
}

object TreeViewMessages {
  @scala.inline
  def apply(
    loading: java.lang.String = null,
    requestFailed: java.lang.String = null,
    retry: java.lang.String = null
  ): TreeViewMessages = {
    val __obj = js.Dynamic.literal()
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (requestFailed != null) __obj.updateDynamic("requestFailed")(requestFailed)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    __obj.asInstanceOf[TreeViewMessages]
  }
}

