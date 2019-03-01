package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesLinesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var children: js.Array[DataObject]
  /**
    * An array includes two ore more than two coordinates.
    * Each coordinate could be `[x, y]` in
    * [rectangular coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#grid)
    * and `[lng, lat]` in
    * [geographic coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.coords
    */
  var coords: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.emphasis
    */
  var emphasis: js.UndefOr[
    echartsLib.Anon_LabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyleFontWeightFormatterAnonColorCurvenessOpacity
  ] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily
  ] = js.undefined
  /**
    * The line style of this data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.lineStyle
    */
  var lineStyle: js.UndefOr[echartsLib.Anon_ColorCurvenessOpacityShadowBlur] = js.undefined
  /**
    * the name of data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    children: js.Array[DataObject],
    coords: js.Array[_] = null,
    emphasis: echartsLib.Anon_LabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyleFontWeightFormatterAnonColorCurvenessOpacity = null,
    label: echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily = null,
    lineStyle: echartsLib.Anon_ColorCurvenessOpacityShadowBlur = null,
    name: java.lang.String = null
  ): DataObject = {
    val __obj = js.Dynamic.literal(children = children)
    if (coords != null) __obj.updateDynamic("coords")(coords)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DataObject]
  }
}

