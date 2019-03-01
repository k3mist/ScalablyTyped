package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to release any objects in a ordered manner by using a two-step mechanism
  *
  * If an object should be terminated, it can be: ; disposed (if it supports {@link com.sun.star.lang.XComponent.dispose()} )closed (if it supports {@link
  * XCloseable.close()} ) First version gives the object no chance to disagree with that (e.g. if a process is still running and can't be canceled
  * really). Last version provides this possibility, but can't guarantee real termination of called object. It depends from the environment of an object,
  * if one or both mechanism are necessary.
  *
  * Base interface {@link XCloseBroadcaster} makes it possible that any listener which is interested on life time of listened object ... can get a
  * notification about closing of itor can have a veto to break that.
  * @see com.sun.star.lang.XComponent.dispose()
  * @see XCloseBroadcaster
  * @see XCloseListener
  */
trait XCloseable extends XCloseBroadcaster {
  /**
    * try to close the object
    *
    * Must definitely be called before {@link com.sun.star.lang.XComponent.dispose()} . But nobody can guarantee real closing of called object - because it
    * can disagree with that if any still running processes can't be canceled yet. It's not allowed to block this call till internal operations will be
    * finished here. They must be canceled or call must return immediately by throwing the {@link CloseVetoException} . Otherwise (if nothing exist to
    * disagree) it must return normally.
    *
    * Before any internal processes will be canceled, all registered {@link XCloseListener} must be notified. Any of them can disagree with a {@link
    * CloseVetoException} too. It's forbidden to catch this exception inside the called {@link close()} method because the caller must get this information!
    *
    * If somewhere disagree with a {@link CloseVetoException} it will not clear who has to close the object again after still running processes was
    * finished. The parameter **DeliverOwnership** regulate that. If it is set to `FALSE` the caller of the method {@link close()} will be the owner of this
    * object in every case. Then it's not allowed to call {@link close()} from any other place (may a registered {@link XCloseListener} ). If it is set to
    * `TRUE` the caller gives up his ownership. If a {@link XCloseListener} throw the veto exception he will be the new owner of the closing object. This
    * information is passed to the listener by a parameter of his notification method {@link XCloseListener.queryClosing()} . After his operations was
    * finished he MUST try to close it again. If the closing object itself disagree by an exception and the parameter **DeliverOwnership** was set to `TRUE`
    * the object will be his own owner with all consequences of that. ; **Note:**;  There is no way to get the ownership back if it was delivered!
    *
    * If this method was already called on an object it should return without any reaction. Normally it's possible to throw a {@link
    * com.sun.star.lang.DisposedException} for already disposed or closed objects (which represent a {@link com.sun.star.uno.RuntimeException} and can be
    * thrown by every interface call), but it shouldn't be used here. The veto exception should be the only way to indicates the result.
    * @param DeliverOwnership `TRUE` delegates the ownership of this closing object to any one which throw the {@link CloseVetoException} . This new owner has
    * @see XCloseListener
    * @see CloseVetoException
    * @see com.sun.star.lang.XComponent.dispose()
    * @see com.sun.star.lang.DisposedException
    * @throws CloseVetoException indicates that the closing object himself or any of his currently registered listener disagree with this {@link close()} request.
    */
  def close(DeliverOwnership: scala.Boolean): scala.Unit
}

object XCloseable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addCloseListener: js.Function1[XCloseListener, scala.Unit],
    close: js.Function1[scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeCloseListener: js.Function1[XCloseListener, scala.Unit]
  ): XCloseable = {
    val __obj = js.Dynamic.literal(acquire = acquire, addCloseListener = addCloseListener, close = close, queryInterface = queryInterface, release = release, removeCloseListener = removeCloseListener)
  
    __obj.asInstanceOf[XCloseable]
  }
}

