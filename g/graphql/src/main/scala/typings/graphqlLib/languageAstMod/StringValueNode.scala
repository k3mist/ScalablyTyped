package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringValueNode
  extends ASTNode
     with ValueNode {
  val block: js.UndefOr[scala.Boolean] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.StringValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: java.lang.String
}

