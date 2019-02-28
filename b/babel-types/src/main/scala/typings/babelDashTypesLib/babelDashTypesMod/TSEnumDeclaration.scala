package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumDeclaration
  extends Node
     with Declaration
     with Statement {
  var const: scala.Boolean | scala.Null
  var declare: scala.Boolean | scala.Null
  var id: Identifier
  var initializer: Expression | scala.Null
  var members: js.Array[TSEnumMember]
  @JSName("type")
  var type_TSEnumDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TSEnumDeclaration
}

