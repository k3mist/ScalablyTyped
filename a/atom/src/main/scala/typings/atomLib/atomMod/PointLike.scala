package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointLike extends js.Object {
  /** A zero-indexed number representing the column of the Point. */
  var column: scala.Double
  /** A zero-indexed number representing the row of the Point. */
  var row: scala.Double
}

object PointLike {
  @scala.inline
  def apply(column: scala.Double, row: scala.Double): PointLike = {
    val __obj = js.Dynamic.literal(column = column, row = row)
  
    __obj.asInstanceOf[PointLike]
  }
}

