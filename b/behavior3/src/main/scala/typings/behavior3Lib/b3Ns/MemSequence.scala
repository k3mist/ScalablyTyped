package typings
package behavior3Lib.b3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MemSequence is similar to Sequence node, but when a child returns a
  * `RUNNING` state, its index is recorded and in the next tick the
  * MemPriority call the child recorded directly, without calling previous
  * children again.
  *
  */
@JSGlobal("b3.MemSequence")
@js.native
/**
  * Creates an instance of MemSequence.
  */
class MemSequence () extends Composite {
  def this(hasChildren: behavior3Lib.Anon_ChildrenArray) = this()
}

