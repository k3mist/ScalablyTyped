package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualitativeRange extends js.Object {
  /** Specifies the ending range to which the qualitative ranges will render.
    * @Default {3}
    */
  var rangeEnd: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the opacity for the qualitative ranges.
    * @Default {1}
    */
  var rangeOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the stroke for the qualitative ranges.
    * @Default {null}
    */
  var rangeStroke: js.UndefOr[java.lang.String] = js.undefined
}

object QualitativeRange {
  @scala.inline
  def apply(
    rangeEnd: scala.Int | scala.Double = null,
    rangeOpacity: scala.Int | scala.Double = null,
    rangeStroke: java.lang.String = null
  ): QualitativeRange = {
    val __obj = js.Dynamic.literal()
    if (rangeEnd != null) __obj.updateDynamic("rangeEnd")(rangeEnd.asInstanceOf[js.Any])
    if (rangeOpacity != null) __obj.updateDynamic("rangeOpacity")(rangeOpacity.asInstanceOf[js.Any])
    if (rangeStroke != null) __obj.updateDynamic("rangeStroke")(rangeStroke)
    __obj.asInstanceOf[QualitativeRange]
  }
}

