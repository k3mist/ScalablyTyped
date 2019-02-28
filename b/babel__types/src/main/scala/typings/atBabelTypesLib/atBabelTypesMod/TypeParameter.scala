package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TypeParameter
  extends Flow
     with BaseNode {
  var bound: TypeAnnotation | scala.Null
  var default: FlowType | scala.Null
  var name: java.lang.String | scala.Null
  @JSName("type")
  var type_TypeParameter: atBabelTypesLib.atBabelTypesLibStrings.TypeParameter
  var variance: Variance | scala.Null
}

