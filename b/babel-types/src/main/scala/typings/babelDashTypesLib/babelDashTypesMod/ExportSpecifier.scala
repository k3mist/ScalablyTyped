package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSpecifier
  extends Node
     with ModuleSpecifier {
  var exported: Identifier
  var imported: Identifier
  var local: Identifier
  @JSName("type")
  var type_ExportSpecifier: babelDashTypesLib.babelDashTypesLibStrings.ExportSpecifier
}

