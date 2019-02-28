package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TryStatement
  extends Statement
     with BaseNode {
  var block: BlockStatement
  var finalizer: BlockStatement | scala.Null
  var handler: CatchClause | scala.Null
  @JSName("type")
  var type_TryStatement: atBabelTypesLib.atBabelTypesLibStrings.TryStatement
}

