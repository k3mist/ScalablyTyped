package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncompleteType extends FlowType {
  var flags: TypeFlags
  var `type`: Type
}

object IncompleteType {
  @scala.inline
  def apply(flags: TypeFlags, `type`: Type): IncompleteType = {
    val __obj = js.Dynamic.literal(flags = flags, `type` = `type`)
  
    __obj.asInstanceOf[IncompleteType]
  }
}

