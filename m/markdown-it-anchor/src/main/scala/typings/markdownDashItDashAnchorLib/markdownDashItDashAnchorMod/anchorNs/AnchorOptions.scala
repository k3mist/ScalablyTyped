package typings
package markdownDashItDashAnchorLib.markdownDashItDashAnchorMod.anchorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorOptions extends js.Object {
  var callback: js.UndefOr[
    js.Function2[
      /* token */ markdownDashItLib.libTokenMod.namespaced, 
      /* anchor_info */ AnchorInfo, 
      scala.Unit
    ]
  ] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var permalink: js.UndefOr[scala.Boolean] = js.undefined
  var permalinkBefore: js.UndefOr[scala.Boolean] = js.undefined
  var permalinkClass: js.UndefOr[java.lang.String] = js.undefined
  var permalinkHref: js.UndefOr[js.Function1[/* slug */ java.lang.String, java.lang.String]] = js.undefined
  var permalinkSymbol: js.UndefOr[java.lang.String] = js.undefined
  var renderPermalink: js.UndefOr[
    js.Function4[
      /* slug */ java.lang.String, 
      /* opts */ this.type, 
      /* state */ markdownDashItLib.libParserUnderscoreCoreMod.namespaced, 
      /* idx */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var slugify: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
}

object AnchorOptions {
  @scala.inline
  def apply(
    callback: js.Function2[
      /* token */ markdownDashItLib.libTokenMod.namespaced, 
      /* anchor_info */ AnchorInfo, 
      scala.Unit
    ] = null,
    level: scala.Int | scala.Double = null,
    permalink: js.UndefOr[scala.Boolean] = js.undefined,
    permalinkBefore: js.UndefOr[scala.Boolean] = js.undefined,
    permalinkClass: java.lang.String = null,
    permalinkHref: js.Function1[/* slug */ java.lang.String, java.lang.String] = null,
    permalinkSymbol: java.lang.String = null,
    renderPermalink: js.Function4[
      /* slug */ java.lang.String, 
      AnchorOptions, 
      /* state */ markdownDashItLib.libParserUnderscoreCoreMod.namespaced, 
      /* idx */ scala.Double, 
      scala.Unit
    ] = null,
    slugify: js.Function1[/* str */ java.lang.String, java.lang.String] = null
  ): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(permalink)) __obj.updateDynamic("permalink")(permalink)
    if (!js.isUndefined(permalinkBefore)) __obj.updateDynamic("permalinkBefore")(permalinkBefore)
    if (permalinkClass != null) __obj.updateDynamic("permalinkClass")(permalinkClass)
    if (permalinkHref != null) __obj.updateDynamic("permalinkHref")(permalinkHref)
    if (permalinkSymbol != null) __obj.updateDynamic("permalinkSymbol")(permalinkSymbol)
    if (renderPermalink != null) __obj.updateDynamic("renderPermalink")(renderPermalink)
    if (slugify != null) __obj.updateDynamic("slugify")(slugify)
    __obj.asInstanceOf[AnchorOptions]
  }
}

