package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol2D3D because Already inherited- arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Symbol2D3D because Already inherited */ @js.native
trait SimpleMarkerSymbol
  extends MarkerSymbol
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.MarkerSymbol
     with Symbol2D
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol2D
     with symbolsMarkerSymbol {
  /**
    * The outline of the marker symbol. The `color` property of this object directly modifies the overall color of marker symbols defined with the `cross` or `x` [style](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#style).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#outline)
    */
  var outline: SimpleLineSymbol = js.native
  /**
    * The SVG path of the icon.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#path)
    */
  var path: java.lang.String = js.native
  /**
    * The size of the marker in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#size)
    *
    * @default 12
    */
  var size: scala.Double = js.native
  /**
    * The marker style. Possible values are in the table below.
    * > **Known Limitations**  The `triangle` value is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * Value | Description
    * ------|------------
    * circle | ![sms_circle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-circle.png)
    * cross | ![sms_cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-cross.png)
    * diamond | ![sms_diamond](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-diamond.png)
    * square | ![sms_square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-square.png)
    * triangle | ![sms_triangle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-triangle.png)
    * x | ![sms_x](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-x.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#style)
    *
    * @default circle
    */
  var style: java.lang.String = js.native
  /**
    * For SimpleMarkerSymbol the type is always `simple-marker`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#type)
    */
  @JSName("type")
  val type_SimpleMarkerSymbol: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`simple-marker` = js.native
}

