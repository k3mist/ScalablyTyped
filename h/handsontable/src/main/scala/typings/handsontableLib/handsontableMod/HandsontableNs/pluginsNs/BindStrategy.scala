package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindStrategy extends js.Object {
  var strategy: java.lang.String | scala.Unit
  def clearMap(): scala.Unit
  def createMap(length: scala.Double): scala.Unit
  def createRow(params: js.Any): scala.Unit
  def destroy(): scala.Unit
  def klass(): scala.Unit
  def removeRow(params: js.Any): scala.Unit
  def setStrategy(name: java.lang.String): scala.Unit
  def translate(params: js.Any): scala.Unit
}

object BindStrategy {
  @scala.inline
  def apply(
    clearMap: js.Function0[scala.Unit],
    createMap: js.Function1[scala.Double, scala.Unit],
    createRow: js.Function1[js.Any, scala.Unit],
    destroy: js.Function0[scala.Unit],
    klass: js.Function0[scala.Unit],
    removeRow: js.Function1[js.Any, scala.Unit],
    setStrategy: js.Function1[java.lang.String, scala.Unit],
    strategy: java.lang.String | scala.Unit,
    translate: js.Function1[js.Any, scala.Unit]
  ): BindStrategy = {
    val __obj = js.Dynamic.literal(clearMap = clearMap, createMap = createMap, createRow = createRow, destroy = destroy, klass = klass, removeRow = removeRow, setStrategy = setStrategy, strategy = strategy.asInstanceOf[js.Any], translate = translate)
  
    __obj.asInstanceOf[BindStrategy]
  }
}

