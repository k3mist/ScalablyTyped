package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait AssignmentExpression
  extends Expression
     with BaseNode {
  var left: LVal
  var operator: java.lang.String
  var right: Expression
  @JSName("type")
  var type_AssignmentExpression: atBabelTypesLib.atBabelTypesLibStrings.AssignmentExpression
}

