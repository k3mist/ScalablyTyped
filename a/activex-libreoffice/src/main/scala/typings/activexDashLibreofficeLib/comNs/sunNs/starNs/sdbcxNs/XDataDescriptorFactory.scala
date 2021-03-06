package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the creation of a descriptor for a definition object. */
trait XDataDescriptorFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a descriptor of a definition object.
    * @returns the descriptor for that kind of objects
    */
  def createDataDescriptor(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XDataDescriptorFactory {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createDataDescriptor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDataDescriptorFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataDescriptorFactory]
  }
}

