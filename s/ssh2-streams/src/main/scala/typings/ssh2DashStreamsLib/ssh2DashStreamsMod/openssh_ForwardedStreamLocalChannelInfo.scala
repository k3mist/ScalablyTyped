package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_ForwardedStreamLocalChannelInfo extends ChannelOpenInfo {
  var data: SocketChannelData
  var packetSize: scala.Double
  var sender: scala.Double
  var `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`forwarded-streamlocal@opensshDOTcom`
  var window: scala.Double
}

object openssh_ForwardedStreamLocalChannelInfo {
  @scala.inline
  def apply(
    data: SocketChannelData,
    packetSize: scala.Double,
    sender: scala.Double,
    `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`forwarded-streamlocal@opensshDOTcom`,
    window: scala.Double
  ): openssh_ForwardedStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data, packetSize = packetSize, sender = sender, `type` = `type`, window = window)
  
    __obj.asInstanceOf[openssh_ForwardedStreamLocalChannelInfo]
  }
}

