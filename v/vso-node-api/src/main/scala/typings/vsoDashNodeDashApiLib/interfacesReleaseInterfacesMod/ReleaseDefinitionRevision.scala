package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionRevision extends js.Object {
  /**
    * Gets api-version for revision object.
    */
  var apiVersion: java.lang.String
  /**
    * Gets type of change.
    */
  var changeType: AuditAction
  /**
    * Gets the identity who did change.
    */
  var changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets date on which it got changed.
    */
  var changedDate: stdLib.Date
  /**
    * Gets comments for revision.
    */
  var comment: java.lang.String
  /**
    * Get id of the definition.
    */
  var definitionId: scala.Double
  /**
    * Gets definition url.
    */
  var definitionUrl: java.lang.String
  /**
    * Get revision number of the definition.
    */
  var revision: scala.Double
}

object ReleaseDefinitionRevision {
  @scala.inline
  def apply(
    apiVersion: java.lang.String,
    changeType: AuditAction,
    changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    changedDate: stdLib.Date,
    comment: java.lang.String,
    definitionId: scala.Double,
    definitionUrl: java.lang.String,
    revision: scala.Double
  ): ReleaseDefinitionRevision = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, changeType = changeType, changedBy = changedBy, changedDate = changedDate, comment = comment, definitionId = definitionId, definitionUrl = definitionUrl, revision = revision)
  
    __obj.asInstanceOf[ReleaseDefinitionRevision]
  }
}

