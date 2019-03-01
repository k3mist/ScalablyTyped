package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Runner extends js.Object {
  /**
    * A `Number` that specifies the time step between updates in milliseconds.
    * If `engine.timing.isFixed` is set to `true`, then `delta` is fixed.
    * If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    *
    * @property delta
    * @type number
    * @default 1000 / 60
    */
  var delta: scala.Double
  /**
    * A flag that specifies whether the runner is running or not.
    *
    * @property enabled
    * @type boolean
    * @default true
    */
  var enabled: scala.Boolean
  /**
    * A `Boolean` that specifies if the runner should use a fixed timestep (otherwise it is variable).
    * If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic).
    * If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    *
    * @property isFixed
    * @type boolean
    * @default false
    */
  var isFixed: scala.Boolean
}

object Runner {
  @scala.inline
  def apply(delta: scala.Double, enabled: scala.Boolean, isFixed: scala.Boolean): Runner = {
    val __obj = js.Dynamic.literal(delta = delta, enabled = enabled, isFixed = isFixed)
  
    __obj.asInstanceOf[Runner]
  }
}

