package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * filter for exports
  *
  * Such filters can be used for exporting a content. Of course it's possible to combine it with the service {@link ImportFilter} if import functionality
  * should be available at same implementation too.
  * @see ImportFilter
  */
trait ExportFilter
  extends XExporter
     with XFilter
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed

object ExportFilter {
  @scala.inline
  def apply(
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    filter: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    getName: js.Function0[java.lang.String],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setSourceDocument: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, scala.Unit]
  ): ExportFilter = {
    val __obj = js.Dynamic.literal(Name = Name, acquire = acquire, cancel = cancel, filter = filter, getName = getName, initialize = initialize, queryInterface = queryInterface, release = release, setName = setName, setSourceDocument = setSourceDocument)
  
    __obj.asInstanceOf[ExportFilter]
  }
}

