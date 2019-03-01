package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseRevision extends js.Object {
  var changeDetails: java.lang.String
  var changeType: java.lang.String
  var changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var changedDate: stdLib.Date
  var comment: java.lang.String
  var definitionSnapshotRevision: scala.Double
  var releaseId: scala.Double
}

object ReleaseRevision {
  @scala.inline
  def apply(
    changeDetails: java.lang.String,
    changeType: java.lang.String,
    changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    changedDate: stdLib.Date,
    comment: java.lang.String,
    definitionSnapshotRevision: scala.Double,
    releaseId: scala.Double
  ): ReleaseRevision = {
    val __obj = js.Dynamic.literal(changeDetails = changeDetails, changeType = changeType, changedBy = changedBy, changedDate = changedDate, comment = comment, definitionSnapshotRevision = definitionSnapshotRevision, releaseId = releaseId)
  
    __obj.asInstanceOf[ReleaseRevision]
  }
}

