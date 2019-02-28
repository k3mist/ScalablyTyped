package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSchemeForPolyline
  extends stdLib.Object
     with SizeScheme {
  /**
    * The color of the line symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var color: Color
  /**
    * The maximum width of a line symbol in pixels or points representing features with high data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var maxWidth: scala.Double
  /**
    * The minimum width of a line symbol in pixels or points representing features with low data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var minWidth: scala.Double
  /**
    * The color of the line symbol used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var noDataColor: Color
  /**
    * The width of the line symbol in pixels or points used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var noDataWidth: scala.Double
  /**
    * The opacity of the line symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var opacity: scala.Double
  /**
    * The default width of the line symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var width: scala.Double
}

