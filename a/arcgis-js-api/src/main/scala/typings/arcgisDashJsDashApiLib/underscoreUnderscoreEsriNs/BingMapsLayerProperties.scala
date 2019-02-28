package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsLayerProperties extends BaseTileLayerProperties {
  /**
    * Provides culture specific map labels. For more information visit: https://msdn.microsoft.com/en-us/library/ff701709.aspx  For a list of supported culture codes please visit: https://msdn.microsoft.com/en-us/library/hh441729.aspx
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#culture)
    *
    * @default "en-US"
    */
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Bing Maps Key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#key)
    *
    * @default null
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This will alter Geopolitical disputed borders and labels to align with the specified user region.  For more information on Bing's region setting please visit: https://msdn.microsoft.com/en-us/library/ff701704.aspx  For a list of supported country codes please visit: see https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#region)
    *
    * @default null
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The three supported maps are: `road` | `aerial` | `hybrid`  For more information on Bing map styles please visit: https://msdn.microsoft.com/en-us/library/ff701716.aspx
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#style)
    *
    * @default "road"
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
}

