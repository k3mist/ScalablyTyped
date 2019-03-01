package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * initializes an object directly after its creation.
  *
  * This interface works together with factories. If you want to initialize the object after creation, you should support this interface and you may
  * support other interfaces which offer type-safe initialization methods.
  *
  * Instead of calling {@link XSingleComponentFactory.createInstanceWithContext()} and later {@link initialize()} , you should call {@link
  * XSingleComponentFactory.createInstanceWithArgumentsAndContext()} to pass the arguments to the instance. The reason is, that a component may want to
  * return the same instance for the same set of parameters, and it can do so by implementing the factory itself.
  */
trait XInitialization
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * initializes the object.
    *
    * It should be called directly after the object is created.
    */
  def initialize(aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): scala.Unit
}

object XInitialization {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInitialization = {
    val __obj = js.Dynamic.literal(acquire = acquire, initialize = initialize, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInitialization]
  }
}

