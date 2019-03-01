package typings
package awsDashSdkLib.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPOptions extends js.Object {
  /**
    * the Agent object to perform HTTP requests with.
    * Used for connection pooling.
    * Defaults to the global agent (http.globalAgent) for non-SSL connections.
    */
  var agent: js.UndefOr[nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent] = js.undefined
  /**
    * The maximum time in milliseconds that the connection phase of the request
    * should be allowed to take. This only limits the connection phase and has
    * no impact once the socket has established a connection.
    * Used in node.js environments only.
    */
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * the URL to proxy requests through.
    */
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of milliseconds to wait before giving up on a connection attempt.
    * Defaults to two minutes (120000).
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the SDK will send asynchronous HTTP requests.
    * Used in the browser environment only.
    * Set to false to send requests synchronously.
    * Defaults to true (async on).
    */
  var xhrAsync: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the 'withCredentials' property of an XMLHttpRequest object.
    * Used in the browser environment only.
    * Defaults to false.
    */
  var xhrWithCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object HTTPOptions {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent = null,
    connectTimeout: scala.Int | scala.Double = null,
    proxy: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    xhrAsync: js.UndefOr[scala.Boolean] = js.undefined,
    xhrWithCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): HTTPOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(xhrAsync)) __obj.updateDynamic("xhrAsync")(xhrAsync)
    if (!js.isUndefined(xhrWithCredentials)) __obj.updateDynamic("xhrWithCredentials")(xhrWithCredentials)
    __obj.asInstanceOf[HTTPOptions]
  }
}

