package typings
package azureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Database extends js.Object {
  var database: java.lang.String
  var password: java.lang.String
  var server: java.lang.String
  var user: java.lang.String
}

object Anon_Database {
  @scala.inline
  def apply(
    database: java.lang.String,
    password: java.lang.String,
    server: java.lang.String,
    user: java.lang.String
  ): Anon_Database = {
    val __obj = js.Dynamic.literal(database = database, password = password, server = server, user = user)
  
    __obj.asInstanceOf[Anon_Database]
  }
}

