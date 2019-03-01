package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindPattern extends Pattern {
  var expression: Expression
  var `type`: sparqljsLib.sparqljsLibStrings.bind
  var variable: Term
}

object BindPattern {
  @scala.inline
  def apply(expression: Expression, `type`: sparqljsLib.sparqljsLibStrings.bind, variable: Term): BindPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], `type` = `type`, variable = variable)
  
    __obj.asInstanceOf[BindPattern]
  }
}

