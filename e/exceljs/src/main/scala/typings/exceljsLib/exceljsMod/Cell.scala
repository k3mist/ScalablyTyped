package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends Style {
  /**
  	 * Cells can define what values are valid or not and provide
  	 * prompting to the user to help guide them.
  	 */
  var dataValidation: js.UndefOr[DataValidation] = js.undefined
  /**
  	 * convenience getter to access the formula
  	 */
  val formula: java.lang.String
  /**
  	 * The type of the cell's formula
  	 */
  val formulaType: FormulaType
  /**
  	 * The master cell when the current cell is a merge cell
  	 */
  var master: js.UndefOr[Cell] = js.undefined
  /**
  	 * Assign (or get) a name for a cell (will overwrite any other names that cell had)
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Assign (or get) an array of names for a cell (cells can have more than one name)
  	 */
  var names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * convenience getter to access the formula result
  	 */
  val result: scala.Double | java.lang.String | stdLib.Date
  /**
  	 * The styles of the cell
  	 */
  var style: Style
  /**
  	 * The type of the cell's value
  	 */
  val `type`: ValueType
  /**
  	 * Value of the cell
  	 */
  var value: CellValue
  /**
  	 * Remove a name from a cell
  	 */
  def removeName(name: java.lang.String): scala.Unit
}

object Cell {
  @scala.inline
  def apply(
    formula: java.lang.String,
    formulaType: FormulaType,
    removeName: js.Function1[java.lang.String, scala.Unit],
    result: scala.Double | java.lang.String | stdLib.Date,
    style: Style,
    `type`: ValueType,
    value: CellValue,
    alignment: Alignment = null,
    border: Borders = null,
    dataValidation: DataValidation = null,
    fill: Fill = null,
    font: Font = null,
    master: Cell = null,
    name: java.lang.String = null,
    names: js.Array[java.lang.String] = null,
    numFmt: java.lang.String = null
  ): Cell = {
    val __obj = js.Dynamic.literal(formula = formula, formulaType = formulaType, removeName = removeName, result = result.asInstanceOf[js.Any], style = style, `type` = `type`, value = value.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (border != null) __obj.updateDynamic("border")(border)
    if (dataValidation != null) __obj.updateDynamic("dataValidation")(dataValidation)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (master != null) __obj.updateDynamic("master")(master)
    if (name != null) __obj.updateDynamic("name")(name)
    if (names != null) __obj.updateDynamic("names")(names)
    if (numFmt != null) __obj.updateDynamic("numFmt")(numFmt)
    __obj.asInstanceOf[Cell]
  }
}

