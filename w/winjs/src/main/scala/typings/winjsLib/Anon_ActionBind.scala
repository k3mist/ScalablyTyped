package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionBind extends js.Object {
  //#region Methods
  /**
    * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
    * @param name The name of the property to which to bind the action.
    * @param action The function to invoke asynchronously when the property may have changed.
    * @returns A reference to this observableMixin object.
    **/
  def bind(name: java.lang.String, action: js.Function): js.Any
  /**
    * Notifies listeners that a property value was updated.
    * @param name The name of the property that is being updated.
    * @param newValue The new value for the property.
    * @param oldValue The old value for the property.
    * @returns A promise that is completed when the notifications are complete.
    **/
  def notify(name: java.lang.String, newValue: js.Any, oldValue: js.Any): winjsLib.WinJSNs.Promise[_]
  /**
    * Removes one or more listeners from the notification list for a given property.
    * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
    * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
    * @returns This object is returned.
    **/
  def unbind(name: java.lang.String, action: js.Function): js.Any
}

object Anon_ActionBind {
  @scala.inline
  def apply(
    bind: js.Function2[java.lang.String, js.Function, js.Any],
    notify: js.Function3[java.lang.String, js.Any, js.Any, winjsLib.WinJSNs.Promise[_]],
    unbind: js.Function2[java.lang.String, js.Function, js.Any]
  ): Anon_ActionBind = {
    val __obj = js.Dynamic.literal(bind = bind, notify = notify, unbind = unbind)
  
    __obj.asInstanceOf[Anon_ActionBind]
  }
}

