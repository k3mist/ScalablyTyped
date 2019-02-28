package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait UpdateExpression
  extends Expression
     with BaseNode {
  var argument: Expression
  var operator: atBabelTypesLib.atBabelTypesLibStrings.`++` | atBabelTypesLib.atBabelTypesLibStrings.`--`
  var prefix: scala.Boolean
  @JSName("type")
  var type_UpdateExpression: atBabelTypesLib.atBabelTypesLibStrings.UpdateExpression
}

