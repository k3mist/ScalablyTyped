package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexKeyParent[K] extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[K] = js.undefined
  var parent: js.UndefOr[stdLib.Element] = js.undefined
}

object Anon_IndexKeyParent {
  @scala.inline
  def apply[K](index: scala.Int | scala.Double = null, key: K = null, parent: stdLib.Element = null): Anon_IndexKeyParent[K] = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_IndexKeyParent[K]]
  }
}

