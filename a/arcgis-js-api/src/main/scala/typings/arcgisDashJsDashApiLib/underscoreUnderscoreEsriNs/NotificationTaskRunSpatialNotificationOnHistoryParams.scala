package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskRunSpatialNotificationOnHistoryParams
  extends stdLib.Object {
  /**
    * The unique id of the dataWorkspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var dataWorkspaceId: java.lang.String
  /**
    * The starting time to query for new changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var from: stdLib.Date
  /**
    * Indicates whether to keep the matches found, stored in the ArcGIS Workflow Manager repository. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var logMatches: scala.Boolean
  /**
    * Indicates whether to the send notifications at the time matches are found. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var send: scala.Boolean
  /**
    * The ending time to query for new changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var to: stdLib.Date
  /**
    * The username requesting the execution of the rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var user: java.lang.String
}

