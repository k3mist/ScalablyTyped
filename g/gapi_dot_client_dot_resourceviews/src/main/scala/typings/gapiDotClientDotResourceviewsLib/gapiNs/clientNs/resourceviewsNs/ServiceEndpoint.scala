package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpoint extends js.Object {
  /** The name of the service endpoint. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The port of the service endpoint. */
  var port: js.UndefOr[scala.Double] = js.undefined
}

object ServiceEndpoint {
  @scala.inline
  def apply(name: java.lang.String = null, port: scala.Int | scala.Double = null): ServiceEndpoint = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpoint]
  }
}

