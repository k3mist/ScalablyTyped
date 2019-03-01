package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SELECT query. */
trait Select extends js.Object {
  /** Format this object into a SQL SELECT. */
  def format(): java.lang.String
}

object Select {
  @scala.inline
  def apply(format: js.Function0[java.lang.String]): Select = {
    val __obj = js.Dynamic.literal(format = format)
  
    __obj.asInstanceOf[Select]
  }
}

