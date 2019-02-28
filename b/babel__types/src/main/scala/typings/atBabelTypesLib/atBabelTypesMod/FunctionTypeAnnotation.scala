package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait FunctionTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var params: js.Array[FunctionTypeParam]
  var rest: FunctionTypeParam | scala.Null
  var returnType: FlowType
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_FunctionTypeAnnotation: atBabelTypesLib.atBabelTypesLibStrings.FunctionTypeAnnotation
}

