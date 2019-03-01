package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapLegendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorMappingCollection extends js.Object {
  /** Specifies the color of the heatmap legend data.
    * @Default {white}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label properties of the heatmap legend color.
    * @Default {null}
    */
  var label: js.UndefOr[ColorMappingCollectionLabel] = js.undefined
  /** Specifies the color values of the heatmap legend column data.
    * @Default {0}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ColorMappingCollection {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    label: ColorMappingCollectionLabel = null,
    value: scala.Int | scala.Double = null
  ): ColorMappingCollection = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMappingCollection]
  }
}

