package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectTcpipChannelInfo extends ChannelOpenInfo {
  var data: TcpipChannelData
  var packetSize: scala.Double
  var sender: scala.Double
  var `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`direct-tcpip`
  var window: scala.Double
}

object DirectTcpipChannelInfo {
  @scala.inline
  def apply(
    data: TcpipChannelData,
    packetSize: scala.Double,
    sender: scala.Double,
    `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`direct-tcpip`,
    window: scala.Double
  ): DirectTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data, packetSize = packetSize, sender = sender, `type` = `type`, window = window)
  
    __obj.asInstanceOf[DirectTcpipChannelInfo]
  }
}

