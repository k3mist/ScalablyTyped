package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to evalaute queries containing `and` and `or` operators
  */
@JSGlobal("BABYLON.AndOrNotEvaluator")
@js.native
class AndOrNotEvaluator () extends js.Object

/* static members */
@JSGlobal("BABYLON.AndOrNotEvaluator")
@js.native
object AndOrNotEvaluator extends js.Object {
  var _HandleParenthesisContent: js.Any = js.native
  var _SimplifyNegation: js.Any = js.native
  /**
    * Evaluate a query
    * @param query defines the query to evaluate
    * @param evaluateCallback defines the callback used to filter result
    * @returns true if the query matches
    */
  def Eval(query: java.lang.String, evaluateCallback: js.Function1[/* val */ js.Any, scala.Boolean]): scala.Boolean = js.native
}

