package typings
package mendixmodelsdkLib.mendixmodelsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MAX_METAMODEL_VERSION: java.lang.String = js.native
  val SDK_VERSION: java.lang.String = js.native
  def createElementFromJSON(
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel,
    json: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IAbstractElementJson
  ): mendixmodelsdkLib.distSdkInternalElementsMod.Element = js.native
  def isNamedElement(element: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/local-by-name-reference.INamedElement */ scala.Boolean = js.native
  def sendListChangeDeltas[T, P](
    property: (mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], mendixmodelsdkLib.distSdkInternalInstancesMod.IList[P]]) with mendixmodelsdkLib.Anon_ToRawChangeValue[P],
    change: mobxLib.libTypesObservablearrayMod.IArrayWillChange[P]
  ): scala.Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], mendixmodelsdkLib.distSdkInternalInstancesMod.IList[P]]) with mendixmodelsdkLib.Anon_ToRawChangeValue[P],
    change: mobxLib.libTypesObservablearrayMod.IArrayWillSplice[P]
  ): scala.Unit = js.native
}

