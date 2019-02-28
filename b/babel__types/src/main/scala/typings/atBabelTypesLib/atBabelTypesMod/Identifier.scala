package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait Identifier
  extends Expression
     with BaseNode
     with LVal
     with PatternLike
     with TSEntityName {
  var decorators: js.Array[Decorator] | scala.Null
  var name: java.lang.String
  var optional: scala.Boolean | scala.Null
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  @JSName("type")
  var type_Identifier: atBabelTypesLib.atBabelTypesLibStrings.Identifier
}

