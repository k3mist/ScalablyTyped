package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** registers listeners for specified events. */
trait XEventAttacherManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds an {@link XScriptListener} that will be notified when an event takes place. For that a {@link ScriptEventDescriptor} is registered at and
    * attached to an object by an {@link XEventAttacherManager} .
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see removeScriptListener
    */
  def addScriptListener(xListener: XScriptListener): scala.Unit
  /**
    * attaches all the ScriptEvents which are registered for the given index to the given object.
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    */
  def attach(
    nIndex: scala.Double,
    xObject: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    aHelper: js.Any
  ): scala.Unit
  /**
    * detaches all the ScriptEvents from the given object which are registered at this object for the given index.
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    */
  def detach(nIndex: scala.Double, xObject: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
  /**
    * @param Index an index previously inserted with the method insertEntry.
    * @returns all events registered for the given object index.
    * @throws IllegalArgumentException if Index is not valid.
    */
  def getScriptEvents(Index: scala.Double): activexDashInteropLib.SafeArray[ScriptEventDescriptor]
  /**
    * creates an empty entry at the given position.
    *
    * The index **n** of all entries with `n &gt;= nIndex` will be increased by one.
    */
  def insertEntry(nIndex: scala.Double): scala.Unit
  /**
    * registers one event for an object identified by its index.
    *
    * If any object is attached under this index, then this event is attached automatically.
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    */
  def registerScriptEvent(nIndex: scala.Double, aScriptEvent: ScriptEventDescriptor): scala.Unit
  /**
    * registers several events for an object identified by its index.
    *
    * The result is the same as if the method {@link registerScriptEvent()} was called once for each {@link ScriptEventDescriptor} in the sequence.
    *
    * If any object is attached under this index, then this event is attached automatically (see {@link attach()} )
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    * @see registerScriptEvent
    * @see attach
    */
  def registerScriptEvents(
    nIndex: scala.Double,
    aScriptEvents: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ScriptEventDescriptor]
  ): scala.Unit
  /**
    * removes the entry at the given position.
    *
    * If any events are registered at this index, they will be revoked, too. So if the events at this index have been attached to any object they are
    * detached automatically. (see {@link attach()} ).
    * @see attach
    */
  def removeEntry(nIndex: scala.Double): scala.Unit
  /**
    * removes a {@link XScriptListener} from the listener list.
    *
    * Nothing happens if the listener is not registered.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see addScriptListener
    */
  def removeScriptListener(Listener: XScriptListener): scala.Unit
  /**
    * revokes the registration of an event.
    *
    * The parameters **ListenerType** and **EventMethod** are equivalent to the first two members of the {@link ScriptEventDescriptor} used to register
    * events. If this event at this index has been attached to any object, it is detached automatically (see {@link attach()} ).
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    * @see attach
    */
  def revokeScriptEvent(
    nIndex: scala.Double,
    aListenerType: java.lang.String,
    aEventMethod: java.lang.String,
    aRemoveListenerParam: java.lang.String
  ): scala.Unit
  /**
    * revokes all events which are registered for the given index.
    *
    * If the events at this index have been attached to any object, they are detached automatically. (see {@link attach()} ).
    * @see attach
    */
  def revokeScriptEvents(nIndex: scala.Double): scala.Unit
}

object XEventAttacherManager {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addScriptListener: js.Function1[XScriptListener, scala.Unit],
    attach: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      js.Any, 
      scala.Unit
    ],
    detach: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      scala.Unit
    ],
    getScriptEvents: js.Function1[scala.Double, activexDashInteropLib.SafeArray[ScriptEventDescriptor]],
    insertEntry: js.Function1[scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerScriptEvent: js.Function2[scala.Double, ScriptEventDescriptor, scala.Unit],
    registerScriptEvents: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ScriptEventDescriptor], 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    removeEntry: js.Function1[scala.Double, scala.Unit],
    removeScriptListener: js.Function1[XScriptListener, scala.Unit],
    revokeScriptEvent: js.Function4[scala.Double, java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    revokeScriptEvents: js.Function1[scala.Double, scala.Unit]
  ): XEventAttacherManager = {
    val __obj = js.Dynamic.literal(acquire = acquire, addScriptListener = addScriptListener, attach = attach, detach = detach, getScriptEvents = getScriptEvents, insertEntry = insertEntry, queryInterface = queryInterface, registerScriptEvent = registerScriptEvent, registerScriptEvents = registerScriptEvents, release = release, removeEntry = removeEntry, removeScriptListener = removeScriptListener, revokeScriptEvent = revokeScriptEvent, revokeScriptEvents = revokeScriptEvents)
  
    __obj.asInstanceOf[XEventAttacherManager]
  }
}

