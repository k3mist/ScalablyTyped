package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class to manage storing failed requests in IndexedDB and retrying them later.
  * All parts of the storing and replaying process are observable via callbacks.
  */
trait Queue extends js.Object {
  val name: java.lang.String
  /**
  	 * Stores the passed request into IndexedDB. The database used is workbox-background-sync and the object store name is the same as the name this instance was created with (to guarantee it's unique).
  	 * @param {Request} request - The request object to store.
  	 * @returns {Promise<void>}
  	 */
  def addRequest(request: stdLib.Request): js.Promise[scala.Unit]
  /**
  	 * Retrieves all stored requests in IndexedDB and retries them. If the queue contained requests that
  	 * were successfully replayed, the queueDidReplay callback is invoked (which implies the queue is now empty).
  	 * If any of the requests fail, a new sync registration is created to retry again later.
  	 * @returns {Promise<void>}
  	 */
  def replayRequests(): js.Promise[scala.Unit]
}

object Queue {
  @scala.inline
  def apply(
    addRequest: js.Function1[stdLib.Request, js.Promise[scala.Unit]],
    name: java.lang.String,
    replayRequests: js.Function0[js.Promise[scala.Unit]]
  ): Queue = {
    val __obj = js.Dynamic.literal(addRequest = addRequest, name = name, replayRequests = replayRequests)
  
    __obj.asInstanceOf[Queue]
  }
}

