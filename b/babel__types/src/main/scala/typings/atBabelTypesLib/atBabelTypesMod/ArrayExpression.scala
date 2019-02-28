package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ArrayExpression
  extends Expression
     with BaseNode {
  var elements: js.Array[scala.Null | Expression | SpreadElement]
  @JSName("type")
  var type_ArrayExpression: atBabelTypesLib.atBabelTypesLibStrings.ArrayExpression
}

