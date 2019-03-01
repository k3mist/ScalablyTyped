package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignalNotifier extends js.Object {
  def enable(): scala.Unit
  def terminate(): scala.Unit
}

object ISignalNotifier {
  @scala.inline
  def apply(enable: js.Function0[scala.Unit], terminate: js.Function0[scala.Unit]): ISignalNotifier = {
    val __obj = js.Dynamic.literal(enable = enable, terminate = terminate)
  
    __obj.asInstanceOf[ISignalNotifier]
  }
}

