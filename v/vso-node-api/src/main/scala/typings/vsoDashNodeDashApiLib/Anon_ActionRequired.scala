package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionRequired extends js.Object {
  var actionRequired: scala.Double
  var actionResolved: scala.Double
  var disabled: scala.Double
  var enabled: scala.Double
  var installed: scala.Double
  var uninstalled: scala.Double
  var versionUpdated: scala.Double
}

object Anon_ActionRequired {
  @scala.inline
  def apply(
    actionRequired: scala.Double,
    actionResolved: scala.Double,
    disabled: scala.Double,
    enabled: scala.Double,
    installed: scala.Double,
    uninstalled: scala.Double,
    versionUpdated: scala.Double
  ): Anon_ActionRequired = {
    val __obj = js.Dynamic.literal(actionRequired = actionRequired, actionResolved = actionResolved, disabled = disabled, enabled = enabled, installed = installed, uninstalled = uninstalled, versionUpdated = versionUpdated)
  
    __obj.asInstanceOf[Anon_ActionRequired]
  }
}

