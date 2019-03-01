package typings
package reactableLib.reactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrProperties[T] extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[T] = js.undefined
}

object TrProperties {
  @scala.inline
  def apply[T](className: java.lang.String = null, data: T = null): TrProperties[T] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrProperties[T]]
  }
}

