package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ExpressionStatement
  extends ExpressionWrapper
     with BaseNode
     with Statement {
  var expression: Expression
  @JSName("type")
  var type_ExpressionStatement: atBabelTypesLib.atBabelTypesLibStrings.ExpressionStatement
}

