package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTypeNode
  extends ASTNode
     with TypeNode {
  val kind: graphqlLib.graphqlLibStrings.ListType
  val loc: js.UndefOr[Location] = js.undefined
  val `type`: TypeNode
}

