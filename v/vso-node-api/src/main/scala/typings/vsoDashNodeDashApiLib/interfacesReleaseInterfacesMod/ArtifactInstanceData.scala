package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactInstanceData extends js.Object {
  var accountName: java.lang.String
  var authenticationToken: java.lang.String
  var tfsUrl: java.lang.String
  var version: java.lang.String
}

object ArtifactInstanceData {
  @scala.inline
  def apply(
    accountName: java.lang.String,
    authenticationToken: java.lang.String,
    tfsUrl: java.lang.String,
    version: java.lang.String
  ): ArtifactInstanceData = {
    val __obj = js.Dynamic.literal(accountName = accountName, authenticationToken = authenticationToken, tfsUrl = tfsUrl, version = version)
  
    __obj.asInstanceOf[ArtifactInstanceData]
  }
}

