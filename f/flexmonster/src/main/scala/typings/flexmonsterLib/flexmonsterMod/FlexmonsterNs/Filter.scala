package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var measure: js.UndefOr[java.lang.String | MeasureObject] = js.undefined
  var members: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var query: js.UndefOr[NumberQuery | LabelQuery | DateQuery | TimeQuery | ValueQuery] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    exclude: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    measure: java.lang.String | MeasureObject = null,
    members: js.Array[java.lang.String] = null,
    query: NumberQuery | LabelQuery | DateQuery | TimeQuery | ValueQuery = null
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

