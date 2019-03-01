package typings
package umzugLib.umzugMod.umzugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In order to keep track of already executed tasks, umzug logs successfully executed migrations.
  * This is done in order to allow rollbacks of tasks. This is the interface these `Storages` must
  * follow.
  */
trait Storage extends js.Object {
  /** Gets list of executed migrations. */
  def executed(): js.Promise[js.Array[nodeLib.String]]
  /**
    * Logs migration to be considered as executed.
    *
    * @param migrationName - Name of the migration to be logged.
    */
  def logMigration(migrationName: java.lang.String): js.Promise[scala.Unit]
  /**
    * Unlogs migration to be considered as pending.
    *
    * @param migrationName - Name of the migration to be unlogged.
    */
  def unlogMigration(migrationName: java.lang.String): js.Promise[scala.Unit]
}

object Storage {
  @scala.inline
  def apply(
    executed: js.Function0[js.Promise[js.Array[nodeLib.String]]],
    logMigration: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    unlogMigration: js.Function1[java.lang.String, js.Promise[scala.Unit]]
  ): Storage = {
    val __obj = js.Dynamic.literal(executed = executed, logMigration = logMigration, unlogMigration = unlogMigration)
  
    __obj.asInstanceOf[Storage]
  }
}

