package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a process stage change event context
  * @deprecated Use {@link Xrm.Events.StageChangeEventContext} instead.
  */
trait StageChangeEventContext
  extends xrmLib.XrmNs.EventsNs.StageChangeEventContext

object StageChangeEventContext {
  @scala.inline
  def apply(
    getContext: () => xrmLib.XrmNs.GlobalContext,
    getDepth: () => scala.Double,
    getEventArgs: () => xrmLib.XrmNs.EventsNs.StageChangeEventArguments,
    getEventSource: () => xrmLib.XrmNs.AttributesNs.Attribute | xrmLib.XrmNs.ControlsNs.Control | xrmLib.XrmNs.Entity,
    getFormContext: () => xrmLib.XrmNs.FormContext,
    getSharedVariable: java.lang.String => js.Any,
    setSharedVariable: (java.lang.String, js.Any) => scala.Unit
  ): StageChangeEventContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
  
    __obj.asInstanceOf[StageChangeEventContext]
  }
}

