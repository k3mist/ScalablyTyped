package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Components-------------------------------------------------------------------
trait CellNavigation extends js.Object {
  /** down - move to the same cell in the row below */
  def down(): scala.Unit
  /** left - next editable cell on the left, return false if none available on row */
  def left(): scala.Boolean
  /** next - next editable cell on the right, if none available move to left most editable cell on the row below */
  def next(): scala.Boolean
  /** prev - next editable cell on the left, if none available move to the right most editable cell on the row above */
  def prev(): scala.Boolean
  /** right - next editable cell on the right, return false if none available on row */
  def right(): scala.Boolean
  /** up - move to the same cell in the row above */
  def up(): scala.Unit
}

object CellNavigation {
  @scala.inline
  def apply(
    down: () => scala.Unit,
    left: () => scala.Boolean,
    next: () => scala.Boolean,
    prev: () => scala.Boolean,
    right: () => scala.Boolean,
    up: () => scala.Unit
  ): CellNavigation = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction0(down), left = js.Any.fromFunction0(left), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), right = js.Any.fromFunction0(right), up = js.Any.fromFunction0(up))
  
    __obj.asInstanceOf[CellNavigation]
  }
}

