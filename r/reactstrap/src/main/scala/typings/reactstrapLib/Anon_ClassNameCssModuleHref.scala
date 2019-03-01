package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameCssModuleHref extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[reactLib.HTMLAnchorElement]] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_ClassNameCssModuleHref {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    href: java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[reactLib.HTMLAnchorElement] = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_ClassNameCssModuleHref = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (href != null) __obj.updateDynamic("href")(href)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameCssModuleHref]
  }
}

