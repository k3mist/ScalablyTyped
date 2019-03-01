package typings
package algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equation extends js.Object {
  var lhs: Expression
  var rhs: Expression
  def solveFor(variable: java.lang.String): Fraction | js.Array[Fraction] | js.Array[scala.Double]
}

object Equation {
  @scala.inline
  def apply(
    lhs: Expression,
    rhs: Expression,
    solveFor: js.Function1[java.lang.String, Fraction | js.Array[Fraction] | js.Array[scala.Double]],
    toString: js.Function0[java.lang.String]
  ): Equation = {
    val __obj = js.Dynamic.literal(lhs = lhs, rhs = rhs, solveFor = solveFor, toString = toString)
  
    __obj.asInstanceOf[Equation]
  }
}

