package typings
package resolveDashOptionsLib.resolveDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigItem extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var `type`: java.lang.String | js.Array[java.lang.String]
}

object ConfigItem {
  @scala.inline
  def apply(`type`: java.lang.String | js.Array[java.lang.String], default: js.Any = null): ConfigItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[ConfigItem]
  }
}

