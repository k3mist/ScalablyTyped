package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the constructor of Sequelize main class
  */
trait Options extends js.Object {
  /**
    * Print query execution time in milliseconds when logging SQL.
    *
    * Defaults to false
    */
  var benchmark: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the database
    */
  var database: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The version of the database. Most times, this is automatically detected and is not needed.
    *
    * Defaults to 0
    */
  var databaseVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default options for model definitions. See sequelize.define for options
    */
  var define: js.UndefOr[DefineOptions[_]] = js.undefined
  /**
    * The dialect of the database you are connecting to. One of mysql, postgres, sqlite, mariadb and mssql.
    *
    * Defaults to 'mysql'
    */
  var dialect: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If specified, load the dialect library from this path. For example, if you want to use pg.js instead of
    * pg when connecting to a pg database, you should specify 'pg.js' here
    */
  var dialectModulePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object of additional options, which are passed directly to the connection library
    */
  var dialectOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * The host of the relational database.
    *
    * Defaults to 'localhost'
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the default transaction isolation level. See `Sequelize.Transaction.ISOLATION_LEVELS` for possible
    * options.
    *
    * Defaults to 'REPEATABLE_READ'
    */
  var isolationLevel: js.UndefOr[TransactionIsolationLevel] = js.undefined
  /**
    * A function that gets executed everytime Sequelize would log something.
    *
    * Defaults to console.log
    */
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  /**
    * A flag that defines if native library shall be used or not. Currently only has an effect for postgres
    *
    * Defaults to false
    */
  var native: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A flag that defines if null values should be passed to SQL queries or not.
    *
    * Defaults to false
    */
  var omitNull: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * String based operator alias, default value is true which will enable all operators alias.
    * Pass object to limit set of aliased operators or false to disable completely.
    */
  var operatorsAliases: js.UndefOr[scala.Boolean | OperatorsAliases] = js.undefined
  /**
    * The password which is used to authenticate against the database.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Connection pool options
    */
  var pool: js.UndefOr[PoolOptions] = js.undefined
  /**
    * The port of the relational database.
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * The protocol of the relational database.
    *
    * Defaults to 'tcp'
    */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default options for sequelize.query
    */
  var query: js.UndefOr[QueryOptions] = js.undefined
  /**
    * Set to `false` to make table names and attributes case-insensitive on Postgres and skip double quoting of
    * them.
    *
    * Defaults to true
    */
  var quoteIdentifiers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use read / write replication. To enable replication, pass an object, with two properties, read and write.
    * Write should be an object (a single server for handling writes), and read an array of object (several
    * servers to handle reads). Each read/write server can have the following properties: `host`, `port`,
    * `username`, `password`, `database`
    *
    * Defaults to false
    */
  var replication: js.UndefOr[ReplicationOptions] = js.undefined
  /**
    * Set of flags that control when a query is automatically retried.
    */
  var retry: js.UndefOr[RetryOptions] = js.undefined
  /**
    * Default options for sequelize.set
    */
  var set: js.UndefOr[SetOptions] = js.undefined
  /**
    * Set to `true` to enable connecting over SSL.
    *
    * Defaults to undefined
    */
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only used by sqlite.
    *
    * Defaults to ':memory:'
    */
  var storage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default options for sequelize.sync
    */
  var sync: js.UndefOr[SyncOptions] = js.undefined
  /**
    * The timezone used when converting a date from the database into a JavaScript date. The timezone is also
    * used to SET TIMEZONE when connecting to the server, to ensure that the result of NOW, CURRENT_TIMESTAMP
    * and other time related functions have in the right timezone. For best cross platform performance use the
    * format
    * +/-HH:MM. Will also accept string versions of timezones used by moment.js (e.g. 'America/Los_Angeles');
    * this is useful to capture daylight savings time changes.
    *
    * Defaults to '+00:00'
    */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the default transaction type. See `Sequelize.Transaction.TYPES` for possible
    * options.
    *
    * Defaults to 'DEFERRED'
    */
  var transactionType: js.UndefOr[TransactionType] = js.undefined
  /**
    * Run built in type validators on insert and update,
    * e.g. validate that arguments passed to integer fields are integer-like.
    *
    * Defaults to false
    */
  var typeValidation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The username which is used to authenticate against the database.
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[scala.Boolean] = js.undefined,
    database: java.lang.String = null,
    databaseVersion: scala.Int | scala.Double = null,
    define: DefineOptions[_] = null,
    dialect: java.lang.String = null,
    dialectModulePath: java.lang.String = null,
    dialectOptions: js.Object = null,
    host: java.lang.String = null,
    isolationLevel: TransactionIsolationLevel = null,
    logging: scala.Boolean | js.Function = null,
    native: js.UndefOr[scala.Boolean] = js.undefined,
    omitNull: js.UndefOr[scala.Boolean] = js.undefined,
    operatorsAliases: scala.Boolean | OperatorsAliases = null,
    password: java.lang.String = null,
    pool: PoolOptions = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    query: QueryOptions = null,
    quoteIdentifiers: js.UndefOr[scala.Boolean] = js.undefined,
    replication: ReplicationOptions = null,
    retry: RetryOptions = null,
    set: SetOptions = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    storage: java.lang.String = null,
    sync: SyncOptions = null,
    timezone: java.lang.String = null,
    transactionType: TransactionType = null,
    typeValidation: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark)
    if (database != null) __obj.updateDynamic("database")(database)
    if (databaseVersion != null) __obj.updateDynamic("databaseVersion")(databaseVersion.asInstanceOf[js.Any])
    if (define != null) __obj.updateDynamic("define")(define)
    if (dialect != null) __obj.updateDynamic("dialect")(dialect)
    if (dialectModulePath != null) __obj.updateDynamic("dialectModulePath")(dialectModulePath)
    if (dialectOptions != null) __obj.updateDynamic("dialectOptions")(dialectOptions)
    if (host != null) __obj.updateDynamic("host")(host)
    if (isolationLevel != null) __obj.updateDynamic("isolationLevel")(isolationLevel.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native)
    if (!js.isUndefined(omitNull)) __obj.updateDynamic("omitNull")(omitNull)
    if (operatorsAliases != null) __obj.updateDynamic("operatorsAliases")(operatorsAliases.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(quoteIdentifiers)) __obj.updateDynamic("quoteIdentifiers")(quoteIdentifiers)
    if (replication != null) __obj.updateDynamic("replication")(replication)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (set != null) __obj.updateDynamic("set")(set)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (sync != null) __obj.updateDynamic("sync")(sync)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (transactionType != null) __obj.updateDynamic("transactionType")(transactionType.asInstanceOf[js.Any])
    if (!js.isUndefined(typeValidation)) __obj.updateDynamic("typeValidation")(typeValidation)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Options]
  }
}

