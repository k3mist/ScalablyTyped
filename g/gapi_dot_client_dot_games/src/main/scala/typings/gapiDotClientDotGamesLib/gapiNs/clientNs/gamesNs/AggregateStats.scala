package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateStats extends js.Object {
  /** The number of messages sent between a pair of peers. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#aggregateStats. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum amount. */
  var max: js.UndefOr[java.lang.String] = js.undefined
  /** The minimum amount. */
  var min: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of bytes sent for messages between a pair of peers. */
  var sum: js.UndefOr[java.lang.String] = js.undefined
}

object AggregateStats {
  @scala.inline
  def apply(
    count: java.lang.String = null,
    kind: java.lang.String = null,
    max: java.lang.String = null,
    min: java.lang.String = null,
    sum: java.lang.String = null
  ): AggregateStats = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (sum != null) __obj.updateDynamic("sum")(sum)
    __obj.asInstanceOf[AggregateStats]
  }
}

