package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reconnectDashCoreLib {
  type ConnectFunction[ArgType, ConnectionType] = js.ThisFunction1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify reconnect.Instance<ArgType, ConnectionType> */ /* this */ js.Any, 
    /* opts */ ArgType, 
    ConnectionType
  ]
}
