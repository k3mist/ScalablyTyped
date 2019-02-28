package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait YieldExpression
  extends Expression
     with BaseNode
     with Terminatorless {
  var argument: Expression | scala.Null
  var delegate: scala.Boolean
  @JSName("type")
  var type_YieldExpression: atBabelTypesLib.atBabelTypesLibStrings.YieldExpression
}

