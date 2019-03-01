package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeadersReceivedDetails extends js.Object {
  var id: scala.Double
  var method: java.lang.String
  var resourceType: java.lang.String
  var responseHeaders: ResponseHeaders
  var statusCode: scala.Double
  var statusLine: java.lang.String
  var timestamp: scala.Double
  var url: java.lang.String
  var webContentsId: js.UndefOr[scala.Double] = js.undefined
}

object OnHeadersReceivedDetails {
  @scala.inline
  def apply(
    id: scala.Double,
    method: java.lang.String,
    resourceType: java.lang.String,
    responseHeaders: ResponseHeaders,
    statusCode: scala.Double,
    statusLine: java.lang.String,
    timestamp: scala.Double,
    url: java.lang.String,
    webContentsId: scala.Int | scala.Double = null
  ): OnHeadersReceivedDetails = {
    val __obj = js.Dynamic.literal(id = id, method = method, resourceType = resourceType, responseHeaders = responseHeaders, statusCode = statusCode, statusLine = statusLine, timestamp = timestamp, url = url)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeadersReceivedDetails]
  }
}

