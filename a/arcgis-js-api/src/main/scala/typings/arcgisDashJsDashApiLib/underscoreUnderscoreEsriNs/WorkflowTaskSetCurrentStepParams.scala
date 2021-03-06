package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskSetCurrentStepParams
  extends stdLib.Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#setCurrentStep)
    */
  var jobId: scala.Double
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#setCurrentStep)
    */
  var stepId: scala.Double
  /**
    * The user name of the user setting the current step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#setCurrentStep)
    */
  var user: java.lang.String
}

object WorkflowTaskSetCurrentStepParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    jobId: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    stepId: scala.Double,
    user: java.lang.String
  ): WorkflowTaskSetCurrentStepParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stepId = stepId, user = user)
  
    __obj.asInstanceOf[WorkflowTaskSetCurrentStepParams]
  }
}

