package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowManagerServiceInfo
  extends stdLib.Object {
  /**
    * An array of activity types in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var activityTypes: js.Array[ActivityType]
  /**
    * The configuration properties of the Workflow Manager system stored in the database table as key/value pairs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var configProperties: WorkflowManagerServiceInfoConfigProperties
  /**
    * The current software version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var currentVersion: scala.Double
  /**
    * An array of [data workspaces](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#DataWorkspace) in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var dataWorkspaces: js.Array[DataWorkspace]
  /**
    * An array of [hold types](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#HoldType) in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var holdTypes: js.Array[HoldType]
  /**
    * An array of [job priorities](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobPriority) in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var jobPriorities: js.Array[JobPriority]
  /**
    * An array of [job statuses](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobStatus) in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var jobStatuses: js.Array[JobStatus]
  /**
    * An array of [job types](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType) in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var jobTypes: js.Array[JobType]
  /**
    * An array of notification types in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var notificationTypes: js.Array[NotificationType]
  /**
    * An array of [privileges](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#Privilege) in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var privileges: js.Array[Privilege]
  /**
    * The array of [public queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryContainer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var publicQueries: js.Array[JobQueryContainer]
}

