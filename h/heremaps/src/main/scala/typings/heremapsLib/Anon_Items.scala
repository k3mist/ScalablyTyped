package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var next: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Items {
  @scala.inline
  def apply(items: js.Array[_] = null, next: java.lang.String = null): Anon_Items = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_Items]
  }
}

