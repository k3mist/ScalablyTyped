package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAlias
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier
  var right: FlowTypeAnnotation
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_TypeAlias: babelDashTypesLib.babelDashTypesLibStrings.TypeAlias
}

