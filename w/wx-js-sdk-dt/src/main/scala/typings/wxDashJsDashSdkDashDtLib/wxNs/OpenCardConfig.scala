package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 需要打开的卡券列表
  */
trait OpenCardConfig extends WxBaseRequestConfig {
  var cardList: js.Array[OpenCardObj]
}

object OpenCardConfig {
  @scala.inline
  def apply(
    cardList: js.Array[OpenCardObj],
    cancel: () => scala.Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => scala.Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => scala.Unit = null,
    success: /* res */ js.UndefOr[js.Any] => scala.Unit = null
  ): OpenCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenCardConfig]
  }
}

