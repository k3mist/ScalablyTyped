package typings
package easyDashXapiDashSupertestLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dgram", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSocket(`type`: java.lang.String): Socket = js.native
  def createSocket(
    `type`: java.lang.String,
    callback: js.Function2[/* msg */ easyDashXapiDashSupertestLib.Buffer, /* rinfo */ RemoteInfo, scala.Unit]
  ): Socket = js.native
}

