package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait IfStatement
  extends Conditional
     with BaseNode
     with Statement {
  var alternate: Statement | scala.Null
  var consequent: Statement
  var test: Expression
  @JSName("type")
  var type_IfStatement: atBabelTypesLib.atBabelTypesLibStrings.IfStatement
}

