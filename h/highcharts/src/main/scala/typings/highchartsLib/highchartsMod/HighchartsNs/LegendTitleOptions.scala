package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendTitleOptions extends js.Object {
  /**
    * Generic CSS styles for the legend title.
    * @default {'fontWeight':'bold'}
    * @since 3.0
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * A text or HTML string for the title.
    * @default null
    * @since 3.0
    */
  var text: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object LegendTitleOptions {
  @scala.inline
  def apply(style: CSSObject = null, text: java.lang.String = null): LegendTitleOptions = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[LegendTitleOptions]
  }
}

