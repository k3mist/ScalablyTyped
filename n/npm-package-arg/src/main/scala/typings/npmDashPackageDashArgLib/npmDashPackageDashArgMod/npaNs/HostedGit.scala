package typings
package npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedGit extends js.Object {
  var domain: java.lang.String
  var project: java.lang.String
  var `type`: java.lang.String
  var user: java.lang.String
}

object HostedGit {
  @scala.inline
  def apply(
    domain: java.lang.String,
    project: java.lang.String,
    `type`: java.lang.String,
    user: java.lang.String
  ): HostedGit = {
    val __obj = js.Dynamic.literal(domain = domain, project = project, `type` = `type`, user = user)
  
    __obj.asInstanceOf[HostedGit]
  }
}

