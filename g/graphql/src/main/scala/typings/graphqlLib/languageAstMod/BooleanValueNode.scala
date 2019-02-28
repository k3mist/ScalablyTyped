package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanValueNode
  extends ASTNode
     with ValueNode {
  val kind: graphqlLib.graphqlLibStrings.BooleanValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: scala.Boolean
}

