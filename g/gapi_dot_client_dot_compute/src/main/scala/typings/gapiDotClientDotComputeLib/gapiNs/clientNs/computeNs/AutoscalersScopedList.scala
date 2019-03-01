package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalersScopedList extends js.Object {
  /** [Output Only] List of autoscalers contained in this scope. */
  var autoscalers: js.UndefOr[js.Array[Autoscaler]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of autoscalers when the list is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object AutoscalersScopedList {
  @scala.inline
  def apply(autoscalers: js.Array[Autoscaler] = null, warning: gapiDotClientDotComputeLib.Anon_Code = null): AutoscalersScopedList = {
    val __obj = js.Dynamic.literal()
    if (autoscalers != null) __obj.updateDynamic("autoscalers")(autoscalers)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[AutoscalersScopedList]
  }
}

