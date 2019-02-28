package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDependency
  extends stdLib.Object {
  /**
    * The unique id of the job on which the current job depends.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var depJobId: scala.Double
  /**
    * Indicates whether the job is dependent on a step, stage or status of the other job.  **Possible Values:** step | stage | status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var depOnType: java.lang.String
  /**
    * The value of the step, stage or status of the other job on which the current job is dependent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var depOnValue: java.lang.String
  /**
    * The value of the step, stage or status at which the current job will be held.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var heldOnValue: scala.Double
  /**
    * Indicates whether the job is held at a step, stage or status.  **Possible Values:** step | stage | status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var holdOnType: java.lang.String
  /**
    * The unique id of the dependency.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var id: scala.Double
  /**
    * The unique id of the job on which the dependency exists.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var jobID: java.lang.String
}

