package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionInfo
  extends stdLib.Object {
  /**
    * The level of access to the geodatabase version.  **Possible Values:** esriVersionAccessPrivate | esriVersionAccessPublic | esriVersionAccessProtected
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#VersionInfo)
    */
  var access: java.lang.String
  /**
    * The name of the geodatabase version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#VersionInfo)
    */
  var name: java.lang.String
  /**
    * The name of the parent version of the geodatabase.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#VersionInfo)
    */
  var parent: java.lang.String
}

