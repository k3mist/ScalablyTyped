package typings
package inversifyDashLoggerDashMiddlewareLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetLoggerSettings extends js.Object {
  var metadata: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[scala.Boolean] = js.undefined
  var serviceIdentifier: js.UndefOr[scala.Boolean] = js.undefined
}

object TargetLoggerSettings {
  @scala.inline
  def apply(
    metadata: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    serviceIdentifier: js.UndefOr[scala.Boolean] = js.undefined
  ): TargetLoggerSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(serviceIdentifier)) __obj.updateDynamic("serviceIdentifier")(serviceIdentifier)
    __obj.asInstanceOf[TargetLoggerSettings]
  }
}

