package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclareModule
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var body: BlockStatement
  var id: StringLiteral | Identifier
  @JSName("type")
  var type_DeclareModule: babelDashTypesLib.babelDashTypesLibStrings.DeclareModule
}

