package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a single layer of configuration data */
trait SingleLayerStratum
  extends XSingleLayerStratum
     with XBackendEntities

object SingleLayerStratum {
  @scala.inline
  def apply(
    AdminEntity: java.lang.String,
    OwnerEntity: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getAdminEntity: js.Function0[java.lang.String],
    getLayer: js.Function2[java.lang.String, java.lang.String, XLayer],
    getOwnerEntity: js.Function0[java.lang.String],
    getUpdatableLayer: js.Function1[java.lang.String, XUpdatableLayer],
    isEqualEntity: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    supportsEntity: js.Function1[java.lang.String, scala.Boolean]
  ): SingleLayerStratum = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity, OwnerEntity = OwnerEntity, acquire = acquire, getAdminEntity = getAdminEntity, getLayer = getLayer, getOwnerEntity = getOwnerEntity, getUpdatableLayer = getUpdatableLayer, isEqualEntity = isEqualEntity, queryInterface = queryInterface, release = release, supportsEntity = supportsEntity)
  
    __obj.asInstanceOf[SingleLayerStratum]
  }
}

