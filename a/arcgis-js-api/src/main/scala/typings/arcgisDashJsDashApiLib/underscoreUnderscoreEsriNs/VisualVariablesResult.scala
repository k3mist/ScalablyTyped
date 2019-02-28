package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualVariablesResult
  extends stdLib.Object {
  /**
    * Authoring information related to the creation of the visual variables. This includes inforamation related to UI inputs from sliders and selected themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var authoringInfo: AuthoringInfo
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var basemapId: java.lang.String
  /**
    * Object containing visual variable and scheme information for the color portion of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var color: VisualVariablesResultColor
  /**
    * Indicates whether default values were used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var defaultValuesUsed: scala.Boolean
  /**
    * Object containing visual variable and scheme information for the size portion of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var size: VisualVariablesResultSize
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var statistics: SummaryStatisticsResult
}

