package typings
package angularDashIdleLib.angularMod.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Keepalive will use a timeout to periodically wake, broadcast a Keepalive event on the root scope,
  * and optionally make an $http request. By default, the Idle service will stop and start Keepalive
  * when a user becomes idle or returns from idle, respectively. It is also started automatically when
  * Idle.watch() is called. This can be disabled by configuring the IdleProvider.
  */
trait IKeepAliveService extends js.Object {
  /**
    * Performs one ping only.
    */
  def ping(): scala.Unit
  /**
    * Changes the interval value at runtime.
    * You will need to restart the pinging process by calling start() manually for the changes to be reflected.
    */
  def setInterval(seconds: scala.Double): scala.Unit
  /**
    * Starts pinging periodically until stop() is called.
    */
  def start(): scala.Unit
  /**
    * Stops pinging.
    */
  def stop(): scala.Unit
}

object IKeepAliveService {
  @scala.inline
  def apply(
    ping: () => scala.Unit,
    setInterval: scala.Double => scala.Unit,
    start: () => scala.Unit,
    stop: () => scala.Unit
  ): IKeepAliveService = {
    val __obj = js.Dynamic.literal(ping = js.Any.fromFunction0(ping), setInterval = js.Any.fromFunction1(setInterval), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[IKeepAliveService]
  }
}

