package typings
package qlikDashVisualizationextensionsLib.SelectionStateAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQSelectionState extends js.Object {
  /**
    * Number of back steps available.
    */
  var backCount: scala.Double
  /**
    * Number of forward steps available. OnData notification will be triggered after each update.
    */
  var forwardCount: scala.Double
  /**
    * Selections
    */
  var selections: IQFieldSelections
  /**
    * State name. $ for default state.
    */
  var stateName: java.lang.String
  /**
    * Cleara all selections in this state.
    * @param lockedAlso - Use to also clear locked fields.
    * @return - A promise of a Qlik engine reply.
    */
  def clearAll(lockedAlso: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_]
  /**
    * Locks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def lockAll(): angularLib.angularMod.angularNs.IPromise[_]
  /**
    * Unlocks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def unlockAll(): angularLib.angularMod.angularNs.IPromise[_]
}

object IQSelectionState {
  @scala.inline
  def apply(
    backCount: scala.Double,
    clearAll: js.Function1[scala.Boolean, angularLib.angularMod.angularNs.IPromise[_]],
    forwardCount: scala.Double,
    lockAll: js.Function0[angularLib.angularMod.angularNs.IPromise[_]],
    selections: IQFieldSelections,
    stateName: java.lang.String,
    unlockAll: js.Function0[angularLib.angularMod.angularNs.IPromise[_]]
  ): IQSelectionState = {
    val __obj = js.Dynamic.literal(backCount = backCount, clearAll = clearAll, forwardCount = forwardCount, lockAll = lockAll, selections = selections, stateName = stateName, unlockAll = unlockAll)
  
    __obj.asInstanceOf[IQSelectionState]
  }
}

