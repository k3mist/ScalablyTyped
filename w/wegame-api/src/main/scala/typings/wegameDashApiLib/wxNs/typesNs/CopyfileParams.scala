package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var destPath: java.lang.String
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  var srcPath: java.lang.String
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object CopyfileParams {
  @scala.inline
  def apply(
    destPath: java.lang.String,
    srcPath: java.lang.String,
    complete: () => scala.Unit = null,
    fail: /* res */ wegameDashApiLib.Anon_ErrMsg => scala.Unit = null,
    success: () => scala.Unit = null
  ): CopyfileParams = {
    val __obj = js.Dynamic.literal(destPath = destPath, srcPath = srcPath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[CopyfileParams]
  }
}

