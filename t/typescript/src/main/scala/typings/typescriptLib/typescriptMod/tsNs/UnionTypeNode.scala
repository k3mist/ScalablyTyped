package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionTypeNode
  extends TypeNode
     with UnionOrIntersectionTypeNode {
  var types: NodeArray[TypeNode] = js.native
}

