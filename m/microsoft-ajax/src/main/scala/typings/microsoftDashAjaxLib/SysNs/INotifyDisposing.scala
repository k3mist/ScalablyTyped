package typings
package microsoftDashAjaxLib.SysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates that the type that implements the interface provides disposing notifications.
  * Implement this interface if the class must notify other objects when it is releasing resources. The base component class already implements this interface. Therefore, typically this interface is already available.
  */
trait INotifyDisposing extends js.Object {
  //#region Events
  /**
    * Occurs when an object's resources are released.
    * @param handler
    *       The name of the event handler for the disposing event.
    */
  def add_disposing(handler: js.Function): scala.Unit
  /**
    * Occurs when an object's resources are released.
    * @param handler
    *       The name of the event handler for the disposing event.
    */
  def remove_disposing(handler: js.Function): scala.Unit
}

object INotifyDisposing {
  @scala.inline
  def apply(
    add_disposing: js.Function1[js.Function, scala.Unit],
    remove_disposing: js.Function1[js.Function, scala.Unit]
  ): INotifyDisposing = {
    val __obj = js.Dynamic.literal(add_disposing = add_disposing, remove_disposing = remove_disposing)
  
    __obj.asInstanceOf[INotifyDisposing]
  }
}

