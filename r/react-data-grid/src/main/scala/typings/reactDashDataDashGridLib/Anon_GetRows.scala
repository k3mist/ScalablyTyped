package typings
package reactDashDataDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetRows extends js.Object {
  def getRows(state: js.Object): js.Array[js.Object]
  def getSelectedRowsByKey(state: js.Object): js.Array[js.Object]
}

object Anon_GetRows {
  @scala.inline
  def apply(
    getRows: js.Function1[js.Object, js.Array[js.Object]],
    getSelectedRowsByKey: js.Function1[js.Object, js.Array[js.Object]]
  ): Anon_GetRows = {
    val __obj = js.Dynamic.literal(getRows = getRows, getSelectedRowsByKey = getSelectedRowsByKey)
  
    __obj.asInstanceOf[Anon_GetRows]
  }
}

