package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait RestElement
  extends LVal
     with BaseNode
     with PatternLike {
  var argument: LVal
  var decorators: js.Array[Decorator] | scala.Null
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  @JSName("type")
  var type_RestElement: atBabelTypesLib.atBabelTypesLibStrings.RestElement
}

