package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait connectConfig extends baseRequestConfig {
  /**
    * The callback to invoke after onSuccess or onFailure. See connectCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ connectCompleteArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke if the connect fails. Defaults to an alert of the error. See connectFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ connectFailureArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke if the streaming connection fails. See streamFailureArgs for callback argument details.
    * This method will be invoked if (a) the connection was lost, automatic retries succeeded, but the client had idled on the server (and so needs to reconnect),
    * or (b) the connection was lost and automatic retries failed. In the former case, willReconnect is true, and in the latter case, willReconnect is false.
    * See client for more details on these two scenarios.
    * If willReconnect is true, the client will automatically reconnect. If the reconnect succeeds, the callback specified by onSuccess will be invoked with isReconnect set to true.
    * If the reconnect fails, the callback specified by onFailure will be invoked with isReconnect set to false.
    * With the exception of UI updates, invocations of this callback with willReconnect set to true can be ignored.
    */
  var onStreamFailure: js.UndefOr[js.Function1[/* args */ streamFailureArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke if the connect succeeds. See connectSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ connectSuccessArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke when a message is received on a channel that has no local callback specified to handle it. See receiveArgs for callback argument details.
    * This can occur if (a) a client is manually subscribed to a channel by the server or (b) a client subscribed to a channel and then manually removed the local callback using client.
    */
  var onUnhandledReceive: js.UndefOr[js.Function1[/* args */ receiveArgs, scala.Unit]] = js.undefined
  /**
    * Whether to always attempt to stay connected in the event of network failure. If true, the client will continually reconnect, even after exhausting the specified number
    * of retries specified by initializeConfig.retries. If false, the client will stop reconnecting if all retry attempts fail.
    */
  var stayConnected: js.UndefOr[scala.Boolean] = js.undefined
}

object connectConfig {
  @scala.inline
  def apply(
    meta: js.Any = null,
    onComplete: js.Function1[/* args */ connectCompleteArgs, scala.Unit] = null,
    onFailure: js.Function1[/* args */ connectFailureArgs, scala.Unit] = null,
    onStreamFailure: js.Function1[/* args */ streamFailureArgs, scala.Unit] = null,
    onSuccess: js.Function1[/* args */ connectSuccessArgs, scala.Unit] = null,
    onUnhandledReceive: js.Function1[/* args */ receiveArgs, scala.Unit] = null,
    requestUrl: java.lang.String = null,
    stayConnected: js.UndefOr[scala.Boolean] = js.undefined,
    suppressErrors: js.UndefOr[scala.Boolean] = js.undefined,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): connectConfig = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onStreamFailure != null) __obj.updateDynamic("onStreamFailure")(onStreamFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (onUnhandledReceive != null) __obj.updateDynamic("onUnhandledReceive")(onUnhandledReceive)
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    if (!js.isUndefined(stayConnected)) __obj.updateDynamic("stayConnected")(stayConnected)
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[connectConfig]
  }
}

