package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows importing a layer into a {@link Backend}
  * @since OOo 1.1.2
  */
trait XLayerImporter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets the target backend for importing.
    * @returns the {@link Backend} into which layers are imported by {@link XLayerImporter.importLayer()} .
    */
  var TargetBackend: XBackend
  /**
    * gets the target backend for importing.
    * @returns the {@link Backend} into which layers are imported by {@link XLayerImporter.importLayer()} .
    */
  def getTargetBackend(): XBackend
  /**
    * Imports the layer given into the backend.
    *
    * This method imports data for the current entity of the backend.
    * @param aLayer a layer whose data will be imported into the backend
    * @see com.sun.star.configuration.backend.XBackend.getOwnUpdateHandler()
    * @throws com::sun::star::lang::NullPointerException if the layer passed is `NULL` or no backend is available.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the layer passed is invalid
    * @throws com::sun::star::lang::IllegalArgumentException if the layer passed is for a component that doesn't exist in the backend
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the backend or source layer.
    */
  def importLayer(aLayer: XLayer): scala.Unit
  /**
    * Imports the layer given into the backend for a given entity.
    *
    * This method imports data for the current entity of the backend.
    * @param aLayer a layer whose data will be imported into the backend
    * @param aEntity a entity into whose data the layer will be imported
    * @see com.sun.star.configuration.backend.XBackend.getUpdateHandler()
    * @throws com::sun::star::lang::NullPointerException if the layer passed is `NULL` or no backend is available.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the layer passed is invalid
    * @throws com::sun::star::lang::IllegalArgumentException if the layer passed is for a component that doesn't exist in the backend or if the entity doesn't
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the backend or source layer.
    */
  def importLayerForEntity(aLayer: XLayer, aEntity: java.lang.String): scala.Unit
  /**
    * sets the target backend for importing.
    * @param aBackend a {@link Backend} into which layers should be imported by {@link XLayerImporter.importLayer()} .
    * @throws com::sun::star::lang::NullPointerException if the backend passed is `NULL` .
    */
  def setTargetBackend(aBackend: XBackend): scala.Unit
}

object XLayerImporter {
  @scala.inline
  def apply(
    TargetBackend: XBackend,
    acquire: () => scala.Unit,
    getTargetBackend: () => XBackend,
    importLayer: XLayer => scala.Unit,
    importLayerForEntity: (XLayer, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setTargetBackend: XBackend => scala.Unit
  ): XLayerImporter = {
    val __obj = js.Dynamic.literal(TargetBackend = TargetBackend, acquire = js.Any.fromFunction0(acquire), getTargetBackend = js.Any.fromFunction0(getTargetBackend), importLayer = js.Any.fromFunction1(importLayer), importLayerForEntity = js.Any.fromFunction2(importLayerForEntity), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTargetBackend = js.Any.fromFunction1(setTargetBackend))
  
    __obj.asInstanceOf[XLayerImporter]
  }
}

