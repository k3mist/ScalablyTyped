package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaProperties extends ContentElementContentElementProperties {
  /**
    * Contains the media elements representing images or charts to display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). This can be an individual chart or image element, or an array containing a combination of any of these types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media.html#mediaInfos)
    */
  var mediaInfos: js.UndefOr[
    BarChartProperties | ColumnChartProperties | ImageProperties | LineChartProperties | PieChartProperties | js.Array[_]
  ] = js.undefined
}

