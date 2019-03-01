package typings
package decompressLib.decompressMod.decompressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecompressOptions extends js.Object {
  /**
    * Filter out files before extracting
    */
  var filter: js.UndefOr[js.Function1[/* file */ File, scala.Boolean]] = js.undefined
  /**
    * Map files before extracting
    */
  var map: js.UndefOr[js.Function1[/* file */ File, File]] = js.undefined
  /**
    * Array of plugins to use.
    * Default: [decompressTar(), decompressTarbz2(), decompressTargz(), decompressUnzip()]
    */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Remove leading directory components from extracted files.
    * Default: 0
    */
  var strip: js.UndefOr[scala.Double] = js.undefined
}

object DecompressOptions {
  @scala.inline
  def apply(
    filter: js.Function1[/* file */ File, scala.Boolean] = null,
    map: js.Function1[/* file */ File, File] = null,
    plugins: js.Array[_] = null,
    strip: scala.Int | scala.Double = null
  ): DecompressOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (map != null) __obj.updateDynamic("map")(map)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (strip != null) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecompressOptions]
  }
}

