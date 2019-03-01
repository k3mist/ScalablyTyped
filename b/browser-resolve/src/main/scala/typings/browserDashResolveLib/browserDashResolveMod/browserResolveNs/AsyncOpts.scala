package typings
package browserDashResolveLib.browserDashResolveMod.browserResolveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOpts
  extends resolveLib.resolveMod.resolveNs.AsyncOpts
     with Opts

object AsyncOpts {
  @scala.inline
  def apply(
    basedir: java.lang.String = null,
    browser: java.lang.String = null,
    extensions: java.lang.String | js.Array[java.lang.String] = null,
    filename: java.lang.String = null,
    isFile: js.Function2[/* file */ java.lang.String, /* cb */ resolveLib.isFileCallback, scala.Unit] = null,
    moduleDirectory: java.lang.String | js.Array[java.lang.String] = null,
    modules: js.Any = null,
    `package`: js.Any = null,
    packageFilter: js.Function2[/* pkg */ js.Any, /* pkgfile */ java.lang.String, _] = null,
    pathFilter: js.Function3[
      /* pkg */ js.Any, 
      /* path */ java.lang.String, 
      /* relativePath */ java.lang.String, 
      java.lang.String
    ] = null,
    paths: java.lang.String | js.Array[java.lang.String] = null,
    preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    readFile: js.Function2[/* file */ java.lang.String, /* cb */ resolveLib.readFileCallback, scala.Unit] = null
  ): AsyncOpts = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (isFile != null) __obj.updateDynamic("isFile")(isFile)
    if (moduleDirectory != null) __obj.updateDynamic("moduleDirectory")(moduleDirectory.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (packageFilter != null) __obj.updateDynamic("packageFilter")(packageFilter)
    if (pathFilter != null) __obj.updateDynamic("pathFilter")(pathFilter)
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks)
    if (readFile != null) __obj.updateDynamic("readFile")(readFile)
    __obj.asInstanceOf[AsyncOpts]
  }
}

