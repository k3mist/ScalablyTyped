package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIntersectionObserverOptions extends js.Object {
  /**
    * 初始的相交比例
    */
  var initialRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * 是否同时观测多个参照节点（而非一个）
    */
  var selectAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 所有阈值
    */
  var thresholds: js.UndefOr[js.Array[_]] = js.undefined
}

object CreateIntersectionObserverOptions {
  @scala.inline
  def apply(
    initialRatio: scala.Int | scala.Double = null,
    selectAll: js.UndefOr[scala.Boolean] = js.undefined,
    thresholds: js.Array[_] = null
  ): CreateIntersectionObserverOptions = {
    val __obj = js.Dynamic.literal()
    if (initialRatio != null) __obj.updateDynamic("initialRatio")(initialRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAll)) __obj.updateDynamic("selectAll")(selectAll)
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds)
    __obj.asInstanceOf[CreateIntersectionObserverOptions]
  }
}

