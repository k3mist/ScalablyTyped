package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `GraphicObject` service can be used to create {@link XGraphicObject} instances.
  *
  * {@link XGraphicObject} objects are accessible using {@link GraphicObject} scheme URLs like
  * `vnd.sun.star.GraphicObject:10000000000001940000012FB99807BD` . As long as at least one instance of {@link XGraphicObject} with a particular UniqueID
  * exists, the associated image/graphic is available.
  * @see GraphicObject
  * @see GraphicProvider
  * @see MediaProperties
  */
trait GraphicObject extends XGraphicObject {
  /** Creates an {@link GraphicObject} */
  def create(): scala.Unit
  /**
    * Creates an {@link GraphicObject} with `uniqueId`
    * @param uniqueId If another {@link XGraphicObject} with `uniqueId` exists, this {@link GraphicObject} is populated with the other {@link GraphicObject} '
    */
  def createWithId(uniqueId: java.lang.String): scala.Unit
}

object GraphicObject {
  @scala.inline
  def apply(
    Graphic: XGraphic,
    UniqueID: java.lang.String,
    acquire: js.Function0[scala.Unit],
    create: js.Function0[scala.Unit],
    createWithId: js.Function1[java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): GraphicObject = {
    val __obj = js.Dynamic.literal(Graphic = Graphic, UniqueID = UniqueID, acquire = acquire, create = create, createWithId = createWithId, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[GraphicObject]
  }
}

