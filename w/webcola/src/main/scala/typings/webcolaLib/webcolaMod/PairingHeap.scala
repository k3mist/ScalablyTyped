package typings
package webcolaLib.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "PairingHeap")
@js.native
class PairingHeap[T] protected ()
  extends webcolaLib.distSrcPqueueMod.PairingHeap[T] {
  def this(elem: T) = this()
}

