package typings
package reactDashDataDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indexes extends js.Object {
  var indexes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var isSelectedKey: js.UndefOr[java.lang.String] = js.undefined
  var keys: js.UndefOr[Anon_RowKey] = js.undefined
}

object Anon_Indexes {
  @scala.inline
  def apply(
    indexes: js.Array[scala.Double] = null,
    isSelectedKey: java.lang.String = null,
    keys: Anon_RowKey = null
  ): Anon_Indexes = {
    val __obj = js.Dynamic.literal()
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (isSelectedKey != null) __obj.updateDynamic("isSelectedKey")(isSelectedKey)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    __obj.asInstanceOf[Anon_Indexes]
  }
}

