package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait MemberExpression
  extends Expression
     with BaseNode
     with LVal {
  var computed: scala.Boolean
  var `object`: Expression
  var optional: atBabelTypesLib.atBabelTypesLibNumbers.`true` | atBabelTypesLib.atBabelTypesLibNumbers.`false` | scala.Null
  var property: js.Any
  @JSName("type")
  var type_MemberExpression: atBabelTypesLib.atBabelTypesLibStrings.MemberExpression
}

