package typings
package senecaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  // Print options. Best used via --seneca.print.options.
  var options: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply(options: js.UndefOr[scala.Boolean] = js.undefined): Anon_Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Options]
  }
}

