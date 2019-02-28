package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeProperty
  extends Node
     with Flow
     with UserWhitespacable {
  var key: Expression
  @JSName("type")
  var type_ObjectTypeProperty: babelDashTypesLib.babelDashTypesLibStrings.ObjectTypeProperty
  var value: FlowTypeAnnotation
}

