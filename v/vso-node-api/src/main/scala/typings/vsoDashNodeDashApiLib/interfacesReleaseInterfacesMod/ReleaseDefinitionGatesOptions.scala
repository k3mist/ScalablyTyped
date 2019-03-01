package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionGatesOptions extends js.Object {
  var isEnabled: scala.Boolean
  var samplingInterval: scala.Double
  var stabilizationTime: scala.Double
  var timeout: scala.Double
}

object ReleaseDefinitionGatesOptions {
  @scala.inline
  def apply(
    isEnabled: scala.Boolean,
    samplingInterval: scala.Double,
    stabilizationTime: scala.Double,
    timeout: scala.Double
  ): ReleaseDefinitionGatesOptions = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled, samplingInterval = samplingInterval, stabilizationTime = stabilizationTime, timeout = timeout)
  
    __obj.asInstanceOf[ReleaseDefinitionGatesOptions]
  }
}

