package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplifiedSet extends js.Object {
  def has(el: js.Any): scala.Boolean
}

object SimplifiedSet {
  @scala.inline
  def apply(has: js.Function1[js.Any, scala.Boolean]): SimplifiedSet = {
    val __obj = js.Dynamic.literal(has = has)
  
    __obj.asInstanceOf[SimplifiedSet]
  }
}

