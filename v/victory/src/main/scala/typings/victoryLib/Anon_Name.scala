package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var symbol: js.UndefOr[Anon_Fill] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String = null, symbol: Anon_Fill = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[Anon_Name]
  }
}

