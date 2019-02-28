package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionNodePlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  var name: java.lang.String
  @JSName("type")
  var type_FunctionNodePlain: cssDashTreeLib.cssDashTreeLibStrings.Function
}

