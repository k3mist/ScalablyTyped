package typings
package retryDashRequestLib.retryDashRequestMod.retryRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var currentRetryAttempt: js.UndefOr[scala.Double] = js.undefined
  var noResponseRetries: js.UndefOr[scala.Double] = js.undefined
  var objectMode: js.UndefOr[scala.Boolean] = js.undefined
  var request: js.UndefOr[
    retryDashRequestLib.Anon_Request with (requestLib.requestMod.requestNs.RequestAPI[
      requestLib.requestMod.requestNs.Request, 
      requestLib.requestMod.requestNs.CoreOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl
    ])
  ] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
  var shouldRetryFn: js.UndefOr[
    js.Function1[/* response */ requestLib.requestMod.requestNs.RequestResponse, scala.Boolean]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    currentRetryAttempt: scala.Int | scala.Double = null,
    noResponseRetries: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    request: retryDashRequestLib.Anon_Request with (requestLib.requestMod.requestNs.RequestAPI[
      requestLib.requestMod.requestNs.Request, 
      requestLib.requestMod.requestNs.CoreOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl
    ]) = null,
    retries: scala.Int | scala.Double = null,
    shouldRetryFn: js.Function1[/* response */ requestLib.requestMod.requestNs.RequestResponse, scala.Boolean] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (currentRetryAttempt != null) __obj.updateDynamic("currentRetryAttempt")(currentRetryAttempt.asInstanceOf[js.Any])
    if (noResponseRetries != null) __obj.updateDynamic("noResponseRetries")(noResponseRetries.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (request != null) __obj.updateDynamic("request")(request)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (shouldRetryFn != null) __obj.updateDynamic("shouldRetryFn")(shouldRetryFn)
    __obj.asInstanceOf[Options]
  }
}

