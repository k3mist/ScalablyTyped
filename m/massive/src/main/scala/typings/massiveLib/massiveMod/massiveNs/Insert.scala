package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a INSERT query. */
trait Insert extends js.Object {
  /** Format this object into a SQL SELECT. */
  def format(): java.lang.String
}

object Insert {
  @scala.inline
  def apply(format: () => java.lang.String): Insert = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction0(format))
  
    __obj.asInstanceOf[Insert]
  }
}

