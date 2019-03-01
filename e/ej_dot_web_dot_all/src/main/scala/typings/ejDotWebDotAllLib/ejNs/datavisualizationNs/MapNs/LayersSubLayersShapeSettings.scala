package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersSubLayersShapeSettings extends js.Object {
  /** Enables or Disables the auto fill colors for shape layer in map. When this property value set to true, shapes will be filled with palette colors.
    * @Default {false}
    */
  var autoFill: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the colorMappings of the shape layer in map
    * @Default {null}
    */
  var colorMappings: js.UndefOr[LayersSubLayersShapeSettingsColorMappings] = js.undefined
  /** Specifies the shape color palette value of the shape layer in map. Accepted colorPalette values are palette1, palette2, palette3 and custompalette.
    * @Default {palette1}
    */
  var colorPalette: js.UndefOr[ColorPalette | java.lang.String] = js.undefined
  /** Specifies the shape color valuePath of the shape layer in map
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[java.lang.String] = js.undefined
  /** Enables or Disables the gradient colors for map shapes.
    * @Default {false}
    */
  var enableGradient: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the shape fill color of the shape layer in map
    * @Default {#E5E5E5}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mouse over width of the shape layer in map
    * @Default {1}
    */
  var highlightBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the mouse hover color of the shape layer in map
    * @Default {gray}
    */
  var highlightColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mouse over stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var highlightStroke: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape selection color of the shape layer in map
    * @Default {gray}
    */
  var selectionColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape selection stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var selectionStroke: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape selection stroke width of the shape layer in map
    * @Default {1}
    */
  var selectionStrokeWidth: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the shape stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape stroke thickness value of the shape layer in map
    * @Default {0.2}
    */
  var strokeThickness: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the shape valuePath of the shape layer in map
    * @Default {null}
    */
  var valuePath: js.UndefOr[java.lang.String] = js.undefined
}

object LayersSubLayersShapeSettings {
  @scala.inline
  def apply(
    autoFill: js.UndefOr[scala.Boolean] = js.undefined,
    colorMappings: LayersSubLayersShapeSettingsColorMappings = null,
    colorPalette: ColorPalette | java.lang.String = null,
    colorValuePath: java.lang.String = null,
    enableGradient: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    highlightBorderWidth: scala.Int | scala.Double = null,
    highlightColor: java.lang.String = null,
    highlightStroke: java.lang.String = null,
    selectionColor: java.lang.String = null,
    selectionStroke: java.lang.String = null,
    selectionStrokeWidth: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    strokeThickness: scala.Int | scala.Double = null,
    valuePath: java.lang.String = null
  ): LayersSubLayersShapeSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFill)) __obj.updateDynamic("autoFill")(autoFill)
    if (colorMappings != null) __obj.updateDynamic("colorMappings")(colorMappings)
    if (colorPalette != null) __obj.updateDynamic("colorPalette")(colorPalette.asInstanceOf[js.Any])
    if (colorValuePath != null) __obj.updateDynamic("colorValuePath")(colorValuePath)
    if (!js.isUndefined(enableGradient)) __obj.updateDynamic("enableGradient")(enableGradient)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (highlightBorderWidth != null) __obj.updateDynamic("highlightBorderWidth")(highlightBorderWidth.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor)
    if (highlightStroke != null) __obj.updateDynamic("highlightStroke")(highlightStroke)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (selectionStroke != null) __obj.updateDynamic("selectionStroke")(selectionStroke)
    if (selectionStrokeWidth != null) __obj.updateDynamic("selectionStrokeWidth")(selectionStrokeWidth.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeThickness != null) __obj.updateDynamic("strokeThickness")(strokeThickness.asInstanceOf[js.Any])
    if (valuePath != null) __obj.updateDynamic("valuePath")(valuePath)
    __obj.asInstanceOf[LayersSubLayersShapeSettings]
  }
}

