package typings
package mssqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_READCOMMITTED extends js.Object {
  var READ_COMMITTED: IIsolationLevel
  var READ_UNCOMMITTED: IIsolationLevel
  var REPEATABLE_READ: IIsolationLevel
  var SERIALIZABLE: IIsolationLevel
  var SNAPSHOT: IIsolationLevel
}

object Anon_READCOMMITTED {
  @scala.inline
  def apply(
    READ_COMMITTED: IIsolationLevel,
    READ_UNCOMMITTED: IIsolationLevel,
    REPEATABLE_READ: IIsolationLevel,
    SERIALIZABLE: IIsolationLevel,
    SNAPSHOT: IIsolationLevel
  ): Anon_READCOMMITTED = {
    val __obj = js.Dynamic.literal(READ_COMMITTED = READ_COMMITTED, READ_UNCOMMITTED = READ_UNCOMMITTED, REPEATABLE_READ = REPEATABLE_READ, SERIALIZABLE = SERIALIZABLE, SNAPSHOT = SNAPSHOT)
  
    __obj.asInstanceOf[Anon_READCOMMITTED]
  }
}

