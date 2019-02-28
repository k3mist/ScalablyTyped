package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait typeRendererResult
  extends stdLib.Object {
  /**
    * The ID of the basemap used to determine the optimal color scheme to represent the categorical variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var basemapId: java.lang.String
  /**
    * An array of objects describing the values or categories excluded from consideration in visualizing data from the given field. The specification of each object matches that of the objects specified in the `uniqueValueInfos` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var excludedUniqueValueInfos: js.Array[_]
  /**
    * The renderer object configured to best match the given basemap. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var renderer: UniqueValueRenderer
  /**
    * The scheme used to represent each category within the `uniqueValueInfos`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var typeScheme: TypeScheme
  /**
    * An array of objects describing the value, symbol, and count of each unique type or category represented in the renderer. See the table below describing each property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var uniqueValueInfos: js.Array[UniqueValueInfo]
}

