package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadReportEventArgs extends js.Object {
  /** returns whether the control is bound with OLAP or Relational data source.
    */
  var dataModel: js.UndefOr[java.lang.String] = js.undefined
  /** returns the PivotGrid object.
    */
  var targetControl: js.UndefOr[js.Any] = js.undefined
}

object LoadReportEventArgs {
  @scala.inline
  def apply(dataModel: java.lang.String = null, targetControl: js.Any = null): LoadReportEventArgs = {
    val __obj = js.Dynamic.literal()
    if (dataModel != null) __obj.updateDynamic("dataModel")(dataModel)
    if (targetControl != null) __obj.updateDynamic("targetControl")(targetControl)
    __obj.asInstanceOf[LoadReportEventArgs]
  }
}

