package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressMethods extends js.Object {
  var getProgress: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  var setProgress: js.UndefOr[js.Function1[/* progress */ scala.Double, this.type]] = js.undefined
}

object ProgressMethods {
  @scala.inline
  def apply(
    getProgress: () => scala.Double = null,
    setProgress: /* progress */ scala.Double => ProgressMethods = null
  ): ProgressMethods = {
    val __obj = js.Dynamic.literal()
    if (getProgress != null) __obj.updateDynamic("getProgress")(js.Any.fromFunction0(getProgress))
    if (setProgress != null) __obj.updateDynamic("setProgress")(js.Any.fromFunction1(setProgress))
    __obj.asInstanceOf[ProgressMethods]
  }
}

