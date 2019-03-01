package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationSchemeForPolygon
  extends stdLib.Object
     with LocationScheme {
  /**
    * The color of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForPolygon)
    */
  var color: Color
  /**
    * The opacity of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForPolygon)
    */
  var opacity: scala.Double
  /**
    * Properties for defining the outline of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForPolygon)
    */
  var outline: LocationSchemeForPolygonOutline
}

object LocationSchemeForPolygon {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    opacity: scala.Double,
    outline: LocationSchemeForPolygonOutline,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): LocationSchemeForPolygon = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = hasOwnProperty, opacity = opacity, outline = outline, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[LocationSchemeForPolygon]
  }
}

