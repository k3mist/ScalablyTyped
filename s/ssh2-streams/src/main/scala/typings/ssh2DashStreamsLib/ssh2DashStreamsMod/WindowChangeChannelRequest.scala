package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowChangeChannelRequest extends ChannelRequest {
  var cols: scala.Double
  var height: scala.Double
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`window-change`
  var rows: scala.Double
  var width: scala.Double
}

object WindowChangeChannelRequest {
  @scala.inline
  def apply(
    cols: scala.Double,
    height: scala.Double,
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`window-change`,
    rows: scala.Double,
    width: scala.Double
  ): WindowChangeChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols, height = height, recipient = recipient, request = request, rows = rows, width = width)
  
    __obj.asInstanceOf[WindowChangeChannelRequest]
  }
}

