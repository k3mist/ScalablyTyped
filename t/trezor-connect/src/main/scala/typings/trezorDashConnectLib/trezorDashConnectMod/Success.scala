package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success[T] extends ResponseMessage[T] {
  var id: scala.Double
  var payload: T
  var success: trezorDashConnectLib.trezorDashConnectLibNumbers.`true`
}

