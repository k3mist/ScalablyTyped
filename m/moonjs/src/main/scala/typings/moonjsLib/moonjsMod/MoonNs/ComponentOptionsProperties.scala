package typings
package moonjsLib.moonjsMod.MoonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptionsProperties[Props /* <: java.lang.String */, Data, Methods] extends js.Object {
  var data: js.UndefOr[Data] = js.undefined
  var el: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var functional: js.UndefOr[moonjsLib.moonjsLibNumbers.`true`] = js.undefined
  var hooks: js.UndefOr[LifecycleHooks] = js.undefined
  var methods: js.UndefOr[Methods] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var props: js.UndefOr[js.Array[Props]] = js.undefined
  var render: js.UndefOr[js.Function2[/* h */ CreateElement, /* ctx */ js.Any, VDomElement]] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object ComponentOptionsProperties {
  @scala.inline
  def apply[Props /* <: java.lang.String */, Data, Methods](
    data: Data = null,
    el: java.lang.String | stdLib.HTMLElement = null,
    functional: moonjsLib.moonjsLibNumbers.`true` = null,
    hooks: LifecycleHooks = null,
    methods: Methods = null,
    name: java.lang.String = null,
    props: js.Array[Props] = null,
    render: js.Function2[/* h */ CreateElement, /* ctx */ js.Any, VDomElement] = null,
    template: java.lang.String = null
  ): ComponentOptionsProperties[Props, Data, Methods] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (functional != null) __obj.updateDynamic("functional")(functional)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (props != null) __obj.updateDynamic("props")(props)
    if (render != null) __obj.updateDynamic("render")(render)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ComponentOptionsProperties[Props, Data, Methods]]
  }
}

