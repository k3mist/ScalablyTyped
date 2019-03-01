package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a virtual printer.
  *
  * All properties are vetoable properties. If you change the properties between a call to {@link com.sun.star.awt.XPrinter.startPage()} and a call to
  * {@link com.sun.star.awt.XPrinter.endPage()} , a {@link com.sun.star.beans.PropertyVetoException} is thrown.
  */
trait XPrinter extends XPrinterPropertySet {
  /**
    * notifies the printer spooler that the job is done and printing starts.
    * @see terminate
    */
  def end(): scala.Unit
  /** ends the current page. */
  def endPage(): scala.Unit
  /**
    * puts the job into the printer spooler.
    *
    * This call may block the thread. So release all resources (mutex, semaphore, etc.) before this call.
    */
  def start(nJobName: java.lang.String, nCopies: scala.Double, nCollate: scala.Boolean): scala.Boolean
  /** begins with a new page. */
  def startPage(): XDevice
  /**
    * stops the current print job.
    *
    * If the method {@link com.sun.star.awt.XPrinter.end()} is called beforehand, then this call does nothing. If you call {@link
    * com.sun.star.awt.XPrinter.terminate()} in or before the call to {@link com.sun.star.awt.XPrinter.start()} , {@link
    * com.sun.star.awt.XPrinter.terminate()} returns `FALSE` . This call must not block the thread.
    * @see end
    */
  def terminate(): scala.Unit
}

object XPrinter {
  @scala.inline
  def apply(
    BinarySetup: activexDashInteropLib.SafeArray[scala.Double],
    FormDescriptions: activexDashInteropLib.SafeArray[java.lang.String],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    end: js.Function0[scala.Unit],
    endPage: js.Function0[scala.Unit],
    getBinarySetup: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getFormDescriptions: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    selectForm: js.Function1[java.lang.String, scala.Unit],
    setBinarySetup: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    setHorizontal: js.Function1[scala.Boolean, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    start: js.Function3[java.lang.String, scala.Double, scala.Boolean, scala.Boolean],
    startPage: js.Function0[XDevice],
    terminate: js.Function0[scala.Unit]
  ): XPrinter = {
    val __obj = js.Dynamic.literal(BinarySetup = BinarySetup, FormDescriptions = FormDescriptions, PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, end = end, endPage = endPage, getBinarySetup = getBinarySetup, getFormDescriptions = getFormDescriptions, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, selectForm = selectForm, setBinarySetup = setBinarySetup, setHorizontal = setHorizontal, setPropertyValue = setPropertyValue, start = start, startPage = startPage, terminate = terminate)
  
    __obj.asInstanceOf[XPrinter]
  }
}

