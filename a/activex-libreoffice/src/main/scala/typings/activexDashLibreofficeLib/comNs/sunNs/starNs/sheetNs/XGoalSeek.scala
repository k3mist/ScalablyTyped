package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides seeking a goal value for a cell. */
trait XGoalSeek
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * calculates a value which gives a specified result in a formula.
    * @param aFormulaPosition is the address of the formula cell used for the calculation.
    * @param aVariablePosition is the address of the cell that is used in the formula as variable.
    * @param aGoalValue is the value which should be reached during the goal seek.
    * @returns the result of the goal seek, including the value that results in the specified goal, using the specified formula.
    */
  def seekGoal(
    aFormulaPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    aVariablePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    aGoalValue: java.lang.String
  ): GoalResult
}

object XGoalSeek {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    seekGoal: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      java.lang.String, 
      GoalResult
    ]
  ): XGoalSeek = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, seekGoal = seekGoal)
  
    __obj.asInstanceOf[XGoalSeek]
  }
}

