package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes properties that apply to the whole drawing document. */
trait DocumentSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.Settings
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.HeaderFooterSettings {
  /** enables or disables the fitting of the page to the printable area during print */
  var IsPrintFitPage: scala.Boolean
  /** if this is true and the paper size for printing is larger than the paper size of the printer than the content is tiled over multiple pages. */
  var IsPrintTilePage: scala.Boolean
  /** This is the default logical measure unit that is used for string formatting inside the document, f.e. the measure text */
  var MeasureUnit: scala.Double
  /** is the number format used for page number fields */
  var PageNumberFormat: scala.Double
  /**
    * If this is true, the distance between two paragraphs is the sum of ParaTopMargin of the previous and ParaBottomMargin of the next paragraph. If false,
    * only the greater of the two is chosen.
    */
  var ParagraphSummation: scala.Boolean
  /** is the denominator for the logical scale of the document */
  var ScaleDenominator: scala.Double
  /** is the numerator for the logical scale of the document */
  var ScaleNumerator: scala.Double
}

object DocumentSettings {
  @scala.inline
  def apply(
    AddExternalLeading: scala.Boolean,
    ApplyUserData: scala.Boolean,
    AutoCalculate: scala.Boolean,
    BitmapTableURL: java.lang.String,
    CharacterCompressionType: scala.Double,
    ColorTableURL: java.lang.String,
    CurrentDatabaseCommand: java.lang.String,
    CurrentDatabaseCommandType: scala.Double,
    CurrentDatabaseDataSource: java.lang.String,
    DashTableURL: java.lang.String,
    DefaultTabStop: scala.Double,
    EmbedFonts: scala.Boolean,
    EmbedSystemFonts: scala.Boolean,
    FieldAutoUpdate: scala.Boolean,
    ForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters,
    GradientTableURL: java.lang.String,
    HatchTableURL: java.lang.String,
    IsKernAsianPunctuation: scala.Boolean,
    IsPrintBooklet: scala.Boolean,
    IsPrintBookletBack: scala.Boolean,
    IsPrintBookletFront: scala.Boolean,
    IsPrintDate: scala.Boolean,
    IsPrintFitPage: scala.Boolean,
    IsPrintPageName: scala.Boolean,
    IsPrintTilePage: scala.Boolean,
    IsPrintTime: scala.Boolean,
    LineEndTableURL: java.lang.String,
    LinkUpdateMode: scala.Double,
    MeasureUnit: scala.Double,
    PageNumberFormat: scala.Double,
    ParagraphSummation: scala.Boolean,
    PrintQuality: scala.Double,
    PrinterIndependentLayout: scala.Double,
    PrinterName: java.lang.String,
    PrinterSetup: activexDashInteropLib.SafeArray[scala.Double],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SaveVersionOnClose: scala.Boolean,
    ScaleDenominator: scala.Double,
    ScaleNumerator: scala.Double,
    UpdateFromTemplate: scala.Boolean,
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DocumentSettings = {
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading, ApplyUserData = ApplyUserData, AutoCalculate = AutoCalculate, BitmapTableURL = BitmapTableURL, CharacterCompressionType = CharacterCompressionType, ColorTableURL = ColorTableURL, CurrentDatabaseCommand = CurrentDatabaseCommand, CurrentDatabaseCommandType = CurrentDatabaseCommandType, CurrentDatabaseDataSource = CurrentDatabaseDataSource, DashTableURL = DashTableURL, DefaultTabStop = DefaultTabStop, EmbedFonts = EmbedFonts, EmbedSystemFonts = EmbedSystemFonts, FieldAutoUpdate = FieldAutoUpdate, ForbiddenCharacters = ForbiddenCharacters, GradientTableURL = GradientTableURL, HatchTableURL = HatchTableURL, IsKernAsianPunctuation = IsKernAsianPunctuation, IsPrintBooklet = IsPrintBooklet, IsPrintBookletBack = IsPrintBookletBack, IsPrintBookletFront = IsPrintBookletFront, IsPrintDate = IsPrintDate, IsPrintFitPage = IsPrintFitPage, IsPrintPageName = IsPrintPageName, IsPrintTilePage = IsPrintTilePage, IsPrintTime = IsPrintTime, LineEndTableURL = LineEndTableURL, LinkUpdateMode = LinkUpdateMode, MeasureUnit = MeasureUnit, PageNumberFormat = PageNumberFormat, ParagraphSummation = ParagraphSummation, PrintQuality = PrintQuality, PrinterIndependentLayout = PrinterIndependentLayout, PrinterName = PrinterName, PrinterSetup = PrinterSetup, PropertySetInfo = PropertySetInfo, SaveVersionOnClose = SaveVersionOnClose, ScaleDenominator = ScaleDenominator, ScaleNumerator = ScaleNumerator, UpdateFromTemplate = UpdateFromTemplate, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[DocumentSettings]
  }
}

