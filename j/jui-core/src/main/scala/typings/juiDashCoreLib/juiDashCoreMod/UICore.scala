package typings
package juiDashCoreLib.juiDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UICore extends js.Object {
  var event: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[js.Any] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * Check the parameter type of a UI method and generates an alarm when a wrong value is entered
    *
    * @param name Method name
    * @param params Parameters
    */
  def addValid(name: java.lang.String, params: js.Array[_]): scala.Unit
  /**
    * Sets a callback function that is called after a UI method is run
    *
    * @param name Method name
    */
  def callAfter(name: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Sets a callback function that is called before a UI method is run
    *
    * @param name Method name
    */
  def callBefore(name: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Sets a callback function and the delay time before/after a UI method is run
    *
    * @param name Method name
    */
  def callDelay(name: java.lang.String, callObj: js.Function0[scala.Unit]): scala.Unit
  def destroy(): scala.Unit
  /**
    * Generates a custom event. The first parameter is the type of a custom event. A function defined as an option or on method is called
    *
    * @param type Event type
    * @param args Event Arguments
    */
  def emit(`type`: java.lang.String, args: js.Function0[scala.Unit]): js.Any
  /**
    * Removes a custom event of an applicable type or callback handler
    *
    * @param type Event type
    */
  def off(`type`: java.lang.String): scala.Unit
  /**
    * A callback function defined as an on method is run when an emit method is called
    *
    * @param type Event type
    */
  def on(`type`: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Dynamically defines the options of a UI
    */
  def setOption(key: java.lang.String, value: js.Any): scala.Unit
  /**
    * Dynamically defines the template method of a UI
    *
    * @param name Template name
    * @param html Template markup
    */
  def setTpl(name: java.lang.String, html: java.lang.String): scala.Unit
}

object UICore {
  @scala.inline
  def apply(
    addValid: (java.lang.String, js.Array[_]) => scala.Unit,
    callAfter: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    callBefore: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    callDelay: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    destroy: () => scala.Unit,
    emit: (java.lang.String, js.Function0[scala.Unit]) => js.Any,
    off: java.lang.String => scala.Unit,
    on: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    setOption: (java.lang.String, js.Any) => scala.Unit,
    setTpl: (java.lang.String, java.lang.String) => scala.Unit,
    event: js.Any = null,
    root: js.Any = null,
    tpl: js.Any = null
  ): UICore = {
    val __obj = js.Dynamic.literal(addValid = js.Any.fromFunction2(addValid), callAfter = js.Any.fromFunction2(callAfter), callBefore = js.Any.fromFunction2(callBefore), callDelay = js.Any.fromFunction2(callDelay), destroy = js.Any.fromFunction0(destroy), emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), setOption = js.Any.fromFunction2(setOption), setTpl = js.Any.fromFunction2(setTpl))
    if (event != null) __obj.updateDynamic("event")(event)
    if (root != null) __obj.updateDynamic("root")(root)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[UICore]
  }
}

