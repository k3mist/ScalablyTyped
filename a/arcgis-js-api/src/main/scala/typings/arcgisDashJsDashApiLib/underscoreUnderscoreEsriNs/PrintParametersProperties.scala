package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintParametersProperties extends js.Object {
  /**
    * Additional parameters for the print service. When an arcpy script is published as a custom print service there may be additional parameters associated with the print service. To determine the extra parameters visit the ArcGIS REST Services Directory page for the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#extraParameters)
    */
  var extraParameters: js.UndefOr[js.Any] = js.undefined
  /**
    * Specify the output spatial reference for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * Defines the layout template used for the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#template)
    */
  var template: js.UndefOr[PrintTemplateProperties] = js.undefined
  /**
    * The view to print.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

