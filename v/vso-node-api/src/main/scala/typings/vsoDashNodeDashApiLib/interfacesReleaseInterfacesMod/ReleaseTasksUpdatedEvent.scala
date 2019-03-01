package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTasksUpdatedEvent extends RealtimeReleaseEvent {
  var environmentId: scala.Double
  var job: ReleaseTask
  var releaseDeployPhaseId: scala.Double
  var releaseStepId: scala.Double
  var tasks: js.Array[ReleaseTask]
}

object ReleaseTasksUpdatedEvent {
  @scala.inline
  def apply(
    environmentId: scala.Double,
    job: ReleaseTask,
    projectId: java.lang.String,
    releaseDeployPhaseId: scala.Double,
    releaseId: scala.Double,
    releaseStepId: scala.Double,
    tasks: js.Array[ReleaseTask]
  ): ReleaseTasksUpdatedEvent = {
    val __obj = js.Dynamic.literal(environmentId = environmentId, job = job, projectId = projectId, releaseDeployPhaseId = releaseDeployPhaseId, releaseId = releaseId, releaseStepId = releaseStepId, tasks = tasks)
  
    __obj.asInstanceOf[ReleaseTasksUpdatedEvent]
  }
}

