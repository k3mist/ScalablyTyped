package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidateDictionary extends RTCIceGatherCandidate {
  var foundation: js.UndefOr[java.lang.String] = js.undefined
  var ip: js.UndefOr[java.lang.String] = js.undefined
  var msMTurnSessionId: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[RTCIceProtocol] = js.undefined
  var relatedAddress: js.UndefOr[java.lang.String] = js.undefined
  var relatedPort: js.UndefOr[scala.Double] = js.undefined
  var tcpType: js.UndefOr[RTCIceTcpCandidateType] = js.undefined
  var `type`: js.UndefOr[RTCIceCandidateType] = js.undefined
}

object RTCIceCandidateDictionary {
  @scala.inline
  def apply(
    foundation: java.lang.String = null,
    ip: java.lang.String = null,
    msMTurnSessionId: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    priority: scala.Int | scala.Double = null,
    protocol: RTCIceProtocol = null,
    relatedAddress: java.lang.String = null,
    relatedPort: scala.Int | scala.Double = null,
    tcpType: RTCIceTcpCandidateType = null,
    `type`: RTCIceCandidateType = null
  ): RTCIceCandidateDictionary = {
    val __obj = js.Dynamic.literal()
    if (foundation != null) __obj.updateDynamic("foundation")(foundation)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (msMTurnSessionId != null) __obj.updateDynamic("msMTurnSessionId")(msMTurnSessionId)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (relatedAddress != null) __obj.updateDynamic("relatedAddress")(relatedAddress)
    if (relatedPort != null) __obj.updateDynamic("relatedPort")(relatedPort.asInstanceOf[js.Any])
    if (tcpType != null) __obj.updateDynamic("tcpType")(tcpType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RTCIceCandidateDictionary]
  }
}

