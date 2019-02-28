package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait SequenceExpression
  extends Expression
     with BaseNode {
  var expressions: js.Array[Expression]
  @JSName("type")
  var type_SequenceExpression: atBabelTypesLib.atBabelTypesLibStrings.SequenceExpression
}

