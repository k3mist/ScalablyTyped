package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.dashboardResource
  * @description Handles loading the dashboard manifest
  **/
trait IDashboardResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.dashboardResource#getDashboard
    * @methodOf umbraco.resources.dashboardResource
    *
    * @description
    * Retrieves the dashboard configuration for a given section
    *
    * @param {string} section Alias of section to retrieve dashboard configuraton for
    * @returns {Promise} resourcePromise object containing the user array.
    *
    */
  def getDashboard(section: java.lang.String): angularLib.angularMod.angularNs.IPromise[IResourcePromise]
}

object IDashboardResource {
  @scala.inline
  def apply(
    getDashboard: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[IResourcePromise]]
  ): IDashboardResource = {
    val __obj = js.Dynamic.literal(getDashboard = getDashboard)
  
    __obj.asInstanceOf[IDashboardResource]
  }
}

