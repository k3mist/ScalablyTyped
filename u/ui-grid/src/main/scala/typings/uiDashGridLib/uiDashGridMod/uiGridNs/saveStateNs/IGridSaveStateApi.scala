package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.saveStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridSaveStateApi extends js.Object {
  // Methods
  /**
    * Restores the provided state into the grid
    * @param {ng.IScope} $scope A scope we can broadcast on
    * @param {IGridSavedState} state The state that should ve restored into the grid
    */
  def restore($scope: angularLib.angularMod.angularNs.IScope, state: IGridSavedState): scala.Unit
  /**
    * Packages the current state of the grid into an object, and provides it to the user for saving
    * @returns {IGridSavedState} Current grid state as a POJO
    */
  def save(): IGridSavedState
}

object IGridSaveStateApi {
  @scala.inline
  def apply(
    restore: js.Function2[angularLib.angularMod.angularNs.IScope, IGridSavedState, scala.Unit],
    save: js.Function0[IGridSavedState]
  ): IGridSaveStateApi = {
    val __obj = js.Dynamic.literal(restore = restore, save = save)
  
    __obj.asInstanceOf[IGridSaveStateApi]
  }
}

