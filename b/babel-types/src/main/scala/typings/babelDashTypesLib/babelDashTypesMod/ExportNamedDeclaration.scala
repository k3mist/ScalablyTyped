package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportNamedDeclaration
  extends Node
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  var declaration: Declaration
  var source: StringLiteral | scala.Null
  var specifiers: js.Array[ExportSpecifier]
  @JSName("type")
  var type_ExportNamedDeclaration: babelDashTypesLib.babelDashTypesLibStrings.ExportNamedDeclaration
}

