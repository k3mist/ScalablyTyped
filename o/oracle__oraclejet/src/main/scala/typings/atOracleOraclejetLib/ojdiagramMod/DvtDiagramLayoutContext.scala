package typings
package atOracleOraclejetLib.ojdiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvtDiagramLayoutContext extends js.Object {
  def getCommonContainer(nodeId1: js.Any, nodeId2: js.Any): js.Any
  def getComponentSize(): atOracleOraclejetLib.Anon_H
  def getCurrentViewport(): atOracleOraclejetLib.Anon_H
  def getEventData(): js.Object
  def getLinkById(id: js.Any): DvtDiagramLayoutContextLink
  def getLinkByIndex(index: scala.Double): DvtDiagramLayoutContextLink
  def getLinkCount(): scala.Double
  def getNodeById(id: js.Any): DvtDiagramLayoutContextNode
  def getNodeByIndex(index: scala.Double): DvtDiagramLayoutContextNode
  def getNodeCount(): scala.Double
  def getViewport(): atOracleOraclejetLib.Anon_H
  def isLocaleR2L(): scala.Boolean
  def setViewport(viewport: atOracleOraclejetLib.Anon_H): scala.Unit
}

object DvtDiagramLayoutContext {
  @scala.inline
  def apply(
    getCommonContainer: js.Function2[js.Any, js.Any, js.Any],
    getComponentSize: js.Function0[atOracleOraclejetLib.Anon_H],
    getCurrentViewport: js.Function0[atOracleOraclejetLib.Anon_H],
    getEventData: js.Function0[js.Object],
    getLinkById: js.Function1[js.Any, DvtDiagramLayoutContextLink],
    getLinkByIndex: js.Function1[scala.Double, DvtDiagramLayoutContextLink],
    getLinkCount: js.Function0[scala.Double],
    getNodeById: js.Function1[js.Any, DvtDiagramLayoutContextNode],
    getNodeByIndex: js.Function1[scala.Double, DvtDiagramLayoutContextNode],
    getNodeCount: js.Function0[scala.Double],
    getViewport: js.Function0[atOracleOraclejetLib.Anon_H],
    isLocaleR2L: js.Function0[scala.Boolean],
    setViewport: js.Function1[atOracleOraclejetLib.Anon_H, scala.Unit]
  ): DvtDiagramLayoutContext = {
    val __obj = js.Dynamic.literal(getCommonContainer = getCommonContainer, getComponentSize = getComponentSize, getCurrentViewport = getCurrentViewport, getEventData = getEventData, getLinkById = getLinkById, getLinkByIndex = getLinkByIndex, getLinkCount = getLinkCount, getNodeById = getNodeById, getNodeByIndex = getNodeByIndex, getNodeCount = getNodeCount, getViewport = getViewport, isLocaleR2L = isLocaleR2L, setViewport = setViewport)
  
    __obj.asInstanceOf[DvtDiagramLayoutContext]
  }
}

