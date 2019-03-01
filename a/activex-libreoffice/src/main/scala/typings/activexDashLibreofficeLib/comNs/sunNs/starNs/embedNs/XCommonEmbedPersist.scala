package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies common implementation for embedded objects and links persistence. */
trait XCommonEmbedPersist
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows to detect if the data store is read-only.
    * @returns `TRUE` if the data store is readonly or opened readonly `FALSE` otherwise
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state ( has no entry )
    */
  def isReadonly(): scala.Boolean
  /**
    * lets the object or the link reload itself.
    *
    * If the object has persistence it will be reloaded from its persistent entry.
    * @param aMediaArgs optional parameters for document reloading, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for object reloading, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def reload(
    aMediaArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aObjectArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * lets the object or the link store itself.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during saving
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def storeOwn(): scala.Unit
}

object XCommonEmbedPersist {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    isReadonly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reload: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    storeOwn: js.Function0[scala.Unit]
  ): XCommonEmbedPersist = {
    val __obj = js.Dynamic.literal(acquire = acquire, isReadonly = isReadonly, queryInterface = queryInterface, release = release, reload = reload, storeOwn = storeOwn)
  
    __obj.asInstanceOf[XCommonEmbedPersist]
  }
}

