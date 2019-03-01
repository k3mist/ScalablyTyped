package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to query, register and unregister user interface controller.
  *
  * A user interface controller can be registered for a command URL. A certain user interface controller will be created when a user interface element
  * contains a registered command URL.
  * @see PopupMenuControllerFactory
  * @since OOo 2.0
  */
trait XUIControllerRegistration
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * function to remove a previously defined association between a user interface controller implementation and a command URL and optional module.
    * @param aCommandURL a command URL which specifies an action which should be associated with a user interface controller.
    * @param aModelName an optional name of an OpenOffice model service. This value can remain empty if no model service name was specified.
    */
  def deregisterController(aCommandURL: java.lang.String, aModelName: java.lang.String): scala.Unit
  /**
    * function to check if an user interface controller is registered for a command URL and optional module.
    * @param aCommandURL a command URL which specifies an action.
    * @param aModelName an optional name of an OpenOffice model service. This value can remain empty if no model service name was specified.
    * @returns true if a controller was registered for the combination of command URL and model name.
    */
  def hasController(aCommandURL: java.lang.String, aModelName: java.lang.String): scala.Boolean
  /**
    * function to create an association between a user interface controller implementation and a command URL and optional module.
    * @param aCommandURL a command URL which specifies an action which should be associated with a user interface controller.
    * @param aModelName an optional name of an OpenOffice model service. This value can remain empty if no model service name was specified.
    * @param aControllerImplementationName a UNO implementation name that can be used to create a user interface controller with the OpenOffice service manager.
    */
  def registerController(
    aCommandURL: java.lang.String,
    aModelName: java.lang.String,
    aControllerImplementationName: java.lang.String
  ): scala.Unit
}

object XUIControllerRegistration {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    deregisterController: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    hasController: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerController: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    release: js.Function0[scala.Unit]
  ): XUIControllerRegistration = {
    val __obj = js.Dynamic.literal(acquire = acquire, deregisterController = deregisterController, hasController = hasController, queryInterface = queryInterface, registerController = registerController, release = release)
  
    __obj.asInstanceOf[XUIControllerRegistration]
  }
}

