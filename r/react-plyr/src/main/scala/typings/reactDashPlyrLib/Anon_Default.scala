package typings
package reactDashPlyrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var option: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double]] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    default: java.lang.String | scala.Double = null,
    option: js.Array[java.lang.String] | js.Array[scala.Double] = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default]
  }
}

