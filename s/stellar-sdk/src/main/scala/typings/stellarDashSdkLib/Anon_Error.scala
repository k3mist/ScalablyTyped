package typings
package stellarDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error[T /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] */] extends js.Object {
  var onerror: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* record */ T, scala.Unit]] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply[T /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] */](
    onerror: /* error */ stdLib.Error => scala.Unit = null,
    onmessage: /* record */ T => scala.Unit = null
  ): Anon_Error[T] = {
    val __obj = js.Dynamic.literal()
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onmessage != null) __obj.updateDynamic("onmessage")(js.Any.fromFunction1(onmessage))
    __obj.asInstanceOf[Anon_Error[T]]
  }
}

