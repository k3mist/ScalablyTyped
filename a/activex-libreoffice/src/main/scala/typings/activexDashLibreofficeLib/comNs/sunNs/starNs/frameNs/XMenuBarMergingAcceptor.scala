package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functions to set and remove a merged menu bar for inplace editing.
  * @since OOo 2.0
  */
trait XMenuBarMergingAcceptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** removes a previously set merged menu bar and sets a previously created menu bar back. */
  def removeMergedMenuBar(): scala.Unit
  /**
    * allows to set a merged menu bar.
    * @param xMergedMenuBar specifies the merged menu bar.  This function is normally used to provide inplace editing where functions from two application par
    * @see com.sun.star.ui.UIElementSettings
    * @see com.sun.star.frame.XDispatchProvider
    * @see com.sun.star.frame.XLayoutManager
    */
  def setMergedMenuBar(xMergedMenuBar: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess): scala.Boolean
}

object XMenuBarMergingAcceptor {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeMergedMenuBar: js.Function0[scala.Unit],
    setMergedMenuBar: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, 
      scala.Boolean
    ]
  ): XMenuBarMergingAcceptor = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, removeMergedMenuBar = removeMergedMenuBar, setMergedMenuBar = setMergedMenuBar)
  
    __obj.asInstanceOf[XMenuBarMergingAcceptor]
  }
}

