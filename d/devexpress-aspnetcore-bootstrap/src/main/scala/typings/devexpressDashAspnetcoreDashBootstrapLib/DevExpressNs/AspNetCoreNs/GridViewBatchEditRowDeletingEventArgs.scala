package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditRowDeletingEventArgs extends CancelEventArgs {
  val rowValues: js.Any
  val visibleIndex: scala.Double
}

object GridViewBatchEditRowDeletingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, rowValues: js.Any, sender: Control, visibleIndex: scala.Double): GridViewBatchEditRowDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, rowValues = rowValues, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewBatchEditRowDeletingEventArgs]
  }
}

