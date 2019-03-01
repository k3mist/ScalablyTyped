package typings
package convictLib.convictMod.convictNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var coerce: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[js.Function1[/* val */ js.Any, scala.Unit]] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    coerce: js.Function1[/* val */ js.Any, _] = null,
    name: java.lang.String = null,
    validate: js.Function1[/* val */ js.Any, scala.Unit] = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (coerce != null) __obj.updateDynamic("coerce")(coerce)
    if (name != null) __obj.updateDynamic("name")(name)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Format]
  }
}

