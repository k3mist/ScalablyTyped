package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends ConnectionOptions {
  /**
    * Enabling both supportBigNumbers and bigNumberStrings forces big numbers (BIGINT and DECIMAL columns) to be
    * always returned as JavaScript String objects (Default: false). Enabling supportBigNumbers but leaving
    * bigNumberStrings disabled will return big numbers as String objects only when they cannot be accurately
    * represented with [JavaScript Number objects] (http://ecma262-5.com/ELS5_HTML.htm#Section_8.5)
    * (which happens when they exceed the [-2^53, +2^53] range), otherwise they will be returned as Number objects.
    * This option is ignored if supportBigNumbers is disabled.
    */
  var bigNumberStrings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10 seconds)
    */
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Force date types (TIMESTAMP, DATETIME, DATE) to be returned as strings rather then inflated into JavaScript
    * Date objects. Can be true/false or an array of type names to keep as strings. (Default: false)
    */
  var dateStrings: js.UndefOr[
    scala.Boolean | (js.Array[
      mysqlLib.mysqlLibStrings.TIMESTAMP | mysqlLib.mysqlLibStrings.DATETIME | mysqlLib.mysqlLibStrings.DATE
    ])
  ] = js.undefined
  /**
    * This will print all incoming and outgoing packets on stdout.
    * You can also restrict debugging to packet types by passing an array of types (strings) to debug;
    *
    * (Default: false)
    */
  var debug: js.UndefOr[scala.Boolean | js.Array[java.lang.String] | js.Array[Types]] = js.undefined
  /**
    * List of connection flags to use other than the default ones. It is also possible to blacklist default ones
    */
  var flags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The hostname of the database you are connecting to. (Default: localhost)
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allow connecting to MySQL instances that ask for the old (insecure) authentication method. (Default: false)
    */
  var insecureAuth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The source IP address to use for TCP connection
    */
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allow multiple mysql statements per query. Be careful with this, it exposes you to SQL injection attacks. (Default: false)
    */
  var multipleStatements: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The port number to connect to. (Default: 3306)
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * A custom query format function
    */
  var queryFormat: js.UndefOr[js.Function2[/* query */ java.lang.String, /* values */ js.Any, scala.Unit]] = js.undefined
  /**
    * The path to a unix domain socket to connect to. When used host and port are ignored
    */
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * object with ssl parameters or a string containing name of ssl profile
    */
  var ssl: js.UndefOr[
    java.lang.String | (nodeLib.tlsMod.SecureContextOptions with mysqlLib.Anon_RejectUnauthorized)
  ] = js.undefined
  /**
    * Stringify objects instead of converting to values. (Default: 'false')
    */
  var stringifyObjects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When dealing with big numbers (BIGINT and DECIMAL columns) in the database, you should enable this option
    * (Default: false)
    */
  var supportBigNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The timezone used to store local dates. (Default: 'local')
    */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Generates stack traces on errors to include call site of library entrance ("long stack traces"). Slight
    * performance penalty for most calls. (Default: true)
    */
  var trace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines if column values should be converted to native JavaScript types. It is not recommended (and may go away / change in the future)
    * to disable type casting, but you can currently do so on either the connection or query level. (Default: true)
    *
    * You can also specify a function (field: any, next: () => void) => {} to do the type casting yourself.
    *
    * WARNING: YOU MUST INVOKE the parser using one of these three field functions in your custom typeCast callback. They can only be called once.
    *
    * field.string()
    * field.buffer()
    * field.geometry()
    *
    * are aliases for
    *
    * parser.parseLengthCodedString()
    * parser.parseLengthCodedBuffer()
    * parser.parseGeometryValue()
    *
    * You can find which field function you need to use by looking at: RowDataPacket.prototype._typeCast
    */
  var typeCast: js.UndefOr[TypeCast] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    bigNumberStrings: js.UndefOr[scala.Boolean] = js.undefined,
    charset: java.lang.String = null,
    connectTimeout: scala.Int | scala.Double = null,
    database: java.lang.String = null,
    dateStrings: scala.Boolean | (js.Array[
      mysqlLib.mysqlLibStrings.TIMESTAMP | mysqlLib.mysqlLibStrings.DATETIME | mysqlLib.mysqlLibStrings.DATE
    ]) = null,
    debug: scala.Boolean | js.Array[java.lang.String] | js.Array[Types] = null,
    flags: js.Array[java.lang.String] = null,
    host: java.lang.String = null,
    insecureAuth: js.UndefOr[scala.Boolean] = js.undefined,
    localAddress: java.lang.String = null,
    multipleStatements: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    queryFormat: js.Function2[/* query */ java.lang.String, /* values */ js.Any, scala.Unit] = null,
    socketPath: java.lang.String = null,
    ssl: java.lang.String | (nodeLib.tlsMod.SecureContextOptions with mysqlLib.Anon_RejectUnauthorized) = null,
    stringifyObjects: js.UndefOr[scala.Boolean] = js.undefined,
    supportBigNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    timezone: java.lang.String = null,
    trace: js.UndefOr[scala.Boolean] = js.undefined,
    typeCast: TypeCast = null,
    user: java.lang.String = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bigNumberStrings)) __obj.updateDynamic("bigNumberStrings")(bigNumberStrings)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database)
    if (dateStrings != null) __obj.updateDynamic("dateStrings")(dateStrings.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(insecureAuth)) __obj.updateDynamic("insecureAuth")(insecureAuth)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (!js.isUndefined(multipleStatements)) __obj.updateDynamic("multipleStatements")(multipleStatements)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (queryFormat != null) __obj.updateDynamic("queryFormat")(queryFormat)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifyObjects)) __obj.updateDynamic("stringifyObjects")(stringifyObjects)
    if (!js.isUndefined(supportBigNumbers)) __obj.updateDynamic("supportBigNumbers")(supportBigNumbers)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    if (typeCast != null) __obj.updateDynamic("typeCast")(typeCast.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ConnectionConfig]
  }
}

