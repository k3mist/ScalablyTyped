package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutUtils extends js.Object {
  def wrapAccessor(accessor: js.Any): js.Function
}

object KnockoutUtils {
  @scala.inline
  def apply(wrapAccessor: js.Function1[js.Any, js.Function]): KnockoutUtils = {
    val __obj = js.Dynamic.literal(wrapAccessor = wrapAccessor)
  
    __obj.asInstanceOf[KnockoutUtils]
  }
}

