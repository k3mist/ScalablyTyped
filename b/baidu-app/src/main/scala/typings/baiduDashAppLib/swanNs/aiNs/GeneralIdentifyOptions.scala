package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 通用物体及场景识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图片中的多个物体及场景标签。
		 */
trait GeneralIdentifyOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
  var image: java.lang.String
   // 图像资源地址
  @JSName("success")
  var success_GeneralIdentifyOptions: js.UndefOr[js.Function1[/* res */ GeneralIdentifyResponse, scala.Unit]] = js.undefined
}

object GeneralIdentifyOptions {
  @scala.inline
  def apply(
    image: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ GeneralIdentifyResponse, scala.Unit] = null
  ): GeneralIdentifyOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[GeneralIdentifyOptions]
  }
}

