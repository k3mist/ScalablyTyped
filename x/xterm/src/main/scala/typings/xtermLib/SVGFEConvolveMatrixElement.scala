package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFEConvolveMatrixElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_EDGEMODE_DUPLICATE: scala.Double = js.native
  val SVG_EDGEMODE_NONE: scala.Double = js.native
  val SVG_EDGEMODE_UNKNOWN: scala.Double = js.native
  val SVG_EDGEMODE_WRAP: scala.Double = js.native
  val bias: SVGAnimatedNumber = js.native
  val divisor: SVGAnimatedNumber = js.native
  val edgeMode: SVGAnimatedEnumeration = js.native
  val in1: SVGAnimatedString = js.native
  val kernelMatrix: SVGAnimatedNumberList = js.native
  val kernelUnitLengthX: SVGAnimatedNumber = js.native
  val kernelUnitLengthY: SVGAnimatedNumber = js.native
  val orderX: SVGAnimatedInteger = js.native
  val orderY: SVGAnimatedInteger = js.native
  val preserveAlpha: SVGAnimatedBoolean = js.native
  val targetX: SVGAnimatedInteger = js.native
  val targetY: SVGAnimatedInteger = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * The options argument sets listener-specific options. For compatibility this can be a
    * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
    * be removed.
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("SVGFEConvolveMatrixElement")
@js.native
object SVGFEConvolveMatrixElement
  extends org.scalablytyped.runtime.Instantiable0[SVGFEConvolveMatrixElement] {
  val SVG_EDGEMODE_DUPLICATE: scala.Double = js.native
  val SVG_EDGEMODE_NONE: scala.Double = js.native
  val SVG_EDGEMODE_UNKNOWN: scala.Double = js.native
  val SVG_EDGEMODE_WRAP: scala.Double = js.native
}

