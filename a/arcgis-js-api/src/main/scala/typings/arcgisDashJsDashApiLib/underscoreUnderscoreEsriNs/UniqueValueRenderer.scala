package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniqueValueRenderer
  extends Renderer
     with VisualVariablesRenderer
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.renderersNs.Renderer
     with renderersRenderer {
  /**
    * This property is only relevant When symbolizing polygon features with marker symbols (or [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)) in the [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) of this renderer. This is usually done when adding a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to the [visualVariables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#visualVariables)) in a bivariate visualization (color indicates a type-based value and size indicates the value of a separate numeric field). Use this property to set a background [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) (or [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) if visualizing data in 3D) to visualize the boundaries of each polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: FillSymbol | PolygonSymbol3D = js.native
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol). The [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol) is used to draw all features with unspecified, unmatched values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultLabel)
    */
  var defaultLabel: java.lang.String = js.native
  /**
    * The default symbol used to draw a feature whose value is not matched or specified by the renderer. If `null`, unmatched features will not be assigned a symbol.
    * > **Known Limitations**  SceneLayers with a `mesh` [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) will display unmatching features with a generic symbol even if the `defaultSymbol` is `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol)
    */
  var defaultSymbol: Symbol = js.native
  /**
    * The name of the attribute field the renderer uses to match unique values or types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field)
    */
  var field: java.lang.String = js.native
  /**
    * If needed, specifies the name of an additional attribute field the renderer will use to match values. For example, if you specify two fields:
    * ```js
    * var renderer = {
    *   type: "unique-value",  // autocasts as new UniqueValueRenderer()
    *   field: "REGION",
    *   field2: "RANK",
    *   fieldDelimiter: ", ",  // comma + space used to separate values from all fields
    *   uniqueValueInfos: [
    *     {
    *       value: "North, 1",  // features in the "North" region and a rank of 1
    *       symbol: sym1  // will be assigned sym1
    *     }, {
    *       value: "North, 2",  // features in the "North" region and a rank of 2
    *       symbol: sym2  // will be assigned sym2
    *     },
    *     ...
    *   ]
    * };
    * ```
    *
    * All combinations of values of [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) and `field2` are unique values and
    * may have their own symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2)
    */
  var field2: java.lang.String = js.native
  /**
    * If needed, specify the name of a third attribute field the renderer will use to match values. For example, if you specify three fields:
    * ```js
    * var renderer = {
    *   type: "unique-value",  // autocasts as new UniqueValueRenderer()
    *   field: "REGION",
    *   field2: "RANK",
    *   field3: "CLASS",
    *   fieldDelimiter: ", ",  // comma + space used to separate values from all fields
    *   uniqueValueInfos: [
    *     {
    *       value: "North, 1, medium",  // features in the "North" region, a rank of 1, and "medium" class
    *       symbol: sym1  // will be assigned sym1
    *     }, {
    *       value: "North, 2, medium",  // features in the "North" region, a rank of 2, and a "medium class
    *       symbol: sym2  // will be assigned sym2
    *     },
    *     ...
    *   ]
    * };
    * ```
    *
    * All combinations of values of [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field), [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2), and `field3` are unique values and
    * may have their own symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field3)
    */
  var field3: java.lang.String = js.native
  /**
    * String inserted between the values if multiple attribute fields are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#fieldDelimiter)
    */
  var fieldDelimiter: java.lang.String = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: UniqueValueRendererLegendOptions = js.native
  /**
    * The type of Renderer. For UniqueValueRenderer this value is always `unique-value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#type)
    */
  @JSName("type")
  val type_UniqueValueRenderer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`unique-value` = js.native
  /**
    * Each element in the array is an object that provides information about a unique value associated with the renderer. Each object has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos)
    */
  var uniqueValueInfos: js.Array[UniqueValueRendererUniqueValueInfos] = js.native
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string or a number. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.  This property is typically used as an alternative to [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) for data-driven visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression)
    */
  var valueExpression: java.lang.String = js.native
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) property. This is displayed as the title of the corresponding renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) in the absence of a provided `title` in the [legendOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#legendOptions) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: java.lang.String = js.native
  /**
    * Adds a unique value and symbol to the renderer. You can provide the value and its associated symbol as individual arguments or as an info object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#addUniqueValueInfo)
    *
    * @param valueOrInfo The value to match. The value can be provided as an individual argument or as an [info object described in uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos).
    * @param symbol The symbol used to represent features matching the specified `value`.
    *
    */
  def addUniqueValueInfo(valueOrInfo: java.lang.String): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: java.lang.String, symbol: Symbol): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: java.lang.String, symbol: SymbolProperties): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: js.Any): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: js.Any, symbol: Symbol): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: js.Any, symbol: SymbolProperties): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: scala.Double): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: scala.Double, symbol: Symbol): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: scala.Double, symbol: SymbolProperties): scala.Unit = js.native
  /**
    * Returns rendering and legend information (as defined by the renderer) associated with the given graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#getUniqueValueInfo)
    *
    * @param graphic The graphic whose rendering and legend information will be returned.
    *
    */
  def getUniqueValueInfo(graphic: Graphic): js.Any = js.native
  /**
    * Removes a unique value from the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#removeUniqueValueInfo)
    *
    * @param value Value to remove from [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos).
    *
    */
  def removeUniqueValueInfo(value: java.lang.String): scala.Unit = js.native
}

