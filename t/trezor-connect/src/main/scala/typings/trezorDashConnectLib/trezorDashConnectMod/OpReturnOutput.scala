package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpReturnOutput extends Output {
  var dataHex: java.lang.String
  var `type`: trezorDashConnectLib.trezorDashConnectLibStrings.opreturn
}

object OpReturnOutput {
  @scala.inline
  def apply(dataHex: java.lang.String, `type`: trezorDashConnectLib.trezorDashConnectLibStrings.opreturn): OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex, `type` = `type`)
  
    __obj.asInstanceOf[OpReturnOutput]
  }
}

