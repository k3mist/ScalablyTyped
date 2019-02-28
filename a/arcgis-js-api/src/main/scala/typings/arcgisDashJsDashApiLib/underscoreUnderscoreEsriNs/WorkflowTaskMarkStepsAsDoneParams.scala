package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskMarkStepsAsDoneParams
  extends stdLib.Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#markStepsAsDone)
    */
  var jobId: scala.Double
  /**
    * The array of unique step Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#markStepsAsDone)
    */
  var stepIds: js.Array[scala.Double]
  /**
    * The user name of the user marking the step complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#markStepsAsDone)
    */
  var user: java.lang.String
}

