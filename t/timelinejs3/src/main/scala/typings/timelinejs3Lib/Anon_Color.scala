package typings
package timelinejs3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: java.lang.String = null, url: java.lang.String = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Color]
  }
}

