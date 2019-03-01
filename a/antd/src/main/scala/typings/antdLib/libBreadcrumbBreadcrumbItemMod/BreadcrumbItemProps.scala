package typings
package antdLib.libBreadcrumbBreadcrumbItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbItemProps extends js.Object {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object BreadcrumbItemProps {
  @scala.inline
  def apply(
    href: java.lang.String = null,
    prefixCls: java.lang.String = null,
    separator: reactLib.reactMod.ReactNs.ReactNode = null
  ): BreadcrumbItemProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbItemProps]
  }
}

