package typings
package easyDashXapiDashSupertestLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hmac extends js.Object {
  def digest(): easyDashXapiDashSupertestLib.Buffer = js.native
  def digest(encoding: java.lang.String): js.Any = js.native
  @JSName("digest")
  def digest_buffer(encoding: easyDashXapiDashSupertestLib.easyDashXapiDashSupertestLibStrings.buffer): easyDashXapiDashSupertestLib.Buffer = js.native
  def update(data: js.Any): Hmac = js.native
  def update(data: js.Any, input_encoding: java.lang.String): Hmac = js.native
}

