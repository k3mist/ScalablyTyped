package typings
package typesettableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destroy extends js.Object {
  def destroy(): scala.Unit
  def write(
    line: java.lang.String,
    width: scala.Double,
    xAlign: typesettableLib.buildSrcWritersWriterMod.IXAlign,
    xOffset: scala.Double,
    yOffset: scala.Double
  ): scala.Unit
}

object Anon_Destroy {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    write: (java.lang.String, scala.Double, typesettableLib.buildSrcWritersWriterMod.IXAlign, scala.Double, scala.Double) => scala.Unit
  ): Anon_Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), write = js.Any.fromFunction5(write))
  
    __obj.asInstanceOf[Anon_Destroy]
  }
}

