package typings
package stompitLib.libConnectFailoverMod.ConnectFailoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectFailoverOptions extends js.Object {
  // Override the connect function
  var connectFunction: js.UndefOr[
    js.Function2[
      /* options */ stompitLib.libConnectMod.connectNs.ConnectOptions, 
      /* connectionListener */ js.UndefOr[
        js.Function2[
          /* err */ nodeLib.Error | scala.Null, 
          /* client */ stompitLib.libClientMod.namespaced, 
          scala.Unit
        ]
      ], 
      stompitLib.libClientMod.namespaced
    ]
  ] = js.undefined
  // Milliseconds delay of the first reconnect
  var initialReconnectDelay: js.UndefOr[scala.Double] = js.undefined
  // Maximum milliseconds delay of any reconnect
  var maxReconnectDelay: js.UndefOr[scala.Double] = js.undefined
  // Maximum number of reconnects
  var maxReconnects: js.UndefOr[scala.Double] = js.undefined
  // Randomly choose a server to use for reconnect
  var randomize: js.UndefOr[scala.Boolean] = js.undefined
  // The exponent used in the exponential backoff attempts
  var reconnectDelayExponent: js.UndefOr[scala.Double] = js.undefined
  // Exponential increase of the reconnect delay
  var useExponentialBackOff: js.UndefOr[scala.Boolean] = js.undefined
}

object ConnectFailoverOptions {
  @scala.inline
  def apply(
    connectFunction: js.Function2[
      /* options */ stompitLib.libConnectMod.connectNs.ConnectOptions, 
      /* connectionListener */ js.UndefOr[
        js.Function2[
          /* err */ nodeLib.Error | scala.Null, 
          /* client */ stompitLib.libClientMod.namespaced, 
          scala.Unit
        ]
      ], 
      stompitLib.libClientMod.namespaced
    ] = null,
    initialReconnectDelay: scala.Int | scala.Double = null,
    maxReconnectDelay: scala.Int | scala.Double = null,
    maxReconnects: scala.Int | scala.Double = null,
    randomize: js.UndefOr[scala.Boolean] = js.undefined,
    reconnectDelayExponent: scala.Int | scala.Double = null,
    useExponentialBackOff: js.UndefOr[scala.Boolean] = js.undefined
  ): ConnectFailoverOptions = {
    val __obj = js.Dynamic.literal()
    if (connectFunction != null) __obj.updateDynamic("connectFunction")(connectFunction)
    if (initialReconnectDelay != null) __obj.updateDynamic("initialReconnectDelay")(initialReconnectDelay.asInstanceOf[js.Any])
    if (maxReconnectDelay != null) __obj.updateDynamic("maxReconnectDelay")(maxReconnectDelay.asInstanceOf[js.Any])
    if (maxReconnects != null) __obj.updateDynamic("maxReconnects")(maxReconnects.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize)
    if (reconnectDelayExponent != null) __obj.updateDynamic("reconnectDelayExponent")(reconnectDelayExponent.asInstanceOf[js.Any])
    if (!js.isUndefined(useExponentialBackOff)) __obj.updateDynamic("useExponentialBackOff")(useExponentialBackOff)
    __obj.asInstanceOf[ConnectFailoverOptions]
  }
}

