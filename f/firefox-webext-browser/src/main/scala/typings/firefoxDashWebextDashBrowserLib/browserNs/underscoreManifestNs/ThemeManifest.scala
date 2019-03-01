package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contents of manifest.json for a static theme */
trait ThemeManifest extends js.Object {
  var default_locale: js.UndefOr[java.lang.String] = js.undefined
  var icons: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  var theme: ThemeType
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.undefined
}

object ThemeManifest {
  @scala.inline
  def apply(
    theme: ThemeType,
    default_locale: java.lang.String = null,
    icons: org.scalablytyped.runtime.NumberDictionary[java.lang.String] = null,
    theme_experiment: ThemeExperiment = null
  ): ThemeManifest = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (default_locale != null) __obj.updateDynamic("default_locale")(default_locale)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (theme_experiment != null) __obj.updateDynamic("theme_experiment")(theme_experiment)
    __obj.asInstanceOf[ThemeManifest]
  }
}

