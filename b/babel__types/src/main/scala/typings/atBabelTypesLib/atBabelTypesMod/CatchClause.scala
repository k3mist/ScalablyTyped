package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait CatchClause
  extends BlockParent
     with BaseNode
     with Scopable {
  var body: BlockStatement
  var param: Identifier | scala.Null
  @JSName("type")
  var type_CatchClause: atBabelTypesLib.atBabelTypesLibStrings.CatchClause
}

