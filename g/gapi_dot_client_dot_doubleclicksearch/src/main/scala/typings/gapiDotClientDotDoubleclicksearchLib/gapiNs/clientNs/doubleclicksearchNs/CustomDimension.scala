package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimension extends js.Object {
  /** Custom dimension name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Custom dimension value. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CustomDimension {
  @scala.inline
  def apply(name: java.lang.String = null, value: java.lang.String = null): CustomDimension = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomDimension]
  }
}

