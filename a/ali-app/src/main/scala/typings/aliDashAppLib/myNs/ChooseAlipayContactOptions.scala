package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseAlipayContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 单次最多选择联系人个数，默认 1，最大 10 */
  var count: scala.Double
  /**
  		 * 10	没有权限
  		 * 11	用户取消操作(或设备未授权使用通讯录)
  		 */
  @JSName("fail")
  var fail_ChooseAlipayContactOptions: js.UndefOr[
    js.Function1[
      /* error */ aliDashAppLib.aliDashAppLibNumbers.`10` | aliDashAppLib.aliDashAppLibNumbers.`11`, 
      scala.Unit
    ]
  ] = js.undefined
  @JSName("success")
  def success_MChooseAlipayContactOptions(result: aliDashAppLib.Anon_Avatar): scala.Unit
}

object ChooseAlipayContactOptions {
  @scala.inline
  def apply(
    count: scala.Double,
    success: js.Function1[aliDashAppLib.Anon_Avatar, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[
      /* error */ aliDashAppLib.aliDashAppLibNumbers.`10` | aliDashAppLib.aliDashAppLibNumbers.`11`, 
      scala.Unit
    ] = null
  ): ChooseAlipayContactOptions = {
    val __obj = js.Dynamic.literal(count = count, success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[ChooseAlipayContactOptions]
  }
}

