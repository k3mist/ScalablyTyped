package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface acts as a container for the loaded graphic.
  *
  * The interface itself can be retrieved by using the appropriate methods of {@link XGraphicProvider} interface. {@link XGraphicProvider} also offers a
  * method to store the graphic content at a specific location
  *
  * To render the graphic content onto a specific device, you have to create a {@link XGraphicRenderer} interface and pass this interface appropriately
  * @see XGraphicProvider
  * @see XGraphicRenderer
  */
trait XGraphic
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Get the type of the contained graphic
    * @returns The type of the contained graphic
    * @see GraphicType
    */
  val Type: scala.Double
  /**
    * Get the type of the contained graphic
    * @returns The type of the contained graphic
    * @see GraphicType
    */
  def getType(): scala.Double
}

object XGraphic {
  @scala.inline
  def apply(
    Type: scala.Double,
    acquire: () => scala.Unit,
    getType: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XGraphic = {
    val __obj = js.Dynamic.literal(Type = Type, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XGraphic]
  }
}

