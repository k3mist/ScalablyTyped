package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapWebClientUIWidget class.
  */
trait BootstrapUIWidgetBase extends ASPxClientControl {
  /**
    * Fires when the widget is removed from the DOM using the remove(), empty(), or html() jQuery methods only.
    */
  var Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]]
  /**
    * Fires when the widget has finished drawing itself.
    */
  var Drawn: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]]
  /**
    * Fires after data from the widget is exported.
    */
  var Exported: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]]
  /**
    * Fires before data from the widget is exported.
    */
  var Exporting: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]]
  /**
    * Raised before a file with exported data is saved on the user's local storage.
    */
  var FileSaving: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]]
  /**
    * Fires when an error or warning appears in the widget.
    */
  var IncidentOccurred: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]]
  /**
    * Fires once, after the widget is initialized.
    */
  @JSName("Init")
  var Init_BootstrapUIWidgetBase: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]]
  /**
    * Fires after an option of the widget has been changed.
    */
  var OptionChanged: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]]
  /**
    * Exports the widget.
    * @param format A string specifying the target file format.
    * @param fileName A string specifying the file name.
    */
  def ExportTo(format: java.lang.String, fileName: java.lang.String): scala.Unit
  /**
    * Gets the client data source instance.
    */
  def GetDataSource(): js.Object
  /**
    * Gets an instance of the widget.
    */
  def GetInstance(): js.Object
  /**
    * Invokes the browser's Print window to print the widget's contents.
    */
  def Print(): scala.Unit
  /**
    * Gets the client data source instance.
    * @param dataSource A DevExtreme <a href="https://js.devexpress.com/Documentation/ApiReference/Data_Layer/DataSource/">DataSource</a> object.
    */
  def SetDataSource(dataSource: js.Object): scala.Unit
  /**
    * Sets the widget's options to values specified in the passed object.
    * @param options An object containing key-value pairs specifying new option values.
    */
  def SetOptions(options: js.Object): scala.Unit
}

object BootstrapUIWidgetBase {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]],
    Drawn: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]],
    ExportTo: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    Exported: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]],
    Exporting: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]],
    FileSaving: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]],
    GetClientVisible: js.Function0[scala.Boolean],
    GetDataSource: js.Function0[js.Object],
    GetHeight: js.Function0[scala.Double],
    GetInstance: js.Function0[js.Object],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    IncidentOccurred: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]],
    Init: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]],
    OptionChanged: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]],
    Print: js.Function0[scala.Unit],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetDataSource: js.Function1[js.Object, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetOptions: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): BootstrapUIWidgetBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, Disposing = Disposing, Drawn = Drawn, ExportTo = ExportTo, Exported = Exported, Exporting = Exporting, FileSaving = FileSaving, GetClientVisible = GetClientVisible, GetDataSource = GetDataSource, GetHeight = GetHeight, GetInstance = GetInstance, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, IncidentOccurred = IncidentOccurred, Init = Init, OptionChanged = OptionChanged, Print = Print, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetDataSource = SetDataSource, SetHeight = SetHeight, SetOptions = SetOptions, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[BootstrapUIWidgetBase]
  }
}

