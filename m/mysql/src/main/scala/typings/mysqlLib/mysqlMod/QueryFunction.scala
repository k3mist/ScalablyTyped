package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryFunction extends js.Object {
  def apply(options: java.lang.String): Query = js.native
  def apply(options: java.lang.String, callback: queryCallback): Query = js.native
  def apply(options: java.lang.String, values: js.Any): Query = js.native
  def apply(options: java.lang.String, values: js.Any, callback: queryCallback): Query = js.native
  def apply(options: QueryOptions): Query = js.native
  def apply(options: QueryOptions, callback: queryCallback): Query = js.native
  def apply(query: Query): Query = js.native
}

