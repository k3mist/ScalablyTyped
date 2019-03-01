package typings
package angularDashMocksLib.angularDashMocksMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// IntervalService
// see https://docs.angularjs.org/api/ngMock/service/$interval
// Augments the original service
///////////////////////////////////////////////////////////////////////////
trait IIntervalService extends js.Object {
  /**
    * Runs interval tasks scheduled to be run in the next `millis` milliseconds.
    *
    * @param millis - The maximum timeout amount to flush up until.
    * @return The amount of time moved forward.
    */
  def flush(millis: scala.Double): scala.Double
}

object IIntervalService {
  @scala.inline
  def apply(flush: js.Function1[scala.Double, scala.Double]): IIntervalService = {
    val __obj = js.Dynamic.literal(flush = flush)
  
    __obj.asInstanceOf[IIntervalService]
  }
}

