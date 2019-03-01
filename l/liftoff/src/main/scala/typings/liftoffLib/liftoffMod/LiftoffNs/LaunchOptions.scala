package typings
package liftoffLib.liftoffMod.LiftoffNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchOptions extends js.Object {
  var completion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Don't search for a config, use the one provided.
    * **Note**: Liftoff will assume the current working directory is the directory containing the config file
    * unless an alternate location is explicitly specified using `cwd`.
    * @default null
    */
  var configPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change the current working directory for this launch. Relative paths are calculated against `process.cwd()`.
    * @default process.cwd()
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows you to force node or V8 flags during the launch.
    * This is useful if you need to make sure certain flags will always be enabled
    * or if you need to enable flags that don't show up in `opts.v8flags`
    * (as these flags aren't validated against opts.v8flags).
    * @default null
    */
  var forcedFlags: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (js.Function1[/* env */ LiftoffEnv, java.lang.String | js.Array[java.lang.String]])
  ] = js.undefined
  /**
    * A string or array of modules to attempt requiring from the local
    * working directory before invoking the launch callback.
    * @default null
    */
  var require: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
}

object LaunchOptions {
  @scala.inline
  def apply(
    completion: java.lang.String = null,
    configPath: java.lang.String = null,
    cwd: java.lang.String = null,
    forcedFlags: java.lang.String | js.Array[java.lang.String] | (js.Function1[/* env */ LiftoffEnv, java.lang.String | js.Array[java.lang.String]]) = null,
    require: java.lang.String | js.Array[_] = null
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    if (completion != null) __obj.updateDynamic("completion")(completion)
    if (configPath != null) __obj.updateDynamic("configPath")(configPath)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (forcedFlags != null) __obj.updateDynamic("forcedFlags")(forcedFlags.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
}

