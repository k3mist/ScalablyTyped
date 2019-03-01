package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== Queue =====
  */
trait IQueueCallback extends js.Object {
  /**
  	 * Invoked after all requests in the queue have successfully replayed.
  	 * @param {StorableRequest[]} requests
  	 */
  def queueDidReplay(requests: js.Array[StorableRequest]): scala.Unit
  /**
  	 * Invoked immediately before the request is stored to IndexedDB. Use this callback to modify request data at store time.
  	 * @param {StorableRequest} request
  	 */
  def requestWillEnqueue(request: StorableRequest): scala.Unit
  /**
  	 * Invoked immediately before the request is re-fetched. Use this callback to modify request data at fetch time.
  	 * @param {StorableRequest} request
  	 */
  def requestWillReplay(request: StorableRequest): scala.Unit
}

object IQueueCallback {
  @scala.inline
  def apply(
    queueDidReplay: js.Function1[js.Array[StorableRequest], scala.Unit],
    requestWillEnqueue: js.Function1[StorableRequest, scala.Unit],
    requestWillReplay: js.Function1[StorableRequest, scala.Unit]
  ): IQueueCallback = {
    val __obj = js.Dynamic.literal(queueDidReplay = queueDidReplay, requestWillEnqueue = requestWillEnqueue, requestWillReplay = requestWillReplay)
  
    __obj.asInstanceOf[IQueueCallback]
  }
}

