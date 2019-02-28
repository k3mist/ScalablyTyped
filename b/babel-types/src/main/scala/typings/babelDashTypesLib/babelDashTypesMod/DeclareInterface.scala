package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclareInterface
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends]
  var id: Identifier
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_DeclareInterface: babelDashTypesLib.babelDashTypesLibStrings.DeclareInterface
}

