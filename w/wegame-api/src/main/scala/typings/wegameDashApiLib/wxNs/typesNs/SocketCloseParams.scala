package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketCloseParams extends js.Object {
  /**
    * 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。如果这个参数没有被指定，默认的取值是1000 （表示正常连接关闭）
    */
  var code: js.UndefOr[scala.Double] = js.undefined
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 一个可读的字符串，表示连接被关闭的原因。这个字符串必须是不长于123字节的UTF-8 文本（不是字符）
    */
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object SocketCloseParams {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    reason: java.lang.String = null,
    success: js.Function0[scala.Unit] = null
  ): SocketCloseParams = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SocketCloseParams]
  }
}

