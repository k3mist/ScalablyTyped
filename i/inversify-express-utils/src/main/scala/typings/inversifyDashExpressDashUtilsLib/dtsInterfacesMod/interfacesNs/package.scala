package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesNs {
  type ConfigFunction = js.Function1[/* app */ expressLib.expressMod.eNs.Application, scala.Unit]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ js.Any, scala.Unit]
  type Middleware = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify inversifyInterfaces.ServiceIdentifier<any> */ js.Any) | expressLib.expressMod.eNs.RequestHandler
}
