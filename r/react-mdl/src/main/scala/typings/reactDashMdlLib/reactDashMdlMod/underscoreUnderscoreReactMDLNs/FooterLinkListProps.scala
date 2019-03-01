package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterLinkListProps
  extends MDLHTMLAttributes
     with reactLib.reactMod.ReactNs.DOMAttributes[FooterLinkList] {
  var size: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object FooterLinkListProps {
  @scala.inline
  def apply(
    DOMAttributes: reactLib.reactMod.ReactNs.DOMAttributes[FooterLinkList] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    size: java.lang.String = null,
    title: java.lang.String = null
  ): FooterLinkListProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[FooterLinkListProps]
  }
}

