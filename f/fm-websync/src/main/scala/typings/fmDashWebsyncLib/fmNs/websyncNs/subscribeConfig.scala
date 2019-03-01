package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribeConfig extends baseRequestConfig {
  /**
    * The channel to which the client should be subscribed. Must start with a forward slash (/). Overrides channels.
    */
  var channel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The channels to which the client should be subscribed. Each must start with a forward slash (/). Overrides channel.
    */
  var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The callback to invoke after onSuccess or onFailure. See subscribeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ subscribeCompleteArgs, scala.Unit]] = js.undefined
  /**
    * (OptionalThe callback to invoke if the subscribe fails. See subscribeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ subscribeFailureArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke when data is received on the channel(s). See receiveArgs for callback argument details.
    */
  var onReceive: js.UndefOr[js.Function1[/* args */ receiveArgs, scala.Unit]] = js.undefined
  /**
    * Subscribers extension. The callback to invoke when a subscribers change notification is received (i.e. when a client subscribes to or unsubscribes from the channel(s)).
    * The current subscribe request will trigger this callback. See subscribersChangeArgs for callback argument details.
    */
  var onSubscribersChange: js.UndefOr[js.Function1[/* args */ subscribersChangeArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke if the subscribe succeeds. See subscribeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ subscribeSuccessArgs, scala.Unit]] = js.undefined
}

object subscribeConfig {
  @scala.inline
  def apply(
    channel: java.lang.String = null,
    channels: js.Array[java.lang.String] = null,
    meta: js.Any = null,
    onComplete: js.Function1[/* args */ subscribeCompleteArgs, scala.Unit] = null,
    onFailure: js.Function1[/* args */ subscribeFailureArgs, scala.Unit] = null,
    onReceive: js.Function1[/* args */ receiveArgs, scala.Unit] = null,
    onSubscribersChange: js.Function1[/* args */ subscribersChangeArgs, scala.Unit] = null,
    onSuccess: js.Function1[/* args */ subscribeSuccessArgs, scala.Unit] = null,
    requestUrl: java.lang.String = null,
    suppressErrors: js.UndefOr[scala.Boolean] = js.undefined,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): subscribeConfig = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onReceive != null) __obj.updateDynamic("onReceive")(onReceive)
    if (onSubscribersChange != null) __obj.updateDynamic("onSubscribersChange")(onSubscribersChange)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[subscribeConfig]
  }
}

