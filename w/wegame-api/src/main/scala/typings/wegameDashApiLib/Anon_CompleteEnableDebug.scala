package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteEnableDebug extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var enableDebug: scala.Boolean
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_CompleteEnableDebug {
  @scala.inline
  def apply(
    enableDebug: scala.Boolean,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): Anon_CompleteEnableDebug = {
    val __obj = js.Dynamic.literal(enableDebug = enableDebug)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteEnableDebug]
  }
}

