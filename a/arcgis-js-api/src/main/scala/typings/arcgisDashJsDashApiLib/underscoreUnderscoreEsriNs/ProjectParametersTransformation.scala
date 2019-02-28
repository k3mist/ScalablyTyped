package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectParametersTransformation
  extends stdLib.Object {
  /**
    * The well-known ID of the datum transformation to apply to the projection. [List of valid IDs for Datum transformations](https://developers.arcgis.com/rest/services-reference/datum-transformations.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformation)
    */
  var wkid: js.UndefOr[scala.Double] = js.undefined
  /**
    * The well-known text that defines a spatial reference. Many browsers have a limit to the length of a GET request of approximately 2048 characters. When using well-known text to specify the spatial reference you can easily exceed this limit. In these cases, you will need to [setup and use a proxy page](https://developers.arcgis.com/javascript/latest/guide/proxies/index.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformation)
    */
  var wkt: js.UndefOr[java.lang.String] = js.undefined
}

