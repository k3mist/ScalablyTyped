package typings
package swfobjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ie extends js.Object {
      // number or boolean
  var ie: scala.Boolean
  var mac: scala.Boolean
  var pv: js.Array[scala.Double]
  var w3: scala.Boolean
  var win: scala.Boolean
  var wk: js.Any
}

object Anon_Ie {
  @scala.inline
  def apply(
    ie: scala.Boolean,
    mac: scala.Boolean,
    pv: js.Array[scala.Double],
    w3: scala.Boolean,
    win: scala.Boolean,
    wk: js.Any
  ): Anon_Ie = {
    val __obj = js.Dynamic.literal(ie = ie, mac = mac, pv = pv, w3 = w3, win = win, wk = wk)
  
    __obj.asInstanceOf[Anon_Ie]
  }
}

