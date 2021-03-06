package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to replace strings in a text described by a {@link SearchDescriptor} .
  *
  * Example: replace all bold words "search for" by "look for"
  *
  * {{program example here, see documentation}}
  */
trait XReplaceable extends XSearchable {
  /**
    * creates a descriptor which contains properties that specify a search in this container.
    * @see SearchDescriptor
    */
  def createReplaceDescriptor(): XReplaceDescriptor
  /**
    * searches for all occurrences of whatever is specified.
    * @see SearchDescriptor
    */
  def replaceAll(xDesc: XSearchDescriptor): scala.Double
}

object XReplaceable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createReplaceDescriptor: () => XReplaceDescriptor,
    createSearchDescriptor: () => XSearchDescriptor,
    findAll: XSearchDescriptor => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    findFirst: XSearchDescriptor => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    findNext: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, XSearchDescriptor) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    replaceAll: XSearchDescriptor => scala.Double
  ): XReplaceable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createReplaceDescriptor = js.Any.fromFunction0(createReplaceDescriptor), createSearchDescriptor = js.Any.fromFunction0(createSearchDescriptor), findAll = js.Any.fromFunction1(findAll), findFirst = js.Any.fromFunction1(findFirst), findNext = js.Any.fromFunction2(findNext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceAll = js.Any.fromFunction1(replaceAll))
  
    __obj.asInstanceOf[XReplaceable]
  }
}

