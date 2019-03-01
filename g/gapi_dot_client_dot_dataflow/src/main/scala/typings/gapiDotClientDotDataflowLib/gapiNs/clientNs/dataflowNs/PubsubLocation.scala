package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubsubLocation extends js.Object {
  /** Indicates whether the pipeline allows late-arriving data. */
  var dropLateData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set, contains a pubsub label from which to extract record ids.
    * If left empty, record deduplication will be strictly best effort.
    */
  var idLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A pubsub subscription, in the form of
    * "pubsub.googleapis.com/subscriptions/<project-id>/<subscription-name>"
    */
  var subscription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set, contains a pubsub label from which to extract record timestamps.
    * If left empty, record timestamps will be generated upon arrival.
    */
  var timestampLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A pubsub topic, in the form of
    * "pubsub.googleapis.com/topics/<project-id>/<topic-name>"
    */
  var topic: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set, specifies the pubsub subscription that will be used for tracking
    * custom time timestamps for watermark estimation.
    */
  var trackingSubscription: js.UndefOr[java.lang.String] = js.undefined
  /** If true, then the client has requested to get pubsub attributes. */
  var withAttributes: js.UndefOr[scala.Boolean] = js.undefined
}

object PubsubLocation {
  @scala.inline
  def apply(
    dropLateData: js.UndefOr[scala.Boolean] = js.undefined,
    idLabel: java.lang.String = null,
    subscription: java.lang.String = null,
    timestampLabel: java.lang.String = null,
    topic: java.lang.String = null,
    trackingSubscription: java.lang.String = null,
    withAttributes: js.UndefOr[scala.Boolean] = js.undefined
  ): PubsubLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropLateData)) __obj.updateDynamic("dropLateData")(dropLateData)
    if (idLabel != null) __obj.updateDynamic("idLabel")(idLabel)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    if (timestampLabel != null) __obj.updateDynamic("timestampLabel")(timestampLabel)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    if (trackingSubscription != null) __obj.updateDynamic("trackingSubscription")(trackingSubscription)
    if (!js.isUndefined(withAttributes)) __obj.updateDynamic("withAttributes")(withAttributes)
    __obj.asInstanceOf[PubsubLocation]
  }
}

