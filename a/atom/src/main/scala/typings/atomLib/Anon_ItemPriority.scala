package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemPriority[T] extends js.Object {
  var item: T
  var priority: js.UndefOr[scala.Double] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ItemPriority {
  @scala.inline
  def apply[T](
    item: T,
    priority: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ItemPriority[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Anon_ItemPriority[T]]
  }
}

