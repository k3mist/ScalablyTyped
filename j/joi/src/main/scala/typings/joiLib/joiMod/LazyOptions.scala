package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyOptions extends js.Object {
  /**
    * If true the schema generator will only be called once and the result will be cached.
    */
  var once: js.UndefOr[scala.Boolean] = js.undefined
}

object LazyOptions {
  @scala.inline
  def apply(once: js.UndefOr[scala.Boolean] = js.undefined): LazyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    __obj.asInstanceOf[LazyOptions]
  }
}

