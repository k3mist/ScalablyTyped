package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var data: java.lang.String | stdLib.ArrayBuffer
  var encoding: js.UndefOr[FileContentEncoding] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  var filePath: java.lang.String
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object AppendfileParams {
  @scala.inline
  def apply(
    data: java.lang.String | stdLib.ArrayBuffer,
    filePath: java.lang.String,
    complete: () => scala.Unit = null,
    encoding: FileContentEncoding = null,
    fail: /* res */ wegameDashApiLib.Anon_ErrMsg => scala.Unit = null,
    success: () => scala.Unit = null
  ): AppendfileParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AppendfileParams]
  }
}

