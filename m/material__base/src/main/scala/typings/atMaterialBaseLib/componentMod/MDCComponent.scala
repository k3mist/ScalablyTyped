package typings
package atMaterialBaseLib.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCComponent[A, F /* <: atMaterialBaseLib.foundationMod.default[A] */] extends js.Object {
  // Subclasses may implement this method to release any resources / deregister any listeners they have
  // attached. An example of this might be deregistering a resize event from the window object.
  def destroy(): scala.Unit = js.native
  /**
    * Fires a cross-browser-compatible custom event from the component root of the given type,
    * with the given data.
    */
  def emit(evtType: java.lang.String, evtData: js.Any): scala.Unit = js.native
  def emit(evtType: java.lang.String, evtData: js.Any, shouldBubble: scala.Boolean): scala.Unit = js.native
  // Subclasses must override this method to return a properly configured foundation class for the
  // component.
  def getDefaultFoundation(): F = js.native
  // Subclasses should override this method if they need to perform work to synchronize with a host DOM
  // object. An example of this would be a form control wrapper that needs to synchronize its internal state
  // to some property or attribute of the host DOM. Please note: this is *not* the place to perform DOM
  // reads/writes that would cause layout / paint, as this is called synchronously from within the constructor.
  def initialSyncWithDOM(): scala.Unit = js.native
  // Subclasses can override this to do any additional setup work that would be considered part of a
  // "constructor". Essentially, it is a hook into the parent constructor before the foundation is
  // initialized. Any additional arguments besides root and foundation will be passed in here.
  def initialize(args: js.Any*): scala.Unit = js.native
  /**
    * Wrapper method to add an event listener to the component's root element. This is most useful when
    * listening for custom events.
    */
  def listen(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  /**
    * Wrapper method to remove an event listener to the component's root element. This is most useful when
    * unlistening for custom events.
    */
  def unlisten(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
}

