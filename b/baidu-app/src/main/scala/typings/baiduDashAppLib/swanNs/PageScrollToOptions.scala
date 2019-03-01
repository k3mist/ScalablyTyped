package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region 位置API
trait PageScrollToOptions extends js.Object {
  /** 滚动动画的时长，默认300ms，单位 ms */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** 滚动到页面的目标位置（单位px */
  var scrollTop: scala.Double
}

object PageScrollToOptions {
  @scala.inline
  def apply(scrollTop: scala.Double, duration: scala.Int | scala.Double = null): PageScrollToOptions = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollToOptions]
  }
}

