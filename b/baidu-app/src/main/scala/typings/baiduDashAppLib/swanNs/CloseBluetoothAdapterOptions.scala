package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MCloseBluetoothAdapterOptions(res: js.Any): scala.Unit
}

object CloseBluetoothAdapterOptions {
  @scala.inline
  def apply(
    success: js.Any => scala.Unit,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null
  ): CloseBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[CloseBluetoothAdapterOptions]
  }
}

