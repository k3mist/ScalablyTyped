package typings
package gulpDashUglifyLib.gulpDashUglifyMod.GulpUglifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Pass an object to specify custom compressor options. Pass false to skip compression completely.
    */
  var compress: js.UndefOr[uglifyDashJsLib.uglifyDashJsMod.CompressOptions | scala.Boolean] = js.undefined
  /**
    * Pass false to skip mangling names.
    */
  var mangle: js.UndefOr[uglifyDashJsLib.uglifyDashJsMod.MangleOptions | scala.Boolean] = js.undefined
  /**
    * Pass if you wish to specify additional output options. The defaults are optimized for best compression.
    */
  var output: js.UndefOr[uglifyDashJsLib.uglifyDashJsMod.OutputOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compress: uglifyDashJsLib.uglifyDashJsMod.CompressOptions | scala.Boolean = null,
    mangle: uglifyDashJsLib.uglifyDashJsMod.MangleOptions | scala.Boolean = null,
    output: uglifyDashJsLib.uglifyDashJsMod.OutputOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (mangle != null) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[Options]
  }
}

