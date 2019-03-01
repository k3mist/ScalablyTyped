package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a service to load a dialog model and allows to access the control models inside
  * @since OOo 3.3
  */
trait UnoControlDialogModelProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer {
  /** Creates a new dialog model */
  def create(URL: java.lang.String): scala.Unit
}

object UnoControlDialogModelProvider {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    create: js.Function1[java.lang.String, scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): UnoControlDialogModelProvider = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, create = create, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, insertByName = insertByName, queryInterface = queryInterface, release = release, removeByName = removeByName, replaceByName = replaceByName)
  
    __obj.asInstanceOf[UnoControlDialogModelProvider]
  }
}

