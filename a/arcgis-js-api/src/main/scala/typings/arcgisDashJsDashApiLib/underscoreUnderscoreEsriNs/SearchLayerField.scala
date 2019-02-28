package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchLayerField extends Accessor {
  /**
    * Whether or not the field is an exact match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-SearchLayerField.html#exactMatch)
    */
  var exactMatch: scala.Boolean = js.native
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-SearchLayerField.html#name)
    */
  var name: java.lang.String = js.native
  /**
    * The data type of the field.  **Possible Values:** small-integer | integer | single | double | long | string | date | oid | geometry | blob | raster | guid | global-id | xml
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-SearchLayerField.html#type)
    */
  var `type`: java.lang.String = js.native
}

