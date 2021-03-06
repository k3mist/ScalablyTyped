package typings
package semanticDashUiDashSiteLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends js.Object {
  var settings: SiteSettings = js.native
  def apply(): semanticDashUiDashSiteLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashSiteLib.semanticDashUiDashSiteLibStrings.destroy): semanticDashUiDashSiteLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashSiteLib.semanticDashUiDashSiteLibStrings.setting, value: SiteSettings): semanticDashUiDashSiteLib.JQuery = js.native
  def apply(settings: SiteSettings): semanticDashUiDashSiteLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashSiteLib.semanticDashUiDashSiteLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashSiteLib.semanticDashUiDashSiteLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any
  ): semanticDashUiDashSiteLib.JQuery = js.native
}

