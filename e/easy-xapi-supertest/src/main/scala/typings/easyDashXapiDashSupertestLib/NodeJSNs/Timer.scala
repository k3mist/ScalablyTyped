package typings
package easyDashXapiDashSupertestLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def ref(): scala.Unit
  def unref(): scala.Unit
}

object Timer {
  @scala.inline
  def apply(ref: js.Function0[scala.Unit], unref: js.Function0[scala.Unit]): Timer = {
    val __obj = js.Dynamic.literal(ref = ref, unref = unref)
  
    __obj.asInstanceOf[Timer]
  }
}

