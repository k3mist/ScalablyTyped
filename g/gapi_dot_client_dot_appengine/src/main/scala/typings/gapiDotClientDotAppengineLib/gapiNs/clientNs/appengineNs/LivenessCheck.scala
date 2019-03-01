package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LivenessCheck extends js.Object {
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[java.lang.String] = js.undefined
  /** Number of consecutive failed checks required before considering the VM unhealthy. */
  var failureThreshold: js.UndefOr[scala.Double] = js.undefined
  /** Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** The initial delay before starting to execute the checks. */
  var initialDelay: js.UndefOr[java.lang.String] = js.undefined
  /** The request path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Number of consecutive successful checks required before considering the VM healthy. */
  var successThreshold: js.UndefOr[scala.Double] = js.undefined
  /** Time before the check is considered failed. */
  var timeout: js.UndefOr[java.lang.String] = js.undefined
}

object LivenessCheck {
  @scala.inline
  def apply(
    checkInterval: java.lang.String = null,
    failureThreshold: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    initialDelay: java.lang.String = null,
    path: java.lang.String = null,
    successThreshold: scala.Int | scala.Double = null,
    timeout: java.lang.String = null
  ): LivenessCheck = {
    val __obj = js.Dynamic.literal()
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval)
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay)
    if (path != null) __obj.updateDynamic("path")(path)
    if (successThreshold != null) __obj.updateDynamic("successThreshold")(successThreshold.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[LivenessCheck]
  }
}

