package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCInboundRTPStreamStats extends RTCRTPStreamStats {
  var bytesReceived: js.UndefOr[scala.Double] = js.undefined
  var fractionLost: js.UndefOr[scala.Double] = js.undefined
  var jitter: js.UndefOr[scala.Double] = js.undefined
  var packetsLost: js.UndefOr[scala.Double] = js.undefined
  var packetsReceived: js.UndefOr[scala.Double] = js.undefined
}

object RTCInboundRTPStreamStats {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: scala.Double,
    `type`: RTCStatsType,
    associateStatsId: java.lang.String = null,
    bytesReceived: scala.Int | scala.Double = null,
    codecId: java.lang.String = null,
    firCount: scala.Int | scala.Double = null,
    fractionLost: scala.Int | scala.Double = null,
    isRemote: js.UndefOr[scala.Boolean] = js.undefined,
    jitter: scala.Int | scala.Double = null,
    mediaTrackId: java.lang.String = null,
    mediaType: java.lang.String = null,
    nackCount: scala.Int | scala.Double = null,
    packetsLost: scala.Int | scala.Double = null,
    packetsReceived: scala.Int | scala.Double = null,
    pliCount: scala.Int | scala.Double = null,
    sliCount: scala.Int | scala.Double = null,
    ssrc: java.lang.String = null,
    transportId: java.lang.String = null
  ): RTCInboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id, timestamp = timestamp, `type` = `type`)
    if (associateStatsId != null) __obj.updateDynamic("associateStatsId")(associateStatsId)
    if (bytesReceived != null) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (codecId != null) __obj.updateDynamic("codecId")(codecId)
    if (firCount != null) __obj.updateDynamic("firCount")(firCount.asInstanceOf[js.Any])
    if (fractionLost != null) __obj.updateDynamic("fractionLost")(fractionLost.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemote)) __obj.updateDynamic("isRemote")(isRemote)
    if (jitter != null) __obj.updateDynamic("jitter")(jitter.asInstanceOf[js.Any])
    if (mediaTrackId != null) __obj.updateDynamic("mediaTrackId")(mediaTrackId)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    if (nackCount != null) __obj.updateDynamic("nackCount")(nackCount.asInstanceOf[js.Any])
    if (packetsLost != null) __obj.updateDynamic("packetsLost")(packetsLost.asInstanceOf[js.Any])
    if (packetsReceived != null) __obj.updateDynamic("packetsReceived")(packetsReceived.asInstanceOf[js.Any])
    if (pliCount != null) __obj.updateDynamic("pliCount")(pliCount.asInstanceOf[js.Any])
    if (sliCount != null) __obj.updateDynamic("sliCount")(sliCount.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc)
    if (transportId != null) __obj.updateDynamic("transportId")(transportId)
    __obj.asInstanceOf[RTCInboundRTPStreamStats]
  }
}

