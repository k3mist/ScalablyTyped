package typings
package ssriLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply(options: js.Array[java.lang.String] = null, strict: js.UndefOr[scala.Boolean] = js.undefined): Anon_Options = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_Options]
  }
}

