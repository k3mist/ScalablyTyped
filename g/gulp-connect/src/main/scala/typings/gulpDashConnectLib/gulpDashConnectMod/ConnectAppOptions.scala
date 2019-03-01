package typings
package gulpDashConnectLib.gulpDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectAppOptions extends js.Object {
  /** Whether or not to log debug messages. Defaults to false. */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /** File to serve if url results in a 404. Defaults to undefined */
  var fallback: js.UndefOr[java.lang.String] = js.undefined
  /** Host to bind server to. Defaults to localhost. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Options to pass to http.createServer (or false to disable https).
    * Defaults to false. When https is just set to true, then internally
    * some defaults will be used.
    */
  var https: js.UndefOr[scala.Boolean | nodeLib.httpsMod.ServerOptions] = js.undefined
  /** Value to pass into the serve-static's index option. See serve-static documentation for details. Defaults to true. */
  var index: js.UndefOr[scala.Boolean | java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Enable/disable livereload or set live reload options. Defaults to false. */
  var livereload: js.UndefOr[scala.Boolean | LiveReloadOptions] = js.undefined
  /** Middleware factory function which should return a list of connect handler functions . Defaults to () => []; */
  var middleware: js.UndefOr[MiddlewareFactory] = js.undefined
  /** The name of this server. Used in logs. Defaults to "Server". */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The connect webserver port. Defaults to 8080 */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** The root path. Defaults to directory with gulpfile */
  var root: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** A function to run custom initialization on the underlying http or https server */
  var serverInit: js.UndefOr[
    js.Function1[/* server */ nodeLib.httpMod.Server | nodeLib.httpsMod.Server, scala.Unit]
  ] = js.undefined
  /** Don't log any messages. Defaults to false. */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object ConnectAppOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    fallback: java.lang.String = null,
    host: java.lang.String = null,
    https: scala.Boolean | nodeLib.httpsMod.ServerOptions = null,
    index: scala.Boolean | java.lang.String | js.Array[java.lang.String] = null,
    livereload: scala.Boolean | LiveReloadOptions = null,
    middleware: MiddlewareFactory = null,
    name: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    root: java.lang.String | js.Array[java.lang.String] = null,
    serverInit: js.Function1[/* server */ nodeLib.httpMod.Server | nodeLib.httpsMod.Server, scala.Unit] = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): ConnectAppOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (host != null) __obj.updateDynamic("host")(host)
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (livereload != null) __obj.updateDynamic("livereload")(livereload.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware)
    if (name != null) __obj.updateDynamic("name")(name)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (serverInit != null) __obj.updateDynamic("serverInit")(serverInit)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[ConnectAppOptions]
  }
}

