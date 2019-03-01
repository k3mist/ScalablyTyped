package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IValue extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var localized: js.UndefOr[java.lang.String] = js.undefined
}

object IValue {
  @scala.inline
  def apply(data: js.Any = null, localized: java.lang.String = null): IValue = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (localized != null) __obj.updateDynamic("localized")(localized)
    __obj.asInstanceOf[IValue]
  }
}

