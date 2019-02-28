package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBreaksRendererResult
  extends stdLib.Object {
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#ClassBreaksRendererResult)
    */
  var basemapId: java.lang.String
  /**
    * This object describes class breaks generated from data in a layer for a given field with a specified classification method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#ClassBreaksRendererResult)
    */
  var classBreaksResult: ClassBreaksResult
  /**
    * The color scheme used for the class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#ClassBreaksRendererResult)
    */
  var colorScheme: ColorScheme
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#ClassBreaksRendererResult)
    */
  var defaultValuesUsed: scala.Boolean
  /**
    * The renderer object configured to best match the given basemap and the spread of the data. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#ClassBreaksRendererResult)
    */
  var renderer: ClassBreaksRenderer
}

