package typings
package cometdLib.cometdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /**
    * Determines whether or not the Bayeux message type (handshake, connect, disconnect) is
    * appended to the URL of the Bayeux server (see above).
    */
  var appendMessageTypeToURL: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines whether multiple publishes that get queued are sent as a batch on the first
    * occasion, without requiring explicit batching.
    */
  var autoBatch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of milliseconds that the backoff time increments every time a connection with the
    * Bayeux server fails. CometD attempts to reconnect after the backoff time elapses.
    */
  var backoffIncrement: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of milliseconds to wait for a WebSocket connection to be opened. It does
    * not apply to HTTP connections. A timeout value of 0 means to wait forever.
    */
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The log level. Possible values are: "warn", "info", "debug". Output to `window.console` if
    * available.
    */
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of milliseconds of the backoff time after which the backoff time is not
    * incremented further.
    */
  var maxBackoff: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of connections used to connect to the Bayeux server. Change this value
    * only if you know exactly the client’s connection limit and what "request queued behind long
    * poll" means.
    */
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of milliseconds to wait before considering a request to the Bayeux server
    * failed.
    */
  var maxNetworkDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The max length of the URI for a request made with the callback-polling transport. Microsoft
    * Internet Explorer 7 and 8 are known to limit the URI length, so single large messages sent by
    * CometD may fail to remain within the max URI length when encoded in JSON.
    */
  var maxURILength: js.UndefOr[scala.Double] = js.undefined
  /**
    * An object containing the request headers to be sent for every Bayeux request (for example,
    * `{"My-Custom-Header": "MyValue"}`).
    */
  var requestHeaders: js.UndefOr[js.Object] = js.undefined
  /**
    * Only applies to the websocket transport. Determines whether to stick using the websocket
    * transport when a websocket transport failure has been detected after the websocket transport
    * was able to successfully connect to the server.
    */
  var stickyReconnect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The URL of the Bayeux server this client will connect to.
    */
  var url: java.lang.String
}

object Configuration {
  @scala.inline
  def apply(
    url: java.lang.String,
    appendMessageTypeToURL: js.UndefOr[scala.Boolean] = js.undefined,
    autoBatch: js.UndefOr[scala.Boolean] = js.undefined,
    backoffIncrement: scala.Int | scala.Double = null,
    connectTimeout: scala.Int | scala.Double = null,
    logLevel: java.lang.String = null,
    maxBackoff: scala.Int | scala.Double = null,
    maxConnections: scala.Int | scala.Double = null,
    maxNetworkDelay: scala.Int | scala.Double = null,
    maxURILength: scala.Int | scala.Double = null,
    requestHeaders: js.Object = null,
    stickyReconnect: js.UndefOr[scala.Boolean] = js.undefined
  ): Configuration = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(appendMessageTypeToURL)) __obj.updateDynamic("appendMessageTypeToURL")(appendMessageTypeToURL)
    if (!js.isUndefined(autoBatch)) __obj.updateDynamic("autoBatch")(autoBatch)
    if (backoffIncrement != null) __obj.updateDynamic("backoffIncrement")(backoffIncrement.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (maxBackoff != null) __obj.updateDynamic("maxBackoff")(maxBackoff.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (maxNetworkDelay != null) __obj.updateDynamic("maxNetworkDelay")(maxNetworkDelay.asInstanceOf[js.Any])
    if (maxURILength != null) __obj.updateDynamic("maxURILength")(maxURILength.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders)
    if (!js.isUndefined(stickyReconnect)) __obj.updateDynamic("stickyReconnect")(stickyReconnect)
    __obj.asInstanceOf[Configuration]
  }
}

