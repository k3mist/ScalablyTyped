package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageServiceIdentifyResult
  extends Accessor
     with JSONSupport {
  /**
    * The set of visible areas for the identified catalog items. `CatalogItemVisibilities` are returned only when the image service source is a mosaic dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#catalogItemVisibilities)
    */
  var catalogItemVisibilities: js.Array[scala.Double] = js.native
  /**
    * The set of catalog items that overlap the input geometry. Catalog Items are returned only when the image service source is a mosaic dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#catalogItems)
    */
  var catalogItems: FeatureSet = js.native
  /**
    * The identified location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#location)
    */
  var location: Point = js.native
  /**
    * The identify property name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#name)
    */
  var name: java.lang.String = js.native
  /**
    * The identify property id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#objectId)
    */
  var objectId: scala.Double = js.native
  /**
    * The attributes of the identified object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#properties)
    */
  var properties: js.Any = js.native
  /**
    * The identify property pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#value)
    */
  var value: java.lang.String = js.native
}

