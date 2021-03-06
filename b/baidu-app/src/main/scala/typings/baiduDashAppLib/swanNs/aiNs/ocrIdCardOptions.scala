package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用户向服务请求识别身份证，身份证识别包括正面和背面。
		 */
trait ocrIdCardOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
   // 图片资源地址
  var detect_direction: js.UndefOr[scala.Boolean] = js.undefined
   // front：身份证含照片的一面；back：身份证带国徽的一面。
  var detect_risk: js.UndefOr[scala.Boolean] = js.undefined
   // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true; false: 不检测旋转角度，默认不检测。
  var id_card_side: js.UndefOr[java.lang.String] = js.undefined
  var image: java.lang.String
   // 是否开启身份证风险类型(身份证复印件、临时身份证、身份证翻拍、修改过的身份证)功能，默认不开启，即：false。可选值:true-开启；false-不开启。
  @JSName("success")
  var success_ocrIdCardOptions: js.UndefOr[js.Function1[/* res */ ocrIdCardResponse, scala.Unit]] = js.undefined
}

object ocrIdCardOptions {
  @scala.inline
  def apply(
    image: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    detect_direction: js.UndefOr[scala.Boolean] = js.undefined,
    detect_risk: js.UndefOr[scala.Boolean] = js.undefined,
    fail: js.Any => scala.Unit = null,
    id_card_side: java.lang.String = null,
    success: /* res */ ocrIdCardResponse => scala.Unit = null
  ): ocrIdCardOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(detect_direction)) __obj.updateDynamic("detect_direction")(detect_direction)
    if (!js.isUndefined(detect_risk)) __obj.updateDynamic("detect_risk")(detect_risk)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (id_card_side != null) __obj.updateDynamic("id_card_side")(id_card_side)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ocrIdCardOptions]
  }
}

