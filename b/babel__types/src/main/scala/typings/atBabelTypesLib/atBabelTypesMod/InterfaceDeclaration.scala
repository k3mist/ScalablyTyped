package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait InterfaceDeclaration
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends] | scala.Null
  var id: Identifier
  var implements: js.Array[ClassImplements] | scala.Null
  var mixins: js.Array[InterfaceExtends] | scala.Null
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_InterfaceDeclaration: atBabelTypesLib.atBabelTypesLibStrings.InterfaceDeclaration
}

