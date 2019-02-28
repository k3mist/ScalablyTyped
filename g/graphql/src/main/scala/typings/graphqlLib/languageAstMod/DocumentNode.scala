package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentNode extends ASTNode {
  val definitions: js.Array[DefinitionNode]
  val kind: graphqlLib.graphqlLibStrings.Document
  val loc: js.UndefOr[Location] = js.undefined
}

