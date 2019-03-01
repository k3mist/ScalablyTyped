package typings
package typesafeDashActionsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box[T] extends js.Object {
  var v: T
}

object Box {
  @scala.inline
  def apply[T](v: T): Box[T] = {
    val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Box[T]]
  }
}

