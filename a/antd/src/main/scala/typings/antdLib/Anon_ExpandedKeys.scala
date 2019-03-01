package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpandedKeys extends js.Object {
  var expandedKeys: js.UndefOr[js.Array[java.lang.String]]
  var selectedKeys: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_ExpandedKeys {
  @scala.inline
  def apply(
    expandedKeys: js.Array[java.lang.String] = null,
    selectedKeys: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ExpandedKeys = {
    val __obj = js.Dynamic.literal()
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys)
    if (!js.isUndefined(selectedKeys)) __obj.updateDynamic("selectedKeys")(selectedKeys)
    __obj.asInstanceOf[Anon_ExpandedKeys]
  }
}

