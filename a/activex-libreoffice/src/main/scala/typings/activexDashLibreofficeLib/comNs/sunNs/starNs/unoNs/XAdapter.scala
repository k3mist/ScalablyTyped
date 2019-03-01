package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the server-side interface to a weak adapter.
  *
  * The implementation of {@link XAdapter} must know but not hold the adapted object, because it must not affect the lifetime of the adapted object.
  * @see XWeak for description of concepts.
  */
trait XAdapter extends XInterface {
  /**
    * adds a reference to the adapter.
    *
    * All added references are called when the adapted object dies.
    */
  def addReference(xRef: XReference): scala.Unit
  /** queries the adapted object if it is alive. */
  def queryAdapted(): XInterface
  /** removes a reference from the adapter. */
  def removeReference(xRef: XReference): scala.Unit
}

object XAdapter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addReference: js.Function1[XReference, scala.Unit],
    queryAdapted: js.Function0[XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeReference: js.Function1[XReference, scala.Unit]
  ): XAdapter = {
    val __obj = js.Dynamic.literal(acquire = acquire, addReference = addReference, queryAdapted = queryAdapted, queryInterface = queryInterface, release = release, removeReference = removeReference)
  
    __obj.asInstanceOf[XAdapter]
  }
}

