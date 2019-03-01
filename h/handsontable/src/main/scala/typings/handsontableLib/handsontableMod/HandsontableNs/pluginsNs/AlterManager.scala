package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterManager extends js.Object {
  var dataProvider: DataProvider
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  var matrix: Matrix
  var sheet: Sheet
  def destroy(): scala.Unit
  def prepareAlter(action: java.lang.String, args: js.Any): scala.Unit
  def triggerAlter(action: java.lang.String, args: js.Any): scala.Unit
}

object AlterManager {
  @scala.inline
  def apply(
    dataProvider: DataProvider,
    destroy: js.Function0[scala.Unit],
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    matrix: Matrix,
    prepareAlter: js.Function2[java.lang.String, js.Any, scala.Unit],
    sheet: Sheet,
    triggerAlter: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): AlterManager = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider, destroy = destroy, hot = hot, matrix = matrix, prepareAlter = prepareAlter, sheet = sheet, triggerAlter = triggerAlter)
  
    __obj.asInstanceOf[AlterManager]
  }
}

