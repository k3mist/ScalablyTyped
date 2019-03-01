package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectUI extends BaseUI {
  var items: js.Array[_]
  var menu: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Menu | scala.Unit
  def closeOptions(): scala.Unit
  def openOptions(): scala.Unit
  def setItems(items: js.Array[_]): scala.Unit
}

object SelectUI {
  @scala.inline
  def apply(
    build: js.Function0[scala.Unit],
    buildState: scala.Boolean,
    closeOptions: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    element: js.Function0[stdLib.Element],
    eventManager: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.EventManager,
    focus: js.Function0[scala.Unit],
    getValue: js.Function0[js.Any],
    hide: js.Function0[scala.Unit],
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    isBuilt: js.Function0[scala.Boolean],
    items: js.Array[_],
    menu: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Menu | scala.Unit,
    openOptions: js.Function0[scala.Unit],
    options: js.Object,
    reset: js.Function0[scala.Unit],
    setItems: js.Function1[js.Array[_], scala.Unit],
    setValue: js.Function1[js.Any, js.Any],
    show: js.Function0[scala.Unit],
    update: js.Function0[scala.Unit]
  ): SelectUI = {
    val __obj = js.Dynamic.literal(build = build, buildState = buildState, closeOptions = closeOptions, destroy = destroy, element = element, eventManager = eventManager, focus = focus, getValue = getValue, hide = hide, hot = hot, isBuilt = isBuilt, items = items, menu = menu.asInstanceOf[js.Any], openOptions = openOptions, options = options, reset = reset, setItems = setItems, setValue = setValue, show = show, update = update)
  
    __obj.asInstanceOf[SelectUI]
  }
}

