package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of table indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait TableIndex extends BaseIndex {
  /** determines if the name or the label of an object is used to create the index. */
  var CreateFromLabels: scala.Boolean
  /** determines the name of the sequence field that is evaluated to create the index. */
  var LabelCategory: java.lang.String
  /**
    * determines the way the paragraph containing a label is included in the index.
    * @see ReferenceFieldPart allowed constant values: only TEXT, CATEGORY_AND_NUMBER and ONLY_CAPTION
    */
  var LabelDisplayType: scala.Double
}

object TableIndex {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    ContentSection: XTextSection,
    CreateFromChapter: scala.Boolean,
    CreateFromLabels: scala.Boolean,
    HeaderSection: XTextSection,
    IsProtected: scala.Boolean,
    LabelCategory: java.lang.String,
    LabelDisplayType: scala.Double,
    LevelFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace,
    ParaStyleHeading: java.lang.String,
    ParaStyleLevel1: java.lang.String,
    ParaStyleLevel10: java.lang.String,
    ParaStyleLevel2: java.lang.String,
    ParaStyleLevel3: java.lang.String,
    ParaStyleLevel4: java.lang.String,
    ParaStyleLevel5: java.lang.String,
    ParaStyleLevel6: java.lang.String,
    ParaStyleLevel7: java.lang.String,
    ParaStyleLevel8: java.lang.String,
    ParaStyleLevel9: java.lang.String,
    ParaStyleSeparator: java.lang.String,
    ServiceName: java.lang.String,
    TextColumns: XTextColumns,
    Title: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getServiceName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    update: js.Function0[scala.Unit]
  ): TableIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, ContentSection = ContentSection, CreateFromChapter = CreateFromChapter, CreateFromLabels = CreateFromLabels, HeaderSection = HeaderSection, IsProtected = IsProtected, LabelCategory = LabelCategory, LabelDisplayType = LabelDisplayType, LevelFormat = LevelFormat, ParaStyleHeading = ParaStyleHeading, ParaStyleLevel1 = ParaStyleLevel1, ParaStyleLevel10 = ParaStyleLevel10, ParaStyleLevel2 = ParaStyleLevel2, ParaStyleLevel3 = ParaStyleLevel3, ParaStyleLevel4 = ParaStyleLevel4, ParaStyleLevel5 = ParaStyleLevel5, ParaStyleLevel6 = ParaStyleLevel6, ParaStyleLevel7 = ParaStyleLevel7, ParaStyleLevel8 = ParaStyleLevel8, ParaStyleLevel9 = ParaStyleLevel9, ParaStyleSeparator = ParaStyleSeparator, ServiceName = ServiceName, TextColumns = TextColumns, Title = Title, acquire = acquire, addEventListener = addEventListener, addRefreshListener = addRefreshListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getServiceName = getServiceName, queryInterface = queryInterface, refresh = refresh, release = release, removeEventListener = removeEventListener, removeRefreshListener = removeRefreshListener, update = update)
  
    __obj.asInstanceOf[TableIndex]
  }
}

