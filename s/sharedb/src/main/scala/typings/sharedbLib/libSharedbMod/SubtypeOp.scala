package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubtypeOp extends Op {
  var o: js.Any
  var p: Path
  var t: java.lang.String
}

object SubtypeOp {
  @scala.inline
  def apply(o: js.Any, p: Path, t: java.lang.String): SubtypeOp = {
    val __obj = js.Dynamic.literal(o = o, p = p, t = t)
  
    __obj.asInstanceOf[SubtypeOp]
  }
}

