package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition extends js.Object {
  var condition: java.lang.String
  var field: java.lang.String
  var ignoreCase: scala.Boolean
  var isComplex: scala.Boolean
  var operator: java.lang.String
  var predicates: js.Any
  var value: js.Any
}

object Anon_Condition {
  @scala.inline
  def apply(
    condition: java.lang.String,
    field: java.lang.String,
    ignoreCase: scala.Boolean,
    isComplex: scala.Boolean,
    operator: java.lang.String,
    predicates: js.Any,
    value: js.Any
  ): Anon_Condition = {
    val __obj = js.Dynamic.literal(condition = condition, field = field, ignoreCase = ignoreCase, isComplex = isComplex, operator = operator, predicates = predicates, value = value)
  
    __obj.asInstanceOf[Anon_Condition]
  }
}

