package typings
package activexDashMsformsLib.MSFormsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPage_Scroll_Parameter extends js.Object {
  val ActionX: activexDashMsformsLib.MSFormsNs.fmScrollAction
  val ActionY: activexDashMsformsLib.MSFormsNs.fmScrollAction
  val ActualDx: activexDashMsformsLib.MSFormsNs.ReturnSingle
  val ActualDy: activexDashMsformsLib.MSFormsNs.ReturnSingle
  val Index: scala.Double
  val RequestDx: scala.Double
  val RequestDy: scala.Double
}

object MultiPage_Scroll_Parameter {
  @scala.inline
  def apply(
    ActionX: activexDashMsformsLib.MSFormsNs.fmScrollAction,
    ActionY: activexDashMsformsLib.MSFormsNs.fmScrollAction,
    ActualDx: activexDashMsformsLib.MSFormsNs.ReturnSingle,
    ActualDy: activexDashMsformsLib.MSFormsNs.ReturnSingle,
    Index: scala.Double,
    RequestDx: scala.Double,
    RequestDy: scala.Double
  ): MultiPage_Scroll_Parameter = {
    val __obj = js.Dynamic.literal(ActionX = ActionX, ActionY = ActionY, ActualDx = ActualDx, ActualDy = ActualDy, Index = Index, RequestDx = RequestDx, RequestDy = RequestDy)
  
    __obj.asInstanceOf[MultiPage_Scroll_Parameter]
  }
}

