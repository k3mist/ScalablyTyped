package typings
package gruntLib.gruntNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.util#grunt.util.spawn}
  */
trait ISpawnOptions extends js.Object {
  /**
    * An array of arguments to pass to the command.
    */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The command to execute. It should be in the system path.
    */
  var cmd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this value is set and an error occurs, it will be used as the value
    * and null will be passed as the error value.
    */
  var fallback: js.UndefOr[js.Any] = js.undefined
  /**
    * If specified, the same grunt bin that is currently running will be
    * spawned as the child command, instead of the "cmd" option.
    * Defaults to false.
    */
  var grunt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional options for the Node.js child_process spawn method.
    */
  var opts: js.UndefOr[gruntLib.Anon_Custom] = js.undefined
}

object ISpawnOptions {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    cmd: java.lang.String = null,
    fallback: js.Any = null,
    grunt: js.UndefOr[scala.Boolean] = js.undefined,
    opts: gruntLib.Anon_Custom = null
  ): ISpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (cmd != null) __obj.updateDynamic("cmd")(cmd)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (!js.isUndefined(grunt)) __obj.updateDynamic("grunt")(grunt)
    if (opts != null) __obj.updateDynamic("opts")(opts)
    __obj.asInstanceOf[ISpawnOptions]
  }
}

