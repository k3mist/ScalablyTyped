package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreRoot extends js.Object {
  var ignoreRoot: js.UndefOr[scala.Boolean] = js.undefined
  var renderUIElements: js.UndefOr[scala.Boolean] = js.undefined
  var sameSelectionCharacters: js.UndefOr[scala.Boolean] = js.undefined
  var showAttributeElementId: js.UndefOr[scala.Boolean] = js.undefined
  var showPriority: js.UndefOr[scala.Boolean] = js.undefined
  var showType: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IgnoreRoot {
  @scala.inline
  def apply(
    ignoreRoot: js.UndefOr[scala.Boolean] = js.undefined,
    renderUIElements: js.UndefOr[scala.Boolean] = js.undefined,
    sameSelectionCharacters: js.UndefOr[scala.Boolean] = js.undefined,
    showAttributeElementId: js.UndefOr[scala.Boolean] = js.undefined,
    showPriority: js.UndefOr[scala.Boolean] = js.undefined,
    showType: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IgnoreRoot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreRoot)) __obj.updateDynamic("ignoreRoot")(ignoreRoot)
    if (!js.isUndefined(renderUIElements)) __obj.updateDynamic("renderUIElements")(renderUIElements)
    if (!js.isUndefined(sameSelectionCharacters)) __obj.updateDynamic("sameSelectionCharacters")(sameSelectionCharacters)
    if (!js.isUndefined(showAttributeElementId)) __obj.updateDynamic("showAttributeElementId")(showAttributeElementId)
    if (!js.isUndefined(showPriority)) __obj.updateDynamic("showPriority")(showPriority)
    if (!js.isUndefined(showType)) __obj.updateDynamic("showType")(showType)
    __obj.asInstanceOf[Anon_IgnoreRoot]
  }
}

