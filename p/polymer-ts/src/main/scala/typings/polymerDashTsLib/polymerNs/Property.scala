package typings
package polymerDashTsLib.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  var computed: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  @JSName("notify")
  var notify_FProperty: js.UndefOr[scala.Boolean] = js.undefined
  var observer: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var reflectToAttribute: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object Property {
  @scala.inline
  def apply(
    computed: java.lang.String = null,
    name: java.lang.String = null,
    notify: js.UndefOr[scala.Boolean] = js.undefined,
    observer: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reflectToAttribute: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: js.Any = null,
    value: js.Any = null
  ): Property = {
    val __obj = js.Dynamic.literal()
    if (computed != null) __obj.updateDynamic("computed")(computed)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify)
    if (observer != null) __obj.updateDynamic("observer")(observer)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(reflectToAttribute)) __obj.updateDynamic("reflectToAttribute")(reflectToAttribute)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Property]
  }
}

