package typings
package tabulatorLib.tabulatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
trait Tabulator extends js.Object {
  // myMethod(opts: Tabulator.chartType): number;
  var defaultShowAttribute: java.lang.String
  def toHtmlTable(matrix: js.Object): js.Any
  def toMatrix(datum: js.Object): js.Object
}

object Tabulator {
  @scala.inline
  def apply(
    defaultShowAttribute: java.lang.String,
    toHtmlTable: js.Function1[js.Object, js.Any],
    toMatrix: js.Function1[js.Object, js.Object]
  ): Tabulator = {
    val __obj = js.Dynamic.literal(defaultShowAttribute = defaultShowAttribute, toHtmlTable = toHtmlTable, toMatrix = toMatrix)
  
    __obj.asInstanceOf[Tabulator]
  }
}

