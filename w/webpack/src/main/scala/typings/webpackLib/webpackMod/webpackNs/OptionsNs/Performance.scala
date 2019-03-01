package typings
package webpackLib.webpackMod.webpackNs.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Performance extends js.Object {
  /** This property allows webpack to control what files are used to calculate performance hints. */
  var assetFilter: js.UndefOr[js.Function1[/* assetFilename */ java.lang.String, scala.Boolean]] = js.undefined
  /**
    * Turns hints on/off. In addition, tells webpack to throw either an error or a warning when hints are
    * found. This property is set to "warning" by default.
    */
  var hints: js.UndefOr[
    webpackLib.webpackLibStrings.warning | webpackLib.webpackLibStrings.error | webpackLib.webpackLibNumbers.`false`
  ] = js.undefined
  /**
    * An asset is any emitted file from webpack. This option controls when webpack emits a performance hint
    * based on individual asset size. The default value is 250000 (bytes).
    */
  var maxAssetSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * An entrypoint represents all assets that would be utilized during initial load time for a specific entry.
    * This option controls when webpack should emit performance hints based on the maximum entrypoint size.
    * The default value is 250000 (bytes).
    */
  var maxEntrypointSize: js.UndefOr[scala.Double] = js.undefined
}

object Performance {
  @scala.inline
  def apply(
    assetFilter: js.Function1[/* assetFilename */ java.lang.String, scala.Boolean] = null,
    hints: webpackLib.webpackLibStrings.warning | webpackLib.webpackLibStrings.error | webpackLib.webpackLibNumbers.`false` = null,
    maxAssetSize: scala.Int | scala.Double = null,
    maxEntrypointSize: scala.Int | scala.Double = null
  ): Performance = {
    val __obj = js.Dynamic.literal()
    if (assetFilter != null) __obj.updateDynamic("assetFilter")(assetFilter)
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (maxAssetSize != null) __obj.updateDynamic("maxAssetSize")(maxAssetSize.asInstanceOf[js.Any])
    if (maxEntrypointSize != null) __obj.updateDynamic("maxEntrypointSize")(maxEntrypointSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Performance]
  }
}

