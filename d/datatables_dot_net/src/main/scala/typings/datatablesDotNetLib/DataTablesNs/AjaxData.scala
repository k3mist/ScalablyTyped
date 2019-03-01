package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxData extends js.Object {
  var data: js.Any
  var draw: js.UndefOr[scala.Double] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var recordsFiltered: js.UndefOr[scala.Double] = js.undefined
  var recordsTotal: js.UndefOr[scala.Double] = js.undefined
}

object AjaxData {
  @scala.inline
  def apply(
    data: js.Any,
    draw: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    recordsFiltered: scala.Int | scala.Double = null,
    recordsTotal: scala.Int | scala.Double = null
  ): AjaxData = {
    val __obj = js.Dynamic.literal(data = data)
    if (draw != null) __obj.updateDynamic("draw")(draw.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (recordsFiltered != null) __obj.updateDynamic("recordsFiltered")(recordsFiltered.asInstanceOf[js.Any])
    if (recordsTotal != null) __obj.updateDynamic("recordsTotal")(recordsTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxData]
  }
}

