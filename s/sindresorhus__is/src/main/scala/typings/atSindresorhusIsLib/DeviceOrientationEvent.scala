package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceOrientationEvent extends Event {
  val absolute: scala.Boolean = js.native
  val alpha: scala.Double | scala.Null = js.native
  val beta: scala.Double | scala.Null = js.native
  val gamma: scala.Double | scala.Null = js.native
  def initDeviceOrientationEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    alpha: scala.Double,
    beta: scala.Double,
    gamma: scala.Double,
    absolute: scala.Boolean
  ): scala.Unit = js.native
  def initDeviceOrientationEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    alpha: scala.Double,
    beta: scala.Double,
    gamma: scala.Null,
    absolute: scala.Boolean
  ): scala.Unit = js.native
  def initDeviceOrientationEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    alpha: scala.Double,
    beta: scala.Null,
    gamma: scala.Double,
    absolute: scala.Boolean
  ): scala.Unit = js.native
  def initDeviceOrientationEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    alpha: scala.Double,
    beta: scala.Null,
    gamma: scala.Null,
    absolute: scala.Boolean
  ): scala.Unit = js.native
  def initDeviceOrientationEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    alpha: scala.Null,
    beta: scala.Double,
    gamma: scala.Double,
    absolute: scala.Boolean
  ): scala.Unit = js.native
  def initDeviceOrientationEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    alpha: scala.Null,
    beta: scala.Double,
    gamma: scala.Null,
    absolute: scala.Boolean
  ): scala.Unit = js.native
  def initDeviceOrientationEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    alpha: scala.Null,
    beta: scala.Null,
    gamma: scala.Double,
    absolute: scala.Boolean
  ): scala.Unit = js.native
  def initDeviceOrientationEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    alpha: scala.Null,
    beta: scala.Null,
    gamma: scala.Null,
    absolute: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("DeviceOrientationEvent")
@js.native
object DeviceOrientationEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, DeviceOrientationEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ DeviceOrientationEventInit, 
      DeviceOrientationEvent
    ]

