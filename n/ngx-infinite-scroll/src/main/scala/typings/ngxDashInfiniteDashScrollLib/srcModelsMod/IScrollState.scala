package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollState extends js.Object {
  var lastScrollPosition: scala.Double
  var lastTotalToScroll: scala.Double
  var totalToScroll: scala.Double
  var triggered: ngxDashInfiniteDashScrollLib.Anon_Down
}

object IScrollState {
  @scala.inline
  def apply(
    lastScrollPosition: scala.Double,
    lastTotalToScroll: scala.Double,
    totalToScroll: scala.Double,
    triggered: ngxDashInfiniteDashScrollLib.Anon_Down
  ): IScrollState = {
    val __obj = js.Dynamic.literal(lastScrollPosition = lastScrollPosition, lastTotalToScroll = lastTotalToScroll, totalToScroll = totalToScroll, triggered = triggered)
  
    __obj.asInstanceOf[IScrollState]
  }
}

