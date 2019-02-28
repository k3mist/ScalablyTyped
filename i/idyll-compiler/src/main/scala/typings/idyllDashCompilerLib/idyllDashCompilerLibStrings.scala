package typings
package idyllDashCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object idyllDashCompilerLibStrings {
  @js.native
  sealed trait expression
    extends idyllDashCompilerLib.idyllDashCompilerMod.PropType
  
  @js.native
  sealed trait value
    extends idyllDashCompilerLib.idyllDashCompilerMod.PropType
  
  @js.native
  sealed trait variable
    extends idyllDashCompilerLib.idyllDashCompilerMod.PropType
  
  @scala.inline
  def expression: expression = "expression".asInstanceOf[expression]
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  @scala.inline
  def variable: variable = "variable".asInstanceOf[variable]
}

