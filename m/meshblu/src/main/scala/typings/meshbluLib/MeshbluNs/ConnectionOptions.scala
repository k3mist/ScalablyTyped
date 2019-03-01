package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Contains the primary means of identifying a device.
	 */
trait ConnectionOptions extends js.Object {
  var token: java.lang.String
  var uuid: java.lang.String
}

object ConnectionOptions {
  @scala.inline
  def apply(token: java.lang.String, uuid: java.lang.String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(token = token, uuid = uuid)
  
    __obj.asInstanceOf[ConnectionOptions]
  }
}

