package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescableQuery[T] extends js.Object {
  def desc(): DescQuery[T]
}

object DescableQuery {
  @scala.inline
  def apply[T](desc: js.Function0[DescQuery[T]]): DescableQuery[T] = {
    val __obj = js.Dynamic.literal(desc = desc)
  
    __obj.asInstanceOf[DescableQuery[T]]
  }
}

