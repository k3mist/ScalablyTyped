package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpandedKeysSelectedKeys extends js.Object {
  var expandedKeys: js.UndefOr[scala.Nothing] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[java.lang.String]]
}

object Anon_ExpandedKeysSelectedKeys {
  @scala.inline
  def apply(
    expandedKeys: js.UndefOr[scala.Nothing] = js.undefined,
    selectedKeys: js.Array[java.lang.String] = null
  ): Anon_ExpandedKeysSelectedKeys = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandedKeys)) __obj.updateDynamic("expandedKeys")(expandedKeys)
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys)
    __obj.asInstanceOf[Anon_ExpandedKeysSelectedKeys]
  }
}

