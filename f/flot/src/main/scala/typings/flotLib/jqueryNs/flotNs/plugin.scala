package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plugin extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  def init(options: plotOptions): js.Any
}

object plugin {
  @scala.inline
  def apply(
    init: js.Function1[plotOptions, js.Any],
    name: java.lang.String = null,
    options: js.Any = null,
    version: java.lang.String = null
  ): plugin = {
    val __obj = js.Dynamic.literal(init = init)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[plugin]
  }
}

