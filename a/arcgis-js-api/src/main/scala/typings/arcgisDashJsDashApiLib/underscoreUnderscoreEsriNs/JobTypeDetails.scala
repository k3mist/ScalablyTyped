package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTypeDetails
  extends stdLib.Object {
  /**
    * Indicates whether jobs of this type will have their workflows automatically executed, when created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var autoExecuteCreatedJobs: scala.Boolean
  /**
    * Indicates whether jobs of this type allows users to modify the current data workspace in the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var canDataWorkspaceChange: scala.Boolean
  /**
    * The category of the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var category: java.lang.String
  /**
    * The name of the user or group that the job will be assigned to by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultAssignedTo: java.lang.String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned by default.  **Possible Values:** unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultAssignedType: java.lang.String
  /**
    * The unique id of the default data workspace of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultDataWorkspaceId: java.lang.String
  /**
    * The description that gets associated with the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultDescription: java.lang.String
  /**
    * The default due date of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultDueDate: java.lang.String
  /**
    * The duration for completing the job assigned by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultJobDuration: scala.Double
  /**
    * The name of the geodatabase version that will be assigned the parent version of the job's geodatabase by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultParentVersionName: java.lang.String
  /**
    * The numeric priority value assigned to the job by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultPriority: java.lang.String
  /**
    * The default start date of this job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultStartDate: stdLib.Date
  /**
    * The description of the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var description: java.lang.String
  /**
    * The unique id automatically generated for this job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var id: java.lang.String
  /**
    * The naming scheme for this job type, which would serve as template for the name of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var jobNamingScheme: java.lang.String
  /**
    * The naming scheme for this job type, which would serve as template for the name of job's version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var jobVersionNamingScheme: java.lang.String
  /**
    * The naming scheme for this job type, which would serve as template for the name of job's map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var mxdNamingScheme: java.lang.String
  /**
    * The job type name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var name: java.lang.String
  /**
    * The state of the job type.  **Possible Values:** draft | active | retired
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var state: java.lang.String
}

