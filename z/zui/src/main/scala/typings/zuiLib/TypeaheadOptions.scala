package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadOptions extends js.Object {
  var highlighter: js.UndefOr[js.Function1[/* item */ js.Any, java.lang.String]] = js.undefined
  var items: js.UndefOr[scala.Double] = js.undefined
  var matcher: js.UndefOr[js.Function1[/* item */ js.Any, scala.Boolean]] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[_], js.Array[_]]] = js.undefined
  var source: js.UndefOr[js.Any] = js.undefined
  var updater: js.UndefOr[js.Function1[/* item */ js.Any, _]] = js.undefined
}

object TypeaheadOptions {
  @scala.inline
  def apply(
    highlighter: js.Function1[/* item */ js.Any, java.lang.String] = null,
    items: scala.Int | scala.Double = null,
    matcher: js.Function1[/* item */ js.Any, scala.Boolean] = null,
    minLength: scala.Int | scala.Double = null,
    sorter: js.Function1[/* items */ js.Array[_], js.Array[_]] = null,
    source: js.Any = null,
    updater: js.Function1[/* item */ js.Any, _] = null
  ): TypeaheadOptions = {
    val __obj = js.Dynamic.literal()
    if (highlighter != null) __obj.updateDynamic("highlighter")(highlighter)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter)
    if (source != null) __obj.updateDynamic("source")(source)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    __obj.asInstanceOf[TypeaheadOptions]
  }
}

