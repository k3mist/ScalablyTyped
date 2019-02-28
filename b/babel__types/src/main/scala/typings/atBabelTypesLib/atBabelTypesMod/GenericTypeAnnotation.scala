package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait GenericTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var id: Identifier | QualifiedTypeIdentifier
  var typeParameters: TypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_GenericTypeAnnotation: atBabelTypesLib.atBabelTypesLibStrings.GenericTypeAnnotation
}

