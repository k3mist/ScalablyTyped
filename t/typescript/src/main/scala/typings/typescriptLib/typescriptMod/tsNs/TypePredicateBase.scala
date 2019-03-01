package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypePredicateBase extends js.Object {
  var kind: TypePredicateKind
  var `type`: Type
}

object TypePredicateBase {
  @scala.inline
  def apply(kind: TypePredicateKind, `type`: Type): TypePredicateBase = {
    val __obj = js.Dynamic.literal(kind = kind, `type` = `type`)
  
    __obj.asInstanceOf[TypePredicateBase]
  }
}

