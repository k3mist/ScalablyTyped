package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports to notify other implementations about changes of a user interface configuration manager.
  *
  * The {@link XUIConfiguration} interface is provided for user interface configuration managers which need to broadcast changes within the container;
  * that means the actions of adding, replacing and removing elements are broadcast to listeners.
  *
  * This can be useful for UI to enable/disable some functions without actually accessing the data.
  * @since OOo 2.0
  */
trait XUIConfiguration
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive events when elements are changed, inserted or removed.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see XUIConfigurationListener
    */
  def addConfigurationListener(Listener: XUIConfigurationListener): scala.Unit
  /**
    * removes the specified listener so it does not receive any events from this user interface configuration manager.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see XUIConfigurationListener
    */
  def removeConfigurationListener(Listener: XUIConfigurationListener): scala.Unit
}

object XUIConfiguration {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addConfigurationListener: XUIConfigurationListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeConfigurationListener: XUIConfigurationListener => scala.Unit
  ): XUIConfiguration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener))
  
    __obj.asInstanceOf[XUIConfiguration]
  }
}

