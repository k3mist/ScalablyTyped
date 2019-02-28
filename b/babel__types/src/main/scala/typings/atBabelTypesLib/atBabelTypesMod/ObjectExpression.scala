package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectExpression
  extends Expression
     with BaseNode {
  var properties: js.Array[ObjectMethod | ObjectProperty | SpreadElement]
  @JSName("type")
  var type_ObjectExpression: atBabelTypesLib.atBabelTypesLibStrings.ObjectExpression
}

