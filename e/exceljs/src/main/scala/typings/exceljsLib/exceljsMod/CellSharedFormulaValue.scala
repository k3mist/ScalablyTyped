package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSharedFormulaValue extends _CellValue {
  val formula: js.UndefOr[java.lang.String] = js.undefined
  var result: scala.Double | java.lang.String | stdLib.Date
  var sharedFormula: java.lang.String
}

