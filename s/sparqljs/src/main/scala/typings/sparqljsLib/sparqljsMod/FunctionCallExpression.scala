package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCallExpression
  extends BaseExpression
     with _Expression {
  var args: js.Array[Expression]
  var function: java.lang.String
  @JSName("type")
  var type_FunctionCallExpression: sparqljsLib.sparqljsLibStrings.functionCall
}

