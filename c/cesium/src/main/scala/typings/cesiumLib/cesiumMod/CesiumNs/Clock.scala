package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clock extends js.Object {
  var canAnimate: scala.Boolean
  var clockRange: ClockRange
  var clockStep: ClockStep
  var currentTime: JulianDate
  var multiplier: scala.Double
  var onTick: Event[js.Array[Clock]]
  var shouldAnimate: scala.Boolean
  var startTime: JulianDate
  var stopTime: JulianDate
  def tick(): JulianDate
}

object Clock {
  @scala.inline
  def apply(
    canAnimate: scala.Boolean,
    clockRange: ClockRange,
    clockStep: ClockStep,
    currentTime: JulianDate,
    multiplier: scala.Double,
    onTick: Event[js.Array[Clock]],
    shouldAnimate: scala.Boolean,
    startTime: JulianDate,
    stopTime: JulianDate,
    tick: () => JulianDate
  ): Clock = {
    val __obj = js.Dynamic.literal(canAnimate = canAnimate, clockRange = clockRange, clockStep = clockStep, currentTime = currentTime, multiplier = multiplier, onTick = onTick, shouldAnimate = shouldAnimate, startTime = startTime, stopTime = stopTime, tick = js.Any.fromFunction0(tick))
  
    __obj.asInstanceOf[Clock]
  }
}

