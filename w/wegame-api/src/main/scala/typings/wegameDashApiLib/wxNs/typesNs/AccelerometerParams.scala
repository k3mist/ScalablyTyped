package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var interval: wegameDashApiLib.wegameDashApiLibStrings.game | wegameDashApiLib.wegameDashApiLibStrings.ui | wegameDashApiLib.wegameDashApiLibStrings.normal
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object AccelerometerParams {
  @scala.inline
  def apply(
    interval: wegameDashApiLib.wegameDashApiLibStrings.game | wegameDashApiLib.wegameDashApiLibStrings.ui | wegameDashApiLib.wegameDashApiLibStrings.normal,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    success: () => scala.Unit = null
  ): AccelerometerParams = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AccelerometerParams]
  }
}

