package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a {@link TextRange} which is explicitly marked as an index entry. This is the base service of index marks for {@link DocumentIndex} , {@link
  * ContentIndex} , and {@link UserIndex} .
  */
trait BaseIndexMark extends TextContent {
  /**
    * the string that will be inserted into the corresponding index. If AlternativeText is empty then the string that is marked by the {@link TextRange} is
    * inserted into the index.
    */
  var AlternativeText: java.lang.String
}

object BaseIndexMark {
  @scala.inline
  def apply(
    AlternativeText: java.lang.String,
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[TextContentAnchorType],
    TextWrap: WrapTextMode,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): BaseIndexMark = {
    val __obj = js.Dynamic.literal(AlternativeText = AlternativeText, Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, TextWrap = TextWrap, acquire = acquire, addEventListener = addEventListener, attach = attach, dispose = dispose, getAnchor = getAnchor, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[BaseIndexMark]
  }
}

