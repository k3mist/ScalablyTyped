package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISocketErrorStatics extends js.Object {
  def getStatus(hresult: scala.Double): SocketErrorStatus
}

object ISocketErrorStatics {
  @scala.inline
  def apply(getStatus: js.Function1[scala.Double, SocketErrorStatus]): ISocketErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = getStatus)
  
    __obj.asInstanceOf[ISocketErrorStatics]
  }
}

