package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteInfo extends js.Object {
  /** the IP address of the remote server */
  var ip: java.lang.String
  /** the port used to connect to the remote server */
  var port: scala.Double
}

object RemoteInfo {
  @scala.inline
  def apply(ip: java.lang.String, port: scala.Double): RemoteInfo = {
    val __obj = js.Dynamic.literal(ip = ip, port = port)
  
    __obj.asInstanceOf[RemoteInfo]
  }
}

