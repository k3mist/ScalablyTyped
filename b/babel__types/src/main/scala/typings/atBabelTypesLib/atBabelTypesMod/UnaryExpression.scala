package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait UnaryExpression
  extends Expression
     with BaseNode
     with UnaryLike {
  var argument: Expression
  var operator: atBabelTypesLib.atBabelTypesLibStrings.void | atBabelTypesLib.atBabelTypesLibStrings.`throw` | atBabelTypesLib.atBabelTypesLibStrings.delete | atBabelTypesLib.atBabelTypesLibStrings.`!` | atBabelTypesLib.atBabelTypesLibStrings.`+` | atBabelTypesLib.atBabelTypesLibStrings.`-` | atBabelTypesLib.atBabelTypesLibStrings.`~` | atBabelTypesLib.atBabelTypesLibStrings.typeof
  var prefix: scala.Boolean
  @JSName("type")
  var type_UnaryExpression: atBabelTypesLib.atBabelTypesLibStrings.UnaryExpression
}

