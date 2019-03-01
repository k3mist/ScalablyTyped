package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncRefOperationCommitLevelEventNotification extends AsyncGitOperationNotification {
  var commitId: java.lang.String
}

object AsyncRefOperationCommitLevelEventNotification {
  @scala.inline
  def apply(commitId: java.lang.String, operationId: scala.Double): AsyncRefOperationCommitLevelEventNotification = {
    val __obj = js.Dynamic.literal(commitId = commitId, operationId = operationId)
  
    __obj.asInstanceOf[AsyncRefOperationCommitLevelEventNotification]
  }
}

