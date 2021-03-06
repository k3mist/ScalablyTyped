package typings
package firebirdLib.firebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents SQL transaction.
  *
  * @desc
  * To get instance of this object call @see startNewTransactionSync or @see startNewTransaction methods of @see Connection object.
  * Transaction objects may be reused after commit or rollback.
  */
trait Transaction extends js.Object {
  /*
    * A boolean readonly property indicating if this transaction is in started state.
    */
  var inTransaction: scala.Boolean
  /**
    * Asynchronous commit transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def commit(callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]): scala.Unit
  /**
    * Synchronously commits this transaction.
    *
    * @desc
    * Notes:
    * Transacation is automatically started before any query in context of this object
    * if this object does not have active transaction (check inTransaction property).
    * You also should note that DDL statements (altering database structure) are commited automatically.
    */
  def commitSync(): scala.Unit
  /**
    * Synchronously prepares SQL statement
    *
    * @param sql an SQL query to prepare.
    * @returns object in context of this transaction.
    */
  def prepareSync(sql: java.lang.String): FBStatement
  /**
    * Asynchronously executes query in context of this transaction.
    *
    * @param sql an SQL query to execute.
    * @param callback err - is error object or null, res - FBResult object.
    */
  def query(
    sql: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* res */ FBResult, scala.Unit]
  ): scala.Unit
  /**
    * Executes SQL query in context of this transaction. Returns FBResult object in case of success. Raises error otherwise.
    *
    * @param sql an SQL query to execute.
    */
  def querySync(sql: java.lang.String): scala.Unit
  /**
    * Asynchronously rollbacks transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def rollback(callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]): scala.Unit
  /**
    * Synchronously rollbacks transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    */
  def rollbackSync(): scala.Unit
  /**
    * Asynchronously starts new transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def start(callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]): scala.Unit
  /**
    * Synchronously starts transaction.
    *
    * @desc
    * The transaction should be not in started state before call to this method.
    * Read notes in @see commitSync() .
    * See @see inTransaction property.
    */
  def startSync(): scala.Unit
}

object Transaction {
  @scala.inline
  def apply(
    commit: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit] => scala.Unit,
    commitSync: () => scala.Unit,
    inTransaction: scala.Boolean,
    prepareSync: java.lang.String => FBStatement,
    query: (java.lang.String, js.Function2[/* err */ stdLib.Error | scala.Null, /* res */ FBResult, scala.Unit]) => scala.Unit,
    querySync: java.lang.String => scala.Unit,
    rollback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit] => scala.Unit,
    rollbackSync: () => scala.Unit,
    start: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit] => scala.Unit,
    startSync: () => scala.Unit
  ): Transaction = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction1(commit), commitSync = js.Any.fromFunction0(commitSync), inTransaction = inTransaction, prepareSync = js.Any.fromFunction1(prepareSync), query = js.Any.fromFunction2(query), querySync = js.Any.fromFunction1(querySync), rollback = js.Any.fromFunction1(rollback), rollbackSync = js.Any.fromFunction0(rollbackSync), start = js.Any.fromFunction1(start), startSync = js.Any.fromFunction0(startSync))
  
    __obj.asInstanceOf[Transaction]
  }
}

