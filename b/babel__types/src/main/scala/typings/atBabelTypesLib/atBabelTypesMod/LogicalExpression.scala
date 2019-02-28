package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait LogicalExpression
  extends Binary
     with BaseNode
     with Expression {
  var left: Expression
  var operator: atBabelTypesLib.atBabelTypesLibStrings.`||` | atBabelTypesLib.atBabelTypesLibStrings.`&&` | atBabelTypesLib.atBabelTypesLibStrings.`??`
  var right: Expression
  @JSName("type")
  var type_LogicalExpression: atBabelTypesLib.atBabelTypesLibStrings.LogicalExpression
}

