package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterDataProperties extends js.Object {
  /**
    * Specifies the format of the raster data, such as "jpg", "tif", etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#format)
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the uploaded file returned as a result of the upload operation. For ArcGIS Server 10.1 and greater, this class can be used to specify an uploaded item as input by specifying the ItemID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#itemId)
    */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL to the location of the raster data file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#url)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RasterDataProperties {
  @scala.inline
  def apply(format: java.lang.String = null, itemId: java.lang.String = null, url: java.lang.String = null): RasterDataProperties = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RasterDataProperties]
  }
}

