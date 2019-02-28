package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintTemplateExportOptions
  extends stdLib.Object {
  /**
    * Resolution in dots per inch. If modified when `layout = 'map-only'`, the `width` and `height` will also need to be modified proportional to the `dpi` change. Default value is 96.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#exportOptions)
    */
  var dpi: js.UndefOr[scala.Double] = js.undefined
  /**
    * Map height. Default value is 1100.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#exportOptions)
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Map width. Default value is 800.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#exportOptions)
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

