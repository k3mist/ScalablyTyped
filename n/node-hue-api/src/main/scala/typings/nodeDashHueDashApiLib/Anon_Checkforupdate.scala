package typings
package nodeDashHueDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checkforupdate extends js.Object {
  var checkforupdate: scala.Boolean
  var devicetypes: Anon_Bridge
  @JSName("notify")
  var notify_FAnon_Checkforupdate: scala.Boolean
  var text: java.lang.String
  var updatestate: scala.Double
  var url: java.lang.String
}

object Anon_Checkforupdate {
  @scala.inline
  def apply(
    checkforupdate: scala.Boolean,
    devicetypes: Anon_Bridge,
    notify: scala.Boolean,
    text: java.lang.String,
    updatestate: scala.Double,
    url: java.lang.String
  ): Anon_Checkforupdate = {
    val __obj = js.Dynamic.literal(checkforupdate = checkforupdate, devicetypes = devicetypes, notify = notify, text = text, updatestate = updatestate, url = url)
  
    __obj.asInstanceOf[Anon_Checkforupdate]
  }
}

