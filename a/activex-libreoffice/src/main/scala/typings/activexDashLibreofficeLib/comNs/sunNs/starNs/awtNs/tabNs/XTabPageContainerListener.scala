package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link XTabPageContainer} to get notifications about changes in activation of tab pages.
  * @since OOo 3.4
  */
trait XTabPageContainerListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** Invoked after a tab page was activated. */
  def tabPageActivated(tabPageActivatedEvent: TabPageActivatedEvent): scala.Unit
}

object XTabPageContainerListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    tabPageActivated: js.Function1[TabPageActivatedEvent, scala.Unit]
  ): XTabPageContainerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, tabPageActivated = tabPageActivated)
  
    __obj.asInstanceOf[XTabPageContainerListener]
  }
}

