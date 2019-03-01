package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is the callback interface used by the drop target object to provide notification of Drag and Drop operations that involve the subject
  * drop target.
  *
  * Methods of this interface may be implemented to provide "drag under" visual feedback to the user throughout the Drag and Drop operation.
  */
trait XDropTargetListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * Called when a drag operation has encountered the drop target.
    * @param dtdee The {@link DropTargetDragEvent} .
    */
  def dragEnter(dtdee: DropTargetDragEnterEvent): scala.Unit
  /**
    * The drag operation has departed the drop target without dropping.
    * @param dte The {@link DropTargetEvent} .
    */
  def dragExit(dte: DropTargetEvent): scala.Unit
  /**
    * Called when a drag operation is ongoing on the drop target.
    * @param dtde The {@link DropTargetEvent} .
    */
  def dragOver(dtde: DropTargetDragEvent): scala.Unit
  /**
    * The drag operation has terminated with a drop on this drop target.
    *
    * **NOTE:** The implementation has to wait until the method {@link XDropTargetDropContext.dropComplete()} is called before releasing the data for the
    * drop operation. This should occur before returning from drop in a normal flow of operation. Also, the implementor of {@link XDropTargetListener}
    * should not assume the {@link DropTargetDropEvent} to be meaningful after returning from the {@link XDropTargetListener.drop()} method.
    * @param dtde The {@link DropTargetDropEvent} .
    */
  def drop(dtde: DropTargetDropEvent): scala.Unit
  /**
    * Called when the user has modified the drop gesture.
    * @param dtde The {@link DropTargetEvent} .
    */
  def dropActionChanged(dtde: DropTargetDragEvent): scala.Unit
}

object XDropTargetListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    dragEnter: js.Function1[DropTargetDragEnterEvent, scala.Unit],
    dragExit: js.Function1[DropTargetEvent, scala.Unit],
    dragOver: js.Function1[DropTargetDragEvent, scala.Unit],
    drop: js.Function1[DropTargetDropEvent, scala.Unit],
    dropActionChanged: js.Function1[DropTargetDragEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDropTargetListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, dragEnter = dragEnter, dragExit = dragExit, dragOver = dragOver, drop = drop, dropActionChanged = dropActionChanged, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDropTargetListener]
  }
}

