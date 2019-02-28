package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeRuleMatch
  extends stdLib.Object {
  /**
    * The time the change occurred to the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var changeTime: stdLib.Date
  /**
    * The type of change that happened to the data.  **Possible Values:** add | modify | delete | all
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var changeType: java.lang.String
  /**
    * The unique id of the data workspace containing the changed data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var dataWorkspaceId: java.lang.String
  /**
    * The dataset that changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var dataset: java.lang.String
  /**
    * The unique id of the associated to the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var id: java.lang.String
  /**
    * The unique id of the job where the change was made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var jobID: java.lang.String
  /**
    * The unique id of the change rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var ruleID: java.lang.String
}

