package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleOptions[T] extends Options[T] {
  /**
    * The number of times the event needs to be emitted before the promise resolves.
    */
  var count: scala.Double
  /**
    * Whether to resolve the promise immediately. Emitting one of the `rejectionEvents` won't throw an error.
    *
    * **Note**: The returned array will be mutated when an event is emitted.
    *
    * @example
    * const emitter = new EventEmitter();
    *
    * const promise = pEvent.multiple(emitter, 'hello', {
    *     resolveImmediately: true,
    *     count: Infinity
    * });
    *
    * const result = await promise;
    * console.log(result);
    * //=> []
    *
    * emitter.emit('hello', 'Jack');
    * console.log(result);
    * //=> ['Jack']
    *
    * emitter.emit('hello', 'Mark');
    * console.log(result);
    * //=> ['Jack', 'Mark']
    *
    * // Stops listening
    * emitter.emit('error', new Error('😿'));
    *
    * emitter.emit('hello', 'John');
    * console.log(result);
    * //=> ['Jack', 'Mark']
    */
  var resolveImmediately: js.UndefOr[scala.Boolean] = js.undefined
}

object MultipleOptions {
  @scala.inline
  def apply[T](
    count: scala.Double,
    filter: FilterFn[T] = null,
    multiArgs: js.UndefOr[scala.Boolean] = js.undefined,
    rejectionEvents: js.Array[java.lang.String | js.Symbol] = null,
    resolveImmediately: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): MultipleOptions[T] = {
    val __obj = js.Dynamic.literal(count = count)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs)
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents)
    if (!js.isUndefined(resolveImmediately)) __obj.updateDynamic("resolveImmediately")(resolveImmediately)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOptions[T]]
  }
}

