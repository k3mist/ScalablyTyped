package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Iterator type. */
trait Iterator[T] extends js.Object {
  def next(): typescriptLib.Anon_Done[T] | typescriptLib.Anon_DoneTrue
}

object Iterator {
  @scala.inline
  def apply[T](next: () => typescriptLib.Anon_Done[T] | typescriptLib.Anon_DoneTrue): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

