package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a high level API to organize document templates */
trait TemplateAccess
  extends XDocumentTemplates
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XLocalizable

object TemplateAccess {
  @scala.inline
  def apply(
    Content: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    acquire: js.Function0[scala.Unit],
    addGroup: js.Function1[java.lang.String, scala.Boolean],
    addTemplate: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Boolean],
    getContent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeGroup: js.Function1[java.lang.String, scala.Boolean],
    removeTemplate: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    renameGroup: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    renameTemplate: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Boolean],
    setLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    storeTemplate: js.Function3[java.lang.String, java.lang.String, XStorable, scala.Boolean],
    update: js.Function0[scala.Unit]
  ): TemplateAccess = {
    val __obj = js.Dynamic.literal(Content = Content, Locale = Locale, acquire = acquire, addGroup = addGroup, addTemplate = addTemplate, getContent = getContent, getLocale = getLocale, queryInterface = queryInterface, release = release, removeGroup = removeGroup, removeTemplate = removeTemplate, renameGroup = renameGroup, renameTemplate = renameTemplate, setLocale = setLocale, storeTemplate = storeTemplate, update = update)
  
    __obj.asInstanceOf[TemplateAccess]
  }
}

