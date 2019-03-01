package typings
package ejDotWebDotAllLib.ejNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  /** Height of the Sunburst.
    * @Default {''}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the Sunburst.
    * @Default {''}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Size {
  @scala.inline
  def apply(height: java.lang.String = null, width: java.lang.String = null): Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Size]
  }
}

