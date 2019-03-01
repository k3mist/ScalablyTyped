package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleExtensibility extends js.Object {
  var components: js.UndefOr[GriddleComponents] = js.undefined
  var events: js.UndefOr[GriddleEvents] = js.undefined
  var listeners: js.UndefOr[PropertyBag[griddleDashReactLib.Listener]] = js.undefined
  var reducer: js.UndefOr[PropertyBag[griddleDashReactLib.Reducer]] = js.undefined
  var renderProperties: js.UndefOr[GriddleRenderProperties] = js.undefined
  var selectors: js.UndefOr[PropertyBag[griddleDashReactLib.Selector]] = js.undefined
  var settingsComponentObjects: js.UndefOr[PropertyBag[SettingsComponentObject]] = js.undefined
  var styleConfig: js.UndefOr[GriddleStyleConfig] = js.undefined
}

object GriddleExtensibility {
  @scala.inline
  def apply(
    components: GriddleComponents = null,
    events: GriddleEvents = null,
    listeners: PropertyBag[griddleDashReactLib.Listener] = null,
    reducer: PropertyBag[griddleDashReactLib.Reducer] = null,
    renderProperties: GriddleRenderProperties = null,
    selectors: PropertyBag[griddleDashReactLib.Selector] = null,
    settingsComponentObjects: PropertyBag[SettingsComponentObject] = null,
    styleConfig: GriddleStyleConfig = null
  ): GriddleExtensibility = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components)
    if (events != null) __obj.updateDynamic("events")(events)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (reducer != null) __obj.updateDynamic("reducer")(reducer)
    if (renderProperties != null) __obj.updateDynamic("renderProperties")(renderProperties)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    if (settingsComponentObjects != null) __obj.updateDynamic("settingsComponentObjects")(settingsComponentObjects)
    if (styleConfig != null) __obj.updateDynamic("styleConfig")(styleConfig)
    __obj.asInstanceOf[GriddleExtensibility]
  }
}

