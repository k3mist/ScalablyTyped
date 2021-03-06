package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IaddCard extends BaseParams {
  var cardList: js.Array[jweixinLib.Anon_CardExt]
   // 需要添加的卡券列表
  @JSName("success")
  def success_MIaddCard(res: jweixinLib.Anon_CardList): scala.Unit
}

object IaddCard {
  @scala.inline
  def apply(
    cardList: js.Array[jweixinLib.Anon_CardExt],
    success: jweixinLib.Anon_CardList => scala.Unit,
    complete: /* repeated */ js.Any => scala.Unit = null,
    fail: /* repeated */ js.Any => scala.Unit = null
  ): IaddCard = {
    val __obj = js.Dynamic.literal(cardList = cardList, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IaddCard]
  }
}

