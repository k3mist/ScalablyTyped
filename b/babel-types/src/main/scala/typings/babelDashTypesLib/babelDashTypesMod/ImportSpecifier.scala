package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSpecifier
  extends Node
     with ModuleSpecifier {
  var imported: Identifier
  var local: Identifier
  @JSName("type")
  var type_ImportSpecifier: babelDashTypesLib.babelDashTypesLibStrings.ImportSpecifier
}

