package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DecimalPlaces extends js.Object {
  var decimalPlaces: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DecimalPlaces {
  @scala.inline
  def apply(decimalPlaces: scala.Int | scala.Double = null): Anon_DecimalPlaces = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DecimalPlaces]
  }
}

