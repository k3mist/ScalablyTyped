package typings
package pDashQueueLib.pDashQueueMod.PQueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TEnqueueOptions /* <: QueueAddOptions */] extends js.Object {
  /**
    * Whether queue tasks within concurrency limit, are auto-executed as soon as they're added.
    * @default true
    */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the task must finish in the given interval or will be carried over into the next interval count.
    * @default false
    */
  var carryoverConcurrencyCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Concurrency limit. Minimum: `1`.
    * @default Infinity
    */
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  /**
    * The length of time in milliseconds before the interval count resets. Must be finite. Minimum: `0`.
    * @default 0
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
    * The max number of runs in the given interval of time. Minimum: `1`.
    * @default Infinity
    */
  var intervalCap: js.UndefOr[scala.Double] = js.undefined
  /**
    * Class with a `enqueue` and `dequeue` method, and a `size` getter. See the
    * [Custom QueueClass](https://github.com/sindresorhus/p-queue#custom-queueclass) section.
    */
  var queueClass: js.UndefOr[QueueClassConstructor[TEnqueueOptions]] = js.undefined
}

