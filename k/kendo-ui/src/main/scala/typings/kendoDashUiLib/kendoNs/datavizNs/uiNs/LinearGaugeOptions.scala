package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugeOptions extends js.Object {
  var gaugeArea: js.UndefOr[LinearGaugeGaugeArea] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pointer: js.UndefOr[js.Array[LinearGaugePointerItem]] = js.undefined
  var renderAs: js.UndefOr[java.lang.String] = js.undefined
  var scale: js.UndefOr[LinearGaugeScale] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var transitions: js.UndefOr[scala.Boolean] = js.undefined
}

object LinearGaugeOptions {
  @scala.inline
  def apply(
    gaugeArea: LinearGaugeGaugeArea = null,
    name: java.lang.String = null,
    pointer: js.Array[LinearGaugePointerItem] = null,
    renderAs: java.lang.String = null,
    scale: LinearGaugeScale = null,
    theme: java.lang.String = null,
    transitions: js.UndefOr[scala.Boolean] = js.undefined
  ): LinearGaugeOptions = {
    val __obj = js.Dynamic.literal()
    if (gaugeArea != null) __obj.updateDynamic("gaugeArea")(gaugeArea)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pointer != null) __obj.updateDynamic("pointer")(pointer)
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions)
    __obj.asInstanceOf[LinearGaugeOptions]
  }
}

