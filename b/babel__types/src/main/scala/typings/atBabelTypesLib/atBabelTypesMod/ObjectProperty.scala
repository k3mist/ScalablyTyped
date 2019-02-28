package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectProperty
  extends ObjectMember
     with BaseNode
     with Property
     with UserWhitespacable {
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var key: js.Any
  var shorthand: scala.Boolean
  @JSName("type")
  var type_ObjectProperty: atBabelTypesLib.atBabelTypesLibStrings.ObjectProperty
  var value: Expression | PatternLike
}

