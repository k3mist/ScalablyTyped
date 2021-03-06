package typings
package reconnectDashCoreLib.reconnectDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reconnectNs {
  // TODO: Once DT supports TS 3.0, use new Generic Rest Parameter feature for
  // ArgType.  Current definitions only support one parameter passed to
  // connect() but the library actually allows any number of args.
  type CustomModule[ArgType, ConnectionType] = js.Function2[
    /* opts */ js.UndefOr[ModuleOptions[ConnectionType]], 
    /* cb */ js.UndefOr[js.Function1[/* con */ ConnectionType, scala.Unit]], 
    Instance[ArgType, ConnectionType]
  ]
}
