package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** has to be supported by charts providing the capabilities of a horizontal axis, i.e., an **x** -axis. */
trait ChartAxisXSupplier extends XAxisXSupplier {
  /**
    * This property determines if the x-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasXAxis: scala.Boolean
  /** Determines if the description of the x-axis is shown or hidden. */
  var HasXAxisDescription: scala.Boolean
  /**
    * Determines if the major grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisGrid: scala.Boolean
  /**
    * Determines if the minor grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisHelpGrid: scala.Boolean
  /**
    * Determines if the title of the x-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasXAxisTitle: scala.Boolean
}

object ChartAxisXSupplier {
  @scala.inline
  def apply(
    HasXAxis: scala.Boolean,
    HasXAxisDescription: scala.Boolean,
    HasXAxisGrid: scala.Boolean,
    HasXAxisHelpGrid: scala.Boolean,
    HasXAxisTitle: scala.Boolean,
    XAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    XHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getXAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getXHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): ChartAxisXSupplier = {
    val __obj = js.Dynamic.literal(HasXAxis = HasXAxis, HasXAxisDescription = HasXAxisDescription, HasXAxisGrid = HasXAxisGrid, HasXAxisHelpGrid = HasXAxisHelpGrid, HasXAxisTitle = HasXAxisTitle, XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, acquire = acquire, getXAxis = getXAxis, getXAxisTitle = getXAxisTitle, getXHelpGrid = getXHelpGrid, getXMainGrid = getXMainGrid, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[ChartAxisXSupplier]
  }
}

