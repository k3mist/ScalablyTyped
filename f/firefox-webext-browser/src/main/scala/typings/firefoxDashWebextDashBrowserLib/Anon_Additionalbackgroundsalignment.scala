package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Additionalbackgroundsalignment extends js.Object {
  var additional_backgrounds_alignment: js.UndefOr[
    js.Array[
      firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs._ThemeTypeAdditionalBackgroundsAlignment
    ]
  ] = js.undefined
  var additional_backgrounds_tiling: js.UndefOr[
    js.Array[
      firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs._ThemeTypeAdditionalBackgroundsTiling
    ]
  ] = js.undefined
}

object Anon_Additionalbackgroundsalignment {
  @scala.inline
  def apply(
    additional_backgrounds_alignment: js.Array[
      firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs._ThemeTypeAdditionalBackgroundsAlignment
    ] = null,
    additional_backgrounds_tiling: js.Array[
      firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs._ThemeTypeAdditionalBackgroundsTiling
    ] = null
  ): Anon_Additionalbackgroundsalignment = {
    val __obj = js.Dynamic.literal()
    if (additional_backgrounds_alignment != null) __obj.updateDynamic("additional_backgrounds_alignment")(additional_backgrounds_alignment)
    if (additional_backgrounds_tiling != null) __obj.updateDynamic("additional_backgrounds_tiling")(additional_backgrounds_tiling)
    __obj.asInstanceOf[Anon_Additionalbackgroundsalignment]
  }
}

