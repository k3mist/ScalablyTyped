package typings
package applicationinsightsLib.outDeclarationsContractsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Declarations/Contracts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def baseTypeToTelemetryType(baseType: java.lang.String): applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType = js.native
  def domainSupportsProperties(domain: applicationinsightsLib.outDeclarationsContractsGeneratedMod.Domain): /* is applicationinsights.applicationinsights/out/Declarations/Contracts/Constants.ISupportProperties */ scala.Boolean = js.native
  def telemetryTypeToBaseType(
    `type`: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  ): java.lang.String = js.native
}

