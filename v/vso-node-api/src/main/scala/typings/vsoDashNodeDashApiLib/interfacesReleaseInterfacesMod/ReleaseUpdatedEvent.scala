package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseUpdatedEvent extends RealtimeReleaseEvent {
  var release: Release
}

object ReleaseUpdatedEvent {
  @scala.inline
  def apply(projectId: java.lang.String, release: Release, releaseId: scala.Double): ReleaseUpdatedEvent = {
    val __obj = js.Dynamic.literal(projectId = projectId, release = release, releaseId = releaseId)
  
    __obj.asInstanceOf[ReleaseUpdatedEvent]
  }
}

