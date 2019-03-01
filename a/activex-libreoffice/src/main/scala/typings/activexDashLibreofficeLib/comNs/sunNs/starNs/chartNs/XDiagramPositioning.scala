package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allow for different positioning options for a diagram
  * @see Diagram
  */
trait XDiagramPositioning
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the position rectangle of the inner diagram part excluding any axes, labels and titles. Position and size are given in 100/th mm. It might be nec */
  def calculateDiagramPositionExcludingAxes(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /** @returns the position rectangle of the diagram including the axes and axes labels, but excluding the axes titles. Position and size are given in 100/th mm */
  def calculateDiagramPositionIncludingAxes(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /** @returns the position rectangle of the diagram including the axes, axes labels and axes titles. Position and size are given in 100/th mm. It might be nece */
  def calculateDiagramPositionIncludingAxesAndAxisTitles(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /** @returns whether the diagram is placed automatically */
  def isAutomaticDiagramPositioning(): scala.Boolean
  /** @returns true in case the diagram position was set with method setDiagramPositionExcludingAxes */
  def isExcludingDiagramPositioning(): scala.Boolean
  /** the diagram will be placed automatically */
  def setAutomaticDiagramPositioning(): scala.Unit
  /**
    * place the inner diagram part excluding any axes, labels and titles
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionExcludingAxes(PositionRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle): scala.Unit
  /**
    * place the outer diagram part including the axes and axes labels, but excluding the axes titles.
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionIncludingAxes(PositionRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle): scala.Unit
  /**
    * place the diagram including the axes, axes labels and axes titles. For the placement the current axis titles are taken into account, so the titles
    * must be initialized properly before this method is called.
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionIncludingAxesAndAxisTitles(PositionRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle): scala.Unit
}

object XDiagramPositioning {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    calculateDiagramPositionExcludingAxes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    calculateDiagramPositionIncludingAxes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    calculateDiagramPositionIncludingAxesAndAxisTitles: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    isAutomaticDiagramPositioning: js.Function0[scala.Boolean],
    isExcludingDiagramPositioning: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setAutomaticDiagramPositioning: js.Function0[scala.Unit],
    setDiagramPositionExcludingAxes: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setDiagramPositionIncludingAxes: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setDiagramPositionIncludingAxesAndAxisTitles: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit]
  ): XDiagramPositioning = {
    val __obj = js.Dynamic.literal(acquire = acquire, calculateDiagramPositionExcludingAxes = calculateDiagramPositionExcludingAxes, calculateDiagramPositionIncludingAxes = calculateDiagramPositionIncludingAxes, calculateDiagramPositionIncludingAxesAndAxisTitles = calculateDiagramPositionIncludingAxesAndAxisTitles, isAutomaticDiagramPositioning = isAutomaticDiagramPositioning, isExcludingDiagramPositioning = isExcludingDiagramPositioning, queryInterface = queryInterface, release = release, setAutomaticDiagramPositioning = setAutomaticDiagramPositioning, setDiagramPositionExcludingAxes = setDiagramPositionExcludingAxes, setDiagramPositionIncludingAxes = setDiagramPositionIncludingAxes, setDiagramPositionIncludingAxesAndAxisTitles = setDiagramPositionIncludingAxesAndAxisTitles)
  
    __obj.asInstanceOf[XDiagramPositioning]
  }
}

