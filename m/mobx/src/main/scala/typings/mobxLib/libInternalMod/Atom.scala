package typings
package mobxLib.libInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "Atom")
@js.native
/**
  * Create a new atom. For debugging purposes it is recommended to give it a name.
  * The onBecomeObserved and onBecomeUnobserved callbacks can be used for resource management.
  */
class Atom ()
  extends mobxLib.libCoreAtomMod.Atom {
  def this(name: java.lang.String) = this()
}

