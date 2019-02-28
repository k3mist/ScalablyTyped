package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQualifiedName
  extends Node
     with TSEntityName {
  var left: TSEntityName
  var right: Identifier
  @JSName("type")
  var type_TSQualifiedName: babelDashTypesLib.babelDashTypesLibStrings.TSQualifiedName
}

