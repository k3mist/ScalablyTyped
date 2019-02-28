package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends Node
     with Expression
     with LVal
     with TSEntityName {
  var name: java.lang.String
  var typeAnnotation: js.UndefOr[TypeAnnotation] = js.undefined
  @JSName("type")
  var type_Identifier: babelDashTypesLib.babelDashTypesLibStrings.Identifier
}

