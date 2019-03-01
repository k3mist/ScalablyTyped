package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPushSearchCriteria extends js.Object {
  var fromDate: stdLib.Date
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: scala.Boolean
  var includeRefUpdates: scala.Boolean
  var pusherId: java.lang.String
  var refName: java.lang.String
  var toDate: stdLib.Date
}

object GitPushSearchCriteria {
  @scala.inline
  def apply(
    fromDate: stdLib.Date,
    includeLinks: scala.Boolean,
    includeRefUpdates: scala.Boolean,
    pusherId: java.lang.String,
    refName: java.lang.String,
    toDate: stdLib.Date
  ): GitPushSearchCriteria = {
    val __obj = js.Dynamic.literal(fromDate = fromDate, includeLinks = includeLinks, includeRefUpdates = includeRefUpdates, pusherId = pusherId, refName = refName, toDate = toDate)
  
    __obj.asInstanceOf[GitPushSearchCriteria]
  }
}

